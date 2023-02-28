package org.example;

public class NumberBox<T extends Number> {

    private final T data;

    public NumberBox(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }
}
