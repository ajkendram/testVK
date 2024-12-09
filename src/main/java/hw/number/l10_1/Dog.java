package hw.number.l10_1;

public class Dog extends Animal{



    private String name;
    private int jumpM;
    private int swimM;
    static int countDog = 0;

    public Dog(String name, int jumpM, int swimM) {
        this.name = name;
        this.jumpM = jumpM;
        this.swimM = swimM;
        countDog++;
    }

    public static int getCount() {
        return countDog;
    }



    @Override
    public void run(int distance) {
        if (distance<=500) {
            System.out.println("Пес "+ name +" пробежал " + distance + " м.");
        }
        else System.out.println("Пес "+ name +" НЕ пробежал " + distance + " м.");
    }

    @Override
    public void swim(int distance) {
        if (distance<=10) {
            System.out.println("Пес "+ name +" проплыл " + distance + " м.");
        }
        else System.out.println("Пес "+ name +" НЕ проплыл " + distance + " м.");

    }
}
