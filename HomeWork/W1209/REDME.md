Пример 3: Полиморфизм с использованием абстрактных классов

```java
// Абстрактный класс
abstract class Animal {
    abstract void makeSound();
}

// Производные классы
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Bark");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Meow");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.makeSound(); // вызывает метод makeSound из класса Dog
        cat.makeSound(); // вызывает метод makeSound из класса Cat
    }
}
```

Здесь класс `Animal` является абстрактным и определяет абстрактный метод `makeSound`, который должны реализовать производные классы `Dog` и `Cat`. При создании объектов `dog` и `cat` как типа `Animal`, вызов метода `makeSound` автоматически переходит к конкретным реализациям в классах `Dog` и `Cat` соответственно.
