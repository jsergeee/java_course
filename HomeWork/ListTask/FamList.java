


import HomeWork.ListTask.ListArray;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class FamList {



    }
    public static void main (String []args){

        List<ListArray> list = new ArrayList<>(Arrays.asList(
                new ListArray("Serg","Yakov",46,"megafon"),
                new ListArray("Gulmira", "Yakovenko",45,"IP")
        ));
        for (int i = 0; i < list.size(); i++) {
            ListArray person = list.get(i);
//            System.out.println("№" + (i + 1) + ": " + person);
        }
        List<Integer> kreatlist = new ArrayList<>();

        // Добавление элементов в список с использованием цикла
        for (int i = 0; i <= 10; i++) {
            kreatlist.add(i + 1);
        }
//        System.out.println("Список: " + kreatlist);

        List<Integer> a = new ArrayList<>(Arrays.asList(10,20,30,40));
//        System.out.println(a);

        List<Integer> b = new ArrayList<>();
        b.add(100);
        b.add(15);
        b.add(35);
//        System.out.println(b);

        List<Integer> c = new ArrayList<>(Arrays.asList(10,20,30,40));
        c.add(50);
//        System.out.println(c);
//        System.out.println(c.size());

        List<Integer> d = IntStream.range(1,10).map(i -> i * 1).boxed().collect(Collectors.toList());
        System.out.println("D" + d);
    }

