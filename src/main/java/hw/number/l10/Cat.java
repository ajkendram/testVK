package hw.number.l10;

public class Cat extends Animal {

    private String name;
    private int hungry;
    private int swimM;
    static int countCat = 0;
    private boolean isFull;

    //public int miska = 6;

    public Cat(String name, int hungry, int swimM) {
        this.name = name;
        this.hungry = hungry;
        this.swimM = swimM;

        countCat++;
    }

    public int getHungry() {
        return hungry;
    }

    public static int getCount() {
        return countCat;
    }

    @Override
    public void run(int distance) {
        if (distance<=200) {
            System.out.println("Кот "+ name +" пробежал " + distance + " м.");
        }
        else System.out.println("Кот "+ name +" НЕ пробежал " + distance + " м.");
    }


    @Override
    public void swim(int distance) {
        System.out.println("Кот "+ name +" НЕ поплывет " + distance + " м.");

    }

    public void eat(int miska, int hungry) {

        System.out.println("Кот "+ hungry +" в миске " + miska);

    }


}
