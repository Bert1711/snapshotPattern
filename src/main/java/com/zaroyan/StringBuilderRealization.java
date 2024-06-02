package com.zaroyan;

import java.util.Stack;

/**
 * @author Zaroyan
 */
public class StringBuilderRealization {

    private StringBuilder stringBuilder;
    private Stack<String> stateStack;

    public StringBuilderRealization() {
        this.stringBuilder = new StringBuilder();
        this.stateStack = new Stack<>();
        saveSnapshot(); // Сохраняем начальное состояние
    }

    public StringBuilderRealization append(String str) {
        saveSnapshot(); // Сохраняем состояние перед изменением
        stringBuilder.append(str);
        return this;
    }

    public StringBuilderRealization delete(int start, int end) {
        saveSnapshot(); // Сохраняем состояние перед изменением
        stringBuilder.delete(start, end);
        return this;
    }

    public StringBuilderRealization insert(int offset, String str) {
        saveSnapshot(); // Сохраняем состояние перед изменением
        stringBuilder.insert(offset, str);
        return this;
    }

    public StringBuilderRealization replace(int start, int end, String str) {
        saveSnapshot(); // Сохраняем состояние перед изменением
        stringBuilder.replace(start, end, str);
        return this;
    }

    public int length() {
        return stringBuilder.length();
    }

    public String toString() {
        return stringBuilder.toString();
    }

    private void saveSnapshot() {
        stateStack.push(stringBuilder.toString());
    }

    public void undo() {
        if (!stateStack.isEmpty()) {
            stringBuilder = new StringBuilder(stateStack.pop());
        }
    }
}