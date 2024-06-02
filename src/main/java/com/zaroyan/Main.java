package com.zaroyan;

/**
 * @author Zaroyan
 */
public class Main {

    // Тестирование
    public static void main(String[] args) {
        StringBuilderRealization csb = new StringBuilderRealization();
        csb.append("Hello");
        System.out.println(csb); // Output: Hello

        csb.append(" World");
        System.out.println(csb); // Output: Hello World

        csb.undo();
        System.out.println(csb); // Output: Hello
    }
}