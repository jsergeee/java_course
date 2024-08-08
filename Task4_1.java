//import java.io.*;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.SplittableRandom;
//
//public class Task4_1 {
//    public static void main (String[] args){
//        writeToFile("lesson2.txt","C:\Users\1\Обучение_в _GB\java_course\seminar1\java_course
//
//     public static List<String> readDir(String path) throws RuntimeException {
//         File folder = new File(path);
//         if(!folder.isDirectory()){
////             return null;//вместо return нужно написать метод ниже
//             throw new RuntimeException("File is not directory");
//         }
//         File[] files = folder.listFiles();
//         List<String> result = new ArrayList<>(); //создаем строку для хранения переменнойFile[] files = folder.listFiles();
//
//         for (File file : files) {
//             String name = file.getName();
//            result.add(name);
//         }
//
//         return result;
//
//     }
////запись в файл
//    private static void  writeToFile(String pathIn, String pathOut){
//        List<String> list =  readDir(pathOut);
//        try(FileWriter fw = new FileWriter(pathIn)){
//            for (String s : list){
//                fw.write(s + "\n");
//                fw.flush();
//            }
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//
//    }
//
//
//}
//
