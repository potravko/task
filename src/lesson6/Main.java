package lesson6;

public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat("Eva", 9);
        cat.jump();
        cat.swim();
        cat.run();

        Dog dog = new Dog("Archi",8);
        dog.jump();
        dog.swim();
        dog.run();
    }
}
