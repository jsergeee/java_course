//работа с файлами

import java.io.*;

public class task3 {
    public static void main(String[] args) throws IOException {
//        writeToFile("task3.txt", "иди на хой1\nвернись обратно");
        readFile("1.txt");
    }
//    private static void  writeToFile(String path, String content){
////        File file = new File(path);
//        FileWriter fw = null;
//
//        try {
//            fw = new FileWriter(path);
//            fw.write(content);
//            fw.flush();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        } finally {
//            try {
//                fw.close();
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }

    //Сокращенный код запси файла
    private static void  writeToFile(String path, String content){

           try(FileWriter fw = new FileWriter(path)) {
            fw.write(content);
            fw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);


        }
    }
    //Чтение файла
    private static String readFile(String path) {
        String line;

        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return line;
    }
}
