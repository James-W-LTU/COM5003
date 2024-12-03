public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Nigel", 3);
        Cat cat = new Cat("Bob", 5);

        dog.eat();
        dog.bark();
        dog.displayInfo();

        cat.eat();
        cat.meow();
        cat.displayInfo();
    }
}