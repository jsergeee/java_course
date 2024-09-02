package OOP.Task;

public class Product {
    String title;
    int whole, price, unit, quantity;


    @Override
    public String toString() {
        return String.format("%s %s %s %s %d", title, whole, price, unit, quantity);
    }



}
