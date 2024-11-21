public class animal {
    String name;
    int age;
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void eat() {
        System.out.println(name + " is eating");
    }
    public void displayInfo() {
        System.out.println("Name: ", + name + ", Age: " + age);
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