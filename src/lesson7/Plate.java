package lesson7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int amount) {
        int difference = food - amount;
        if (difference < 0) return false;
        food -= amount;
        return true;
    }

    public void info() {
        System.out.println("plate: " + food);
    }

    public void addFood(int food) {
        System.out.println("=====================================\nДобавляем еду: " + food);
        this.food += food;
    }
}
