public class animal {
    String name;
    int age;
    public animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void eat() {
        System.out.println(name + " is eating");
    }
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Dog extends animal {
    public Dog(String name, int age) {
        super(name, age);
    }
    public void bark() {
        System.out.println(name + " is barking");
    }
    @Override
    public void displayInfo() {
        System.out.println("Dog's Name: " + name + ", Age: " + age);
    }
}

class Cat extends animal {
    public Cat(String name, int age) {
        super(name, age);
    }
    public void meow() {
        System.out.println(name + " is meowing. ");
    }
    @Override
    public void displayInfo() {
        System.out.println("Cat's Name: " + name + ", Age: " + age);
    }
}

class Bird extends animal {
    public Bird(String name, int age) {
        super(name, age);
    }
    public void chirp() {
        System.out.println(name + " is chirping");
    }
    @Override
    public void displayInfo() {
        System.out.println("Bird's Name: " + name + ", Age: " + age);
    }
}





//abstract class Animal {
//    abstract void makeSound();
//}
//
//class Dog extends Animal {
//    @Override
//    void makeSound() {
//        System.out.println("Woof");
//    }
//}
//
//class Cat extends Animal {
//    @Override
//    void makeSound() {
//        System.out.println("Meow");
//    }
//}
//
//class Bird extends Animal {
//    @Override
//    void makeSound() {
//        System.out.println("Chirp");
//    }
//}