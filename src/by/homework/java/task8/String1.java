package by.homework.java.task8;


public class String1 {
    public static void main(String[] args) {
        String Str1 = "Я люблю JAVA";
        String Str2 = "JAVA";

        String result = processStrings(Str1, Str2);
        System.out.println("Результат: " + result);
    }

    public static String processStrings(String Str1, String Str2) {
        if (Str1.endsWith(Str2)) {
            int startIndex = Str1.indexOf(Str2);
            return Str1.substring(0, startIndex).trim();
        } else {
            return Str1.toUpperCase();
        }
    }
}
