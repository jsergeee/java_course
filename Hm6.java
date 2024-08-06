import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class Hm6 {

    static class BubbleSort {
        private static File log;
        private static FileWriter fileWriter;

        public static void sort(int[] mas) {
            try {
                log = new File("log.txt");
                fileWriter = new FileWriter(log);
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");

                for (int i = 0; i < mas.length; i++) {
                    boolean swapped = false;
                    for (int j = 0; j < mas.length - i - 1; j++) {
                        if (mas[j] > mas[j + 1]) {
                            int temp = mas[j];
                            mas[j] = mas[j + 1];
                            mas[j + 1] = temp;
                            swapped = true;
                        }
                    }

                    // Записываем текущее состояние массива в лог
                    String currentTime = dateFormat.format(new Date());
                    String arrayString = Arrays.toString(mas);
                    fileWriter.write(currentTime + " " + arrayString + "\n");

                    if (!swapped) {
                        break;
                    }
                }

                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {5, 3, 8, 4, 2};
        BubbleSort.sort(array);
    }
}
