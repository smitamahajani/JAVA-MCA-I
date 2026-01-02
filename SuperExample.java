// Parent Class
class Animal {
    String type = "Animal";

    Animal(String name) {
        System.out.println("Animal Constructor: " + name + " is born.");
    }

    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Child Class
class Dog extends Animal {
    String type = "Dog"; // Shadows the parent's 'type' variable

    Dog(String name) {
        // 1. Using super() to call Parent Constructor
        // This must be the first line in the constructor
        super(name); 
    }

    void printTypes() {
        System.out.println("Child class type: " + type);
        // 2. Using super to access Parent Variable
        System.out.println("Parent class type: " + super.type);
    }

    @Override
    void eat() {
        System.out.println("The dog eats kibble.");
    }

    void work() {
        // 3. Using super to call Parent Method
        super.eat(); 
        this.eat(); // Calls the Dog's version
    }
}

public class SuperExample {
    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy");
        
        System.out.println("--- Variables ---");
        myDog.printTypes();
        
        System.out.println("\n--- Methods ---");
        myDog.work();
    }
}
