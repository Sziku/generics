package org.example;

public class MyArrayList<T> implements MyList<T>{
    private T[] array;

    public MyArrayList() {
        array = (T[]) new Object[10];
    }

    int size;

    @Override
    public void add(T item) {
        array[size++] = item;
    }

    @Override
    public T get(int index) {
        return array[index];
    }

    @Override
    public boolean contains(T item) {
        for(T element : array){
            if(element.equals(item)){
                return true;
            }
        }
        return false;
    }

}
