import java.util.LinkedList;

class MyQueueInt {
    private LinkedList<Integer> elements = new LinkedList<>();

    // Метод для добавления элемента в очередь
    public void enqueue(int element) {
        elements.addLast(element);
    }

    // Метод для удаления элемента из очереди
    public int dequeue() {
        if (elements.isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return elements.removeFirst();
    }

    // Метод для получения первого элемента в очереди без его удаления
    public int first() {
        if (elements.isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return elements.getFirst();
    }

    // Метод для получения всех элементов очереди
    public LinkedList<Integer> getElements() {
        return new LinkedList<>(elements); // Возвращаем копию, чтобы защитить исходные данные
    }
}

// Класс для тестирования
public class Printer {
    public static void main(String[] args) {
        MyQueueInt queue = new MyQueueInt();

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            queue.enqueue(1);
            queue.enqueue(10);
            queue.enqueue(15);
            queue.enqueue(5);
        } else {
            queue.enqueue(Integer.parseInt(args[0]));
            queue.enqueue(Integer.parseInt(args[1]));
            queue.enqueue(Integer.parseInt(args[2]));
            queue.enqueue(Integer.parseInt(args[3]));
        }

        System.out.println(queue.getElements());

        System.out.println(queue.dequeue());
        queue.dequeue();
        System.out.println(queue.getElements());

        System.out.println(queue.first());


        System.out.println(queue.dequeue());  // Удаляет и выводит первый элемент
        queue.dequeue();  // Удаляет второй элемент
        System.out.println(queue.getElements());  // Выводит оставшуюся очередь после двух удалений


    }
}
