//import java.io.*;
//import java.util.ArrayList;
//import java.util.List;
//
//public class Task4_1 {
//    public static void main(String[] args) {
//        // Укажите правильный путь к директории и выходному файлу
//        writeToFile("lesson2.txt", "C:\\Users\\User\\IdeaProjects\\java_course");
//    }
//
//    public static List<String> readDir(String path) throws RuntimeException {
//        System.out.println("Path: " + path);
//        File folder = new File(path);
//        if (!folder.isDirectory()) {
//            throw new RuntimeException("File is not directory");
//        }
//        File[] files = folder.listFiles();
//        List<String> result = new ArrayList<>();
//
//        if (files != null) {
//            for (File file : files) {
//                String name = file.getName();
//                result.add(name);
//            }
//        }
//
//        return result;
//    }
//
//    // Запись в файл
//    private static void writeToFile(String pathOut, String pathIn) {
//        List<String> list = readDir(pathIn);
//        try (FileWriter fw = new FileWriter(pathOut)) {
//            for (String s : list) {
//                fw.write(s + "\n");
//                fw.flush();
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}
