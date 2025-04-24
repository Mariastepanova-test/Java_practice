package by.homework.java.task20;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Method {
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
}
