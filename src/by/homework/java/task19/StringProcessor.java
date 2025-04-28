package by.homework.java.task19;

public interface StringProcessor {
    String process(String input);
}

class Lambda {
    public static void main(String[] args) {
        StringProcessor toUpperCase = string -> string.toUpperCase();
        System.out.println(toUpperCase.process("Hello!"));
    }

}



