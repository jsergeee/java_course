import com.sun.source.tree.BreakTree;

public class Homework7 {

    // Класс IntegerArray должен быть на уровне класса Homework7, а не внутри метода main
    static class IntegerArray {

        private int[] array;

        // Конструктор, который создает массив заданного размера и заполняет его значениями
        public IntegerArray(int size) {
            array = new int[size];
            for (int i = 0; i < array.length; i++) {
                array[i] = i + 1;
            }
        }

        // Метод для вывода значений массива на экран
        public void printArray() {
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }
        }
    }

    // Основной метод для тестирования
    public static void main(String[] args) {
        IntegerArray integerArray = new IntegerArray(20);
        integerArray.printArray();
    }

//
//    public static void main (String[] args){
//        class IntegerArray {
//
//            private int[] array;
//
//            // Конструктор, который создает массив заданного размера и заполняет его значениями
//            public IntegerArray(int size) {
//                array = new int[size];
//                for (int i = 0; i < array.length; i++) {
//                    array[i] = i + 1;
//                }
//            }
//
//            // Метод для вывода значений массива на экран
//            public void printArray() {
//                for (int i = 0; i < array.length; i++) {
//                    System.out.println(array[i]);
//                }
//            }
//
//            // Основной метод для тестирования
//            public static void main(String[] args) {
//                IntegerArray integerArray = new IntegerArray(10);
//                integerArray.printArray();
//            }
//        }
//
//
//    }
}
