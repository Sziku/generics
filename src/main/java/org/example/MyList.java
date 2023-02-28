package org.example;

public interface MyList<T> {

    void add(T item);

    T get(int index);

    boolean contains(T item);
}
