package OOP.Home_Work.Task_1;

import OOP.Home_Work.Task_1.HotDrink;

import java.util.ArrayList;
import java.util.List;


// Интерфейс VendingMachine
interface VendingMachine {
    HotDrink getProduct(String name, int volume, int temperature);
}


// Класс HotDrinkMachine
public class HotDrinkMachine implements VendingMachine {
    private List<HotDrinkWithTemperature> drinks = new ArrayList<>();

    public void addDrink(HotDrinkWithTemperature drink) {
        drinks.add(drink);
    }

    @Override
    public HotDrink getProduct(String name, int volume, int temperature) {
        for (HotDrinkWithTemperature drink : drinks) {
            if (drink.getName().equals(name) && drink.getVolume() == volume && drink.getTemperature() == temperature) {
                return drink;
            }
        }
        return null; // Если напиток не найден
    }
}
