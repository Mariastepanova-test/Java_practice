package by.homework.java.task20;

import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.concurrent.*;

class FileGeneratorTask implements Callable<List<String>> {

    private static final Random random = new Random();

    @Override
    public List<String> call() throws Exception {
        String threadName = Thread.currentThread().getName();
        List<String> filenames = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            String filename = "file_" + UUID.randomUUID() + ".txt";
            Path path = Paths.get(filename);

            List<String> lines = new ArrayList<>();
            for (int j = 0; j < 10; j++) {
                lines.add(generateRandomString(10));
            }

            Files.write(path, lines);
            filenames.add(filename);

            int sleepTime = 1000 + random.nextInt(2000);
            System.out.printf("[%s] Создан файл: %s, засыпает на %d мс%n", threadName, filename, sleepTime);
            Thread.sleep(sleepTime);
        }

        System.out.printf("[%s] Задача завершена. Создано файлов: %d%n", threadName, filenames.size());
        return filenames;
    }

    private int length;

    private String generateRandomString() {
        return generateRandomString(0);
    }

    private String generateRandomString(int length) {
        this.length = length;
        String chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append(chars.charAt(random.nextInt(chars.length())));
        }
        return sb.toString();
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        List<Future<List<String>>> futures = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            futures.add(executor.submit(new FileGeneratorTask()));
        }

        for (Future<List<String>> future : futures) {
            List<String> result = future.get();
            System.out.println("Имена файлов: " + result);
        }
        executor.shutdown();
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}