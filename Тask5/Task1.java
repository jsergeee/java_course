package Тask5;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Task1 {
    public static void main(String[]args){
//        HashMap<Integer, String> map = new HashMap<>();
//        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(1234567895, "Иванов");
        map.put(234525895, "Петров");
        map.put(234525896, "Васильев");
        map.put(234525898, "Петрова");
        map.put(1, "Сидоров");

//        HashMap<Integer, String> map1 = Map.of(
//                1, "Иванов"
//                2,
//        )



        System.out.print(map);
        }

    }
