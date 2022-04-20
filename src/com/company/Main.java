package com.company;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	List<Integer> arrayList= new ArrayList<>();
    List<Integer> linkedList = new LinkedList<>();

        Random random = new Random();

        LocalDateTime start = LocalDateTime.now();

    for (int i=0; i<100000; i++){
        arrayList.add(random.nextInt(1000));
    }
        LocalDateTime finish = LocalDateTime.now();
        System.out.println("Time interval for creating ArrayList:");
        System.out.println(ChronoUnit.MILLIS.between(start,finish ));

        start = LocalDateTime.now();
        for (int i=0; i<100000; i++){
            linkedList.add(random.nextInt(1000));
    }
        finish = LocalDateTime.now();
        System.out.println("Time interval for creating LinkedList:");
        System.out.println(ChronoUnit.MILLIS.between(start,finish ));


        start = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            arrayList.add(0,random.nextInt(1000));

        }
        finish = LocalDateTime.now();
        System.out.println("Time interval for inserting new elements at the beginning for ArrayList:");
        System.out.println(ChronoUnit.MILLIS.between(start,finish ));

        start = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            linkedList.add(0,random.nextInt(1000));

        }
        finish = LocalDateTime.now();
        System.out.println("Time interval for inserting new elements at the beginning for LinkedList:");
        System.out.println(ChronoUnit.MILLIS.between(start,finish ));

        start = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            arrayList.add(500,random.nextInt(1000));

        }
        finish = LocalDateTime.now();
        System.out.println("Time interval for inserting new elements in the middle for ArrayList:");
        System.out.println(ChronoUnit.MILLIS.between(start,finish ));

        start = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            linkedList.add(500,random.nextInt(1000));

        }
        finish = LocalDateTime.now();
        System.out.println("Time interval for inserting new elements in the middle for LinkedList:");
        System.out.println(ChronoUnit.MILLIS.between(start,finish ));

        start = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            arrayList.add(1000,random.nextInt(1000));

        }
        finish = LocalDateTime.now();
        System.out.println("Time interval for inserting new elements in the end for ArrayList:");
        System.out.println(ChronoUnit.MILLIS.between(start,finish ));

        start = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            linkedList.add(1000,random.nextInt(1000));

        }
        finish = LocalDateTime.now();
        System.out.println("Time interval for inserting new elements in the end for LinkedList:");
        System.out.println(ChronoUnit.MILLIS.between(start,finish ));

        start = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            arrayList.set(0,random.nextInt(1000));

        }
        finish = LocalDateTime.now();
        System.out.println("Time interval for updating new elements in the beginning for ArrayList:");
        System.out.println(ChronoUnit.MILLIS.between(start,finish ));

        start = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            linkedList.set(0,random.nextInt(1000));

        }
        finish = LocalDateTime.now();
        System.out.println("Time interval for updating new elements in the beginning for LinkedList:");
        System.out.println(ChronoUnit.MILLIS.between(start,finish ));

        start = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            arrayList.set(500,random.nextInt(1000));

        }
        finish = LocalDateTime.now();
        System.out.println("Time interval for updating new elements in the middle for ArrayList:");
        System.out.println(ChronoUnit.MILLIS.between(start,finish ));

        start = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            linkedList.set(500,random.nextInt(1000));

        }
        finish = LocalDateTime.now();
        System.out.println("Time interval for updating new elements in the middle for LinkedList:");
        System.out.println(ChronoUnit.MILLIS.between(start,finish ));

        start = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            arrayList.set(1000,random.nextInt(1000));

        }
        finish = LocalDateTime.now();
        System.out.println("Time interval for updating new elements in the end for ArrayList:");
        System.out.println(ChronoUnit.MILLIS.between(start,finish ));

        start = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            linkedList.set(1000,random.nextInt(1000));

        }
        finish = LocalDateTime.now();
        System.out.println("Time interval for updating new elements in the end for LinkedList:");
        System.out.println(ChronoUnit.MILLIS.between(start,finish ));

        start = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            arrayList.remove(5);

        }
        finish = LocalDateTime.now();
        System.out.println("Time interval for deleting new element in the beginning for ArrayList:");
        System.out.println(ChronoUnit.MILLIS.between(start,finish ));

        start = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            linkedList.remove(5);

        }
        finish = LocalDateTime.now();
        System.out.println("Time interval for deleting new element in the beginning for LinkedList:");
        System.out.println(ChronoUnit.MILLIS.between(start,finish ));

        start = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            arrayList.remove(505);

        }
        finish = LocalDateTime.now();
        System.out.println("Time interval for deleting new element in the middle for ArrayList:");
        System.out.println(ChronoUnit.MILLIS.between(start,finish ));

        start = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            linkedList.remove(505);

        }
        finish = LocalDateTime.now();
        System.out.println("Time interval for deleting new element in the middle for LinkedList:");
        System.out.println(ChronoUnit.MILLIS.between(start,finish ));

        start = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            arrayList.remove(999);

        }
        finish = LocalDateTime.now();
        System.out.println("Time interval for deleting new element in the end for ArrayList:");
        System.out.println(ChronoUnit.MILLIS.between(start,finish ));

        start = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            linkedList.remove(999);

        }
        finish = LocalDateTime.now();
        System.out.println("Time interval for deleting new elements in the end for LinkedList:");
        System.out.println(ChronoUnit.MILLIS.between(start,finish ));
    }

}

