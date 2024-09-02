package HomeWork.Various;

import java.io.*;

public class FileWrit {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader("5.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);

            }

        }


    }
}
