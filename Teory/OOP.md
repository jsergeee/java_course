Принципы объектно-ориентированного программирования (ООП) в Java включают следующие основные концепции:

1. **Инкапсуляция**: Это принцип, который позволяет скрыть внутреннюю реализацию объекта от внешнего мира и предоставить доступ к ней только через определенные интерфейсы. Например:

   ```java
   public class Car {
       private String model;
       private int year;

       // Геттеры и сеттеры для доступа к полям
       public String getModel() {
           return model;
       }

       public void setModel(String model) {
           this.model = model;
       }

       public int getYear() {
           return year;
       }

       public void setYear(int year) {
           this.year = year;
       }
   }
   ```
Принцип инкапсуляции в объектно-ориентированном программировании (ООП) означает сокрытие внутренних деталей реализации объекта от внешнего мира и предоставление доступа к этим деталям только через определенные интерфейсы (методы). Это позволяет уменьшить зависимость кода от его внутренней структуры и обеспечить защиту данных от неправильного использования. Рассмотрим несколько примеров на языке Java для более глубокого понимания принципа инкапсуляции:

### Пример 1: Использование закрытых полей и методов

```java
public class Car {
    private String model;
    private int year;

    // Геттеры и сеттеры для доступа к закрытым полям
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year >= 1900 && year <= 2024) {
            this.year = year;
        } else {
            System.out.println("Invalid year!");
        }
    }
}
```

В этом примере класс `Car` инкапсулирует данные `model` и `year`, сделав их приватными (`private`). Доступ к этим данным осуществляется через публичные методы (`getModel`, `setModel`, `getYear`, `setYear`). Метод `setYear` включает в себя проверку допустимости года, что обеспечивает контроль над валидностью данных, доступными для изменения извне.

### Пример 2: Использование инкапсуляции в классе с логикой

```java
public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited successfully");
        } else {
            System.out.println("Invalid amount for deposit");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println(amount + " withdrawn successfully");
        } else {
            System.out.println("Invalid amount or insufficient balance");
        }
    }

    public double getBalance() {
        return balance;
    }
}
```

В этом примере класс `BankAccount` инкапсулирует данные `accountNumber` и `balance`. Методы `deposit` и `withdraw` предоставляют интерфейс для изменения состояния счета (`balance`), при этом обеспечивают проверки на корректность операций с депозитом и снятием средств. Публичный метод `getBalance` предоставляет доступ к текущему балансу без возможности напрямую изменять его значение извне класса.

### Пример 3: Использование инкапсуляции с помощью пакетных и приватных классов

```java
package com.example.util;

// Пакетный класс с инкапсуляцией
class StringUtil {
    private StringUtil() {} // приватный конструктор, чтобы предотвратить создание экземпляров

    public static boolean isEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }

    static String capitalize(String str) {
        if (isEmpty(str)) {
            return str;
        }
        return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
    }
}
```

В этом примере класс `StringUtil` находится в пакете `com.example.util` и содержит только статические методы. Конструктор класса является приватным, что предотвращает создание экземпляров этого класса извне. Методы `isEmpty` и `capitalize` предоставляют функциональность по работе с текстовыми строками, скрывая детали их реализации от внешнего мира.

### Заключение

Принцип инкапсуляции помогает обеспечить безопасность данных, улучшить модульность кода и уменьшить зависимости между компонентами программы. Использование инкапсуляции способствует созданию более надежных и легко поддерживаемых приложений в рамках объектно-ориентированного подхода к программированию.



2. **Наследование**: Этот принцип позволяет создавать новые классы на основе существующих, наследуя их свойства и методы. Например:

   ```java
   public class Vehicle {
       private String brand;

       public String getBrand() {
           return brand;
       }

       public void setBrand(String brand) {
           this.brand = brand;
       }
   }

   public class Car extends Vehicle {
       private int year;

       public int getYear() {
           return year;
       }

       public void setYear(int year) {
           this.year = year;
       }
   }
   ```
Принцип наследования в объектно-ориентированном программировании (ООП) позволяет создавать новые классы на основе существующих классов, наследуя их свойства и методы. Это один из ключевых механизмов ООП, который способствует повторному использованию кода и упрощению его поддержки. Давайте рассмотрим более подробно принцип наследования на примерах на языке Java.

### Пример 1: Базовый класс и производный класс

```java
// Базовый класс
class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(name + " is eating");
    }
}

// Производный класс
class Dog extends Animal {
    public Dog(String name) {
        super(name); // вызов конструктора базового класса
    }

    public void bark() {
        System.out.println("Woof!");
    }
}
```

В этом примере `Animal` является базовым классом, у которого есть свойство `name` и метод `eat`. `Dog` наследует от `Animal`, расширяя его функционал методом `bark`. Теперь объекты класса `Dog` могут использовать как методы класса `Animal` (`eat`), так и свои собственные (`bark`).

### Пример 2: Использование методов базового класса

```java
// Базовый класс
class Vehicle {
    protected String brand;

    public void drive() {
        System.out.println("Vehicle is driving");
    }
}

// Производный класс
class Car extends Vehicle {
    private int year;

    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    // Переопределение метода базового класса
    @Override
    public void drive() {
        System.out.println("Car " + brand + " is driving");
    }

    public void honk() {
        System.out.println("Beep beep!");
    }
}
```

Здесь `Vehicle` является базовым классом с методом `drive`, который переопределяется в классе `Car`. Класс `Car` также добавляет свой собственный метод `honk`. Это демонстрирует, как производный класс может изменять или расширять поведение методов базового класса.

### Пример 3: Множественное наследование интерфейсов

```java
// Интерфейсы
interface Flyable {
    void fly();
}

interface Swimmable {
    void swim();
}

// Класс, реализующий несколько интерфейсов
class Duck implements Flyable, Swimmable {
    @Override
    public void fly() {
        System.out.println("Duck is flying");
    }

    @Override
    public void swim() {
        System.out.println("Duck is swimming");
    }
}
```

Здесь класс `Duck` реализует два интерфейса: `Flyable` и `Swimmable`, предоставляя конкретные реализации методов `fly` и `swim`. Это показывает, как наследование интерфейсов позволяет классу обеспечивать различные поведения без привязки к определенному базовому классу.

### Примечание

При использовании наследования важно учитывать принципы проектирования, такие как согласованность и единство интерфейсов, чтобы избежать излишней сложности и зависимостей между классами. Наследование упрощает повторное использование кода, но также может привести к тесной связанности между классами, что усложняет их дальнейшую поддержку и модификацию.


3. **Полиморфизм**: Этот принцип позволяет объектам использовать методы одного и того же имени, но с разными реализациями. Например:

   ```java
   public interface Animal {
       void makeSound();
   }

   public class Dog implements Animal {
       @Override
       public void makeSound() {
           System.out.println("Bark");
       }
   }

   public class Cat implements Animal {
       @Override
       public void makeSound() {
           System.out.println("Meow");
       }
   }
   ```

4. **Абстракция**: Этот принцип позволяет скрыть сложность деталей реализации и предоставить упрощенный интерфейс для использования объекта. Например:

   ```java
   public abstract class Shape {
       public abstract void draw();
   }

   public class Circle extends Shape {
       @Override
       public void draw() {
           System.out.println("Drawing Circle");
       }
   }

   public class Rectangle extends Shape {
       @Override
       public void draw() {
           System.out.println("Drawing Rectangle");
       }
   }
   ```

Эти принципы помогают создавать гибкие, модульные и расширяемые программы в Java, способствуя легкости в поддержке кода и повторному использованию компонентов.
Принцип полиморфизма в объектно-ориентированном программировании (ООП) позволяет объектам одного типа использовать методы, определенные в их общем интерфейсе, с различной конкретной реализацией. Это способствует гибкости кода и позволяет ему адаптироваться к различным сценариям использования. Давайте рассмотрим несколько примеров полиморфизма на языке Java:

### Пример 1: Полиморфизм через переопределение методов

```java
// Базовый класс
class Animal {
    public void makeSound() {
        System.out.println("Some sound");
    }
}

// Производные классы
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Bark");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
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

В этом примере классы `Dog` и `Cat` наследуют метод `makeSound` от класса `Animal`, но каждый из них переопределяет этот метод с собственной реализацией. При выполнении программы метод `makeSound` вызывается в соответствии с типом объекта (`Dog` или `Cat`), что демонстрирует полиморфизм.

### Пример 2: Полиморфизм через интерфейсы

```java
// Интерфейс
interface Shape {
    void draw();
}

// Классы, реализующие интерфейс
class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }
}

class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}

public class Main {
    public static void main(String[] args) {
        Shape shape1 = new Circle();
        Shape shape2 = new Rectangle();

        shape1.draw(); // вызывает метод draw из класса Circle
        shape2.draw(); // вызывает метод draw из класса Rectangle
    }
}
```

Здесь интерфейс `Shape` определяет метод `draw`, который реализуют классы `Circle` и `Rectangle`. В методе `main` объекты `shape1` и `shape2` создаются как экземпляры `Circle` и `Rectangle` соответственно. При вызове метода `draw` полиморфизм позволяет каждому объекту использовать свою собственную реализацию метода `draw`.

### Пример 3: Полиморфизм с использованием абстрактных классов

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

### Заключение

Полиморфизм в Java позволяет объектам использовать методы общего интерфейса с различной реализацией, что делает код более гибким и легко расширяемым. Этот принцип является одним из основных аспектов объектно-ориентированного программирования и широко используется для создания абстракций и упрощения работы с объектами различных типов.
