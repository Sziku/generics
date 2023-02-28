package org.example;
/*1. Create a class `IntBox`, that serves as a container for an `int` value.
        2. Create a class `StringBox`, that does the same for a `String` value.
        3. Create a class, that lets you put a value of an object of any type inside it.

        What are the advantages, disadvantages of this solution?
        Have we seen a different solution to a similar problem?
        4. Implement a generic Box class, similar to the IntBox and StringBox classes.
        5. Implement a generic class Pair, that can store a pair of two object instances of the same type.
        6. Implement a generic MyArrayList class, wich implements below MyList inteface.
        7. Create a generic NumberBox, that only lets you store a numeric object: Integer, Float, Short, or Double, Byte, etc...
        8. Create a method, that expects a NumberBox. Can you do that?
        */


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ObjectBox ob = new ObjectBox(new Object());
        ObjectBox ob2 = new ObjectBox("text");
        ObjectBox ob3 = new ObjectBox(123);

        Box<String> box = new Box<>("valami");
        String text = box.getData();
        //int num = box.getData();

        Box box2 = new Box(123);
        //int num = box2.getData();


        System.out.println(box.getData());

        Pair<String> pair1 = new Pair<>("text1","text2");

        NumberBox<Integer> nb1 = new NumberBox<>(123);
        NumberBox<Double> nb2 = new NumberBox<>(123.0);
        NumberBox<Number> nb3 = new NumberBox<>(123.0);

        //nb3 = nb1;

        NumberBox<? extends Number> nb4 = new NumberBox<>(3.5);
        nb4 = new NumberBox<Integer>(12);
        Number nb4Data = nb4.getData();
        List<Number> list = new ArrayList<>(){{add(2); add(3);}};
        System.out.println(list);
       // addNumbers(list);
        System.out.println(list);

    }

    public static void addNumbers (List<Integer> list){
        list.add(2);
        list.add(3);
        list.add(4);
    }
}
