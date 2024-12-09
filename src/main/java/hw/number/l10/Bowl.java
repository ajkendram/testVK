package hw.number.l10;

public class Bowl {

    private int food;

    public Bowl(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void addFood(int amount) {
        if (amount > 0) {
            food = food + amount;
        }
    }

    public void decreaseFood(int amount) {
        if (food >= amount) {
            food = food - amount;
        } else {
            System.out.println("Недостаточно еды в миске.");
        }
    }
}