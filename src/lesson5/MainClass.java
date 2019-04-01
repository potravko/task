package lesson5;

public class MainClass {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Егор", "анестезиолог", "egor@mail.ru", 8 - 918 - 323 - 4513, 50000, 45);
        employees[1] = new Employee("Вадим", "главврач", "vadim@mail.ru", 8 - 918 - 323 - 4514, 200000, 60);
        employees[2] = new Employee("Денис", "хирург", "denis@mail.ru", 8 - 918 - 323 - 4515, 30000, 30);
        employees[3] = new Employee("Надежда", "терапевт", "nadya@mail.ru", 8 - 918 - 323 - 4516, 20000, 35);
        employees[4] = new Employee("Марина", "медсестра", "egor@mail.ru", 8 - 918 - 323 - 4517, 15000, 25);

        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getAge() > 40) employees[i].print();

        }
    }
}
