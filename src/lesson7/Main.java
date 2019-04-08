package lesson7;

public class Main {
    public static void main(String[] args) {
        Cat [] arrCats = new Cat [4];
        arrCats[0] = new Cat("Eva", 15);
        arrCats[1] = new Cat("Archi", 25);
        arrCats[2] = new Cat("Snezok", 35);
        arrCats[3] = new Cat("Markiz", 30);


        Plate plate = new Plate(100);
        for (Cat cat : arrCats) {
            cat.eat(plate);
            cat.info();
        }
        plate.info();
        plate.addFood(100);
        plate.info();
    }
}



