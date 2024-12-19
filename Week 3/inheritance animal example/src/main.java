public class main {
    public static void main(String[] args) {
        Dog dog = new Dog("Nigel", 3);
        Cat cat = new Cat("Bob", 5);
        Bird bird = new Bird("Jerry", 1);

        dog.eat();
        dog.bark();
        dog.displayInfo();

        cat.eat();
        cat.meow();
        cat.displayInfo();

        bird.eat();
        bird.chirp();
        bird.displayInfo();

//        Animal[] animals = new Animal[3];
//
//        animals[0] = new Dog();
//        animals[1] = new Cat();
//        animals[2] = new Bird();
//
//        for (Animal animal : animals) {
//            animal.makeSound();
//        }

    }
}