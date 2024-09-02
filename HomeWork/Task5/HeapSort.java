import java.util.Arrays;

class HeapSort {

    // Метод для построения кучи из массива
    public static void buildTree(int[] tree, int sortLength) {
        // Построение кучи начинается с последнего узла, имеющего детей
        for (int i = sortLength / 2 - 1; i >= 0; i--) {
            heapify(tree, sortLength, i);
        }
    }

    // Метод для поддержания свойства кучи
    private static void heapify(int[] tree, int sortLength, int i) {
        int largest = i; // Инициализируем наибольший элемент как корень
        int left = 2 * i + 1; // Левый дочерний узел
        int right = 2 * i + 2; // Правый дочерний узел

        // Если левый дочерний элемент больше корня
        if (left < sortLength && tree[left] > tree[largest]) {
            largest = left;
        }

        // Если правый дочерний элемент больше, чем наибольший на данный момент
        if (right < sortLength && tree[right] > tree[largest]) {
            largest = right;
        }

        // Если наибольший элемент не корень
        if (largest != i) {
            // Обмен корня с наибольшим элементом
            int swap = tree[i];
            tree[i] = tree[largest];
            tree[largest] = swap;

            // Рекурсивно приводим кучу в порядок
            heapify(tree, sortLength, largest);
        }
    }

    // Метод для сортировки массива с использованием кучи
    public static void heapSort(int[] sortArray, int sortLength) {
        // Построение кучи
        buildTree(sortArray, sortLength);

        // Один за другим извлекаем элементы из кучи
        for (int i = sortLength - 1; i >= 0; i--) {
            // Перемещение текущего корня в конец
            int temp = sortArray[0];
            sortArray[0] = sortArray[i];
            sortArray[i] = temp;

            // Вызов heapify на уменьшенной куче
            heapify(sortArray, i, 0);
        }
    }

    public static void main(String[] args) {
        // Пример массива для сортировки
        int[] array = {5, 8, 12, 3, 6, 9};

        System.out.println("Initial array:");
        System.out.println(Arrays.toString(array));

        // Выполнение сортировки
        heapSort(array, array.length);

        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(array));
    }
}
