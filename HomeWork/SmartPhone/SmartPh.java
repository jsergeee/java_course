package HomeWork.SmartPhone;

public class SmartPh {
    String brand, os, color;
    int ram, storage;

    public SmartPh(String brand, int ram, int storage, String os, String color) {
        this.brand = brand;
        this.ram = ram;
        this.storage = storage;
        this.os = os;
        this.color = color;
    }

    @Override
    public String toString() {
        return String.format("%s %d %d %s %s", brand, ram, storage, os, color);

    }
    public String getBrand() {
        return brand;
    }

    public int getRam() {
        return ram;
    }

    public int getStorage() {
        return storage;
    }

    public String getOs() {
        return os;
    }

    public String getColor() {
        return color;
    }
    }
