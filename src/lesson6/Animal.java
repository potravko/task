package lesson6;

public class Animal {
    protected String name;
    protected int age;


    public Animal(String name, int age) {
        this.name = name;
        this.age = age;

    }
    public void jump() {
        System.out.println(name +  " прыгнула на 2м");

    }

    public void swim() {
        System.out.println(" Уплыла ");


    }

    public void run() {
        System.out.println("Убежала ");

    }
}



