SOLID - это аббревиатура, состоящая из первых букв пяти принципов объектно-ориентированного программирования, которые помогают создавать более гибкий, расширяемый и поддерживаемый код. Рассмотрим каждый принцип и примеры кода на Java:

1. Принцип единственной ответственности (Single Responsibility Principle, SRP) - класс должен иметь только одну причину для изменения.

Пример:
```java
// Плохой пример
public class User {
    private String name;
    private String email;
    private String phoneNumber;
    
    public void sendEmail(String message) {
        // ...
    }
    
    public void call(String phoneNumber) {
        // ...
    }
    
    public void updateProfile(String name, String email, String phoneNumber) {
        // ...
    }
}

// Хороший пример
public class User {
    private String name;
    private String email;
    private String phoneNumber;
    
    // геттеры и сеттеры
    
}

public class EmailSender {
    public void sendEmail(User user, String message) {
        // ...
    }
}

public class PhoneCaller {
    public void call(User user) {
        // ...
    }
}

public class UserProfileUpdater {
    public void updateProfile(User user, String name, String email, String phoneNumber) {
        // ...
    }
}
```

2. Принцип открытости/закрытости (Open/Closed Principle, OCP) - классы должны быть открыты для расширения, но закрыты для изменения.

Пример:
```java
// Плохой пример
public class Shape {
    private String type;
    
    public Shape(String type) {
        this.type = type;
    }
    
    public void draw() {
        if (type.equals("circle")) {
            // ...
        } else if (type.equals("square")) {
            // ...
        } else if (type.equals("rectangle")) {
            // ...
        }
    }
}

// Хороший пример
public abstract class Shape {
    public abstract void draw();
}

public class Circle extends Shape {
    @Override
    public void draw() {
        // ...
    }
}

public class Square extends Shape {
    @Override
    public void draw() {
        // ...
    }
}

public class Rectangle extends Shape {
    @Override
    public void draw() {
        // ...
    }
}
```

3. Принцип подстановки Барбары Лисков (Liskov Substitution Principle, LSP) - подклассы должны быть взаимозаменяемы с суперклассом без изменения свойств программы.

Пример:
```java
// Плохой пример
public class Rectangle {
    protected int width;
    protected int height;
    
    public void setWidth(int width) {
        this.width = width;
    }
    
    public void setHeight(int height) {
        this.height = height;
    }
    
    public int getArea() {
        return width * height;
    }
}

public class Square extends Rectangle {
    @Override
    public void setWidth(int width) {
        this.width = width;
        this.height = width;
    }
    
    @Override
    public void setHeight(int height) {
        this.width = height;
        this.height = height;
    }
}

// Хороший пример
public interface Shape {
    int getArea();
}

public class Rectangle implements Shape {
    private int width;
    private int height;
    
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    
    @Override
    public int getArea() {
        return width * height;
    }
}

public class Square implements Shape {
    private int side;
    
    public Square(int side) {
        this.side = side;
    }
    
    @Override
    public int getArea() {
        return side * side;
    }
}
```

4. Принцип разделения интерфейса (Interface Segregation Principle, ISP) - клиенты не должны зависеть от методов, которые они не используют.

Пример:
```java
// Плохой пример
public interface Vehicle {
    void drive();
    void fly();
    void sail();
}

public class Car implements Vehicle {
    @Override
    public void drive() {
        // ...
    }
    
    @Override
    public void fly() {
        // empty
    }
    
    @Override
    public void sail() {
        // empty
    }
}

// Хороший пример
public interface Vehicle {
    void drive();
}

public interface FlyingVehicle {
    void fly();
}

public interface SailingVehicle {
    void sail();
}

public class Car implements Vehicle {
    @Override
    public void drive() {
        // ...
    }
}

public class Plane implements Vehicle, FlyingVehicle {
    @Override
    public void drive() {
        // ...
    }
    
    @Override
    public void fly() {
        // ...
    }
}

public class Boat implements Vehicle, SailingVehicle {
    @Override
    public void drive() {
        // ...
    }
    
    @Override
    public void sail() {
        // ...
    }
}
```

5. Принцип инверсии зависимостей (Dependency Inversion Principle, DIP) - модули верхнего уровня не должны зависеть от модулей нижнего уровня. Оба типа модулей должны зависеть от абстракций. Абстракции не должны зависеть от деталей. Детали должны зависеть от абстракций.

Пример:
```java
// Плохой пример
public class UserController {
    private final UserRepository userRepository = new UserRepository();
    
    public void createUser(String name, String email) {
        User user = new User(name, email);
        userRepository.save(user);
    }
}

public class UserRepository {
    public void save(User user) {
        // ...
    }
}

// Хороший пример
public interface UserRepository {
    void save(User user);
}

public class UserController {
    private final UserRepository userRepository;
    
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    
    public void createUser(String name, String email) {
        User user = new User(name, email);
        userRepository.save(user);
    }
}

public class InMemoryUserRepository implements UserRepository {
    private final List<User> users = new ArrayList<>();
    
    @Override
    public void save(User user) {
        users.add(user);
    }
}
```