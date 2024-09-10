package OOP.Home_Work.Task_1;

public class Main {
    public static void main(String[] args) {
        // Создаем экземпляры горячих напитков
        HotDrinkWithTemperature coffee = new HotDrinkWithTemperature("Coffee", 250, 80);
        HotDrinkWithTemperature tea = new HotDrinkWithTemperature("Tea", 200, 90);

        // Создаем автомат и добавляем напитки
        HotDrinkMachine machine = new HotDrinkMachine();
        machine.addDrink(coffee);
        machine.addDrink(tea);

        // Запрашиваем напитки
        HotDrink obtainedDrink1 = machine.getProduct("Coffee", 250, 80);
        HotDrink obtainedDrink2 = machine.getProduct("Tea", 200, 90);

        // Выводим результаты
        System.out.println("Obtained drink 1: " + obtainedDrink1);
        System.out.println("Obtained drink 2: " + obtainedDrink2);
    }
}
