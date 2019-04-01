package lesson5;

public class Employee {
    private String name;
    private String position;
    private String email;
    private long number;
    private int salary;
    private int age;


    public Employee(String name, String position, String email, long number, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.number = number;
        this.salary = salary;
        this.age = age;
       }
    @Override
    public String toString() {
        return String.format("Имя: " + name + " должность: " + position + " email: " + email + " номер телефона: " + number + " зарплата: " + salary + " возраст: " + age);
    }
    public void print(){
        System.out.println(this);
    }
    public int getAge() {
        return age;
    }
}

