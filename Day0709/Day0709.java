package Day0709;

// Notes:
// 1. Classes and Objects:
//    - A class is a blueprint for creating objects.
//    - An object is an instance of a class.
//    - Classes contain fields (attributes) and methods (functions).
//
// 2. Methods:
//    - Methods define the behavior of a class.
//    - Syntax: [access_modifier] [return_type] methodName(parameters) { ... }
//    - Example: public int add(int a, int b) { return a + b; }
//
// 3. Constructors:
//    - Special methods used to initialize objects.
//    - Constructor name must match the class name.
//    - Example: public Person(String name) { this.name = name; }
//
// 4. Inheritance:
//    - Mechanism to acquire properties and behaviors of a parent class.
//    - Use the 'extends' keyword.
//    - Example: class Child extends Parent { ... }
//
// 5. Polymorphism:
//    - Ability to take many forms.
//    - Achieved through method overriding and method overloading.
//    - Example: Parent obj = new Child(); obj.display();
//
// 6. Abstract Classes:
//    - Cannot be instantiated.
//    - Can have abstract methods (without body) and concrete methods.
//    - Example: abstract class Animal { public abstract void sound(); }
//
// 7. Interfaces:
//    - Define a contract that implementing classes must follow.
//    - All methods in an interface are abstract by default.
//    - Example: interface Shape { double area(); }
//
// 8. Method Overloading:
//    - Same method name with different parameter lists.
//    - Example: public int add(int a, int b) { ... } and public double add(double a, double b) { ... }
//
// 9. Method Overriding:
//    - Redefining a method in a subclass that exists in the parent class.
//    - Use the @Override annotation.
//    - Example: class Child extends Parent { @Override public void display() { ... } }
//
// 10. Access Modifiers:
//     - public: Accessible from anywhere.
//     - private: Accessible only within the class.
//     - protected: Accessible within the package and subclasses.
//     - default: Accessible within the package.

import java.util.Objects;

public class Day0709 {
    // Example 1: Method with return type and parameters
    public int addNumbers(int a, int b) {
        return a + b;
    }

    // Example 4: Polymorphism example
    public void demonstratePolymorphism() {
        Parent obj = new Child();
        obj.display(); // Calls the overridden method in Child class
    }
}

// Example 2: Constructor in a class
class Person {
    private String name;

    // Constructor
    public Person(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Name: " + name);
    }
}

// Example 3: Demonstrating inheritance
class Parent {
    public void display() {
        System.out.println("This is the parent class.");
    }
}

class Child extends Parent {
    @Override
    public void display() {
        System.out.println("This is the child class.");
    }
}

// Example 5: Method overloading
class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }
}

// Example 6: Abstract class and method
abstract class Animal {
    public abstract void sound();
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Woof Woof");
    }
}

// Example 7: Interface implementation
interface Shape {
    double area();
}

class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

// Example 8: Static methods and variables
class StaticExample {
    static int count = 0;

    public StaticExample() {
        count++;
    }

    public static int getCount() {
        return count;
    }
}

// Example 9: Final keyword usage
class FinalExample {
    final int CONSTANT = 100;

    public void displayConstant() {
        System.out.println("Constant value: " + CONSTANT);
    }
}

// Example 10: Nested classes
class OuterClass {
    private String message = "Hello from OuterClass!";

    class InnerClass {
        public void displayMessage() {
            System.out.println(message);
        }
    }
}

// Example 11: Overriding equals() and hashCode()
class Employee {
    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee employee = (Employee) obj;
        return id == employee.id && name.equals(employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}

// Example 12: Anonymous inner classes
abstract class Greeting {
    public abstract void sayHello();
}

public class AnonymousExample {
    public void demonstrate() {
        Greeting greeting = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Hello from Anonymous Inner Class!");
            }
        };
        greeting.sayHello();
    }
}

// Example 13: Enum usage
enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    public boolean isWeekend() {
        return this == SATURDAY || this == SUNDAY;
    }
}
