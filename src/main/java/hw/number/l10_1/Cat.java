package hw.number.l10_1;

public class Cat extends Animal {

    private String name;
    private int hungry;
    private int swimM;
    static int countCat = 0;
    private boolean isFull;


    public Cat(String name, int hungry, int swimM) {
        this.name = name;
        this.hungry = hungry;
        this.swimM = swimM;

        countCat++;
    }

    public String getName() {
        return name;
    }

    public boolean isFull() {
        return isFull;
    }

    public static int getCount() {
        return countCat;
    }


    public void eat(Bowl bowl) {
        if (bowl.getFood() >= hungry) {
            bowl.decreaseFood(hungry);
            isFull = true;
        } else {
            System.out.println(name + " не смог покушать, недостаточно еды.");
        }
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





}
