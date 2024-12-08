package hw.number.l10;

public class Cat extends Animal {

    private String name;
    private int jumpM;
    private int swimM;

    public Cat(String name, int jumpM, int swimM) {
        this.name = name;
        this.jumpM = jumpM;
        this.swimM = swimM;
        int count = 0;
        count++;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public void run(int distance) {
        System.out.println("Кот пробежал " + distance + " м.");
    }

    @Override
    public void swim(int distance) {




    }
}
