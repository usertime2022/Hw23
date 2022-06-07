package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
    /** Array */
        int[] array = new int[10];
        for (int i = 1; i < array.length; i++) {
            array[i] = random.nextInt(0, 2);
        }
        System.out.println("Массив сорттолгонго чейин:");
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("Массив сорттолгондон кийин:");
        System.out.println(Arrays.toString(array));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();

    /** ArrayList */
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrayList.add(random.nextInt(2));
        }
        System.out.println("ArrayList сорттолгонго чейин:");
        System.out.println(arrayList);

        Collections.sort(arrayList, Main.compareArrayList);
        System.out.println("ArrayList сорттолгондон кийин:");
        System.out.println(arrayList);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();


    /** LinkedList */
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            linkedList.add(random.nextInt(2));
        }
        System.out.println("LinkedList сорттолгонго чейин:");
        System.out.println(linkedList);

        Collections.sort(linkedList, Main.compareLinkedList);
        System.out.println("LinkedList сорттолгондон кийин:");
        System.out.println(linkedList);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();
    }

        public static Comparator<Integer> compareArrayList = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };
        public static Comparator<Integer> compareLinkedList = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };
    }
