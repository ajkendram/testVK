package hw.number.l10_1;


import static hw.number.l10_1.Cat.countCat;
import static hw.number.l10_1.Dog.countDog;

public class Main {

    public static void main(String[] args) {



        Cat[] cat = new Cat[4];
        Dog[] dog = new Dog[4];


        cat[0] = new Cat("catVK0", 2,  20);
        cat[1] = new Cat("catVK1", 3,  20);
        cat[2] = new Cat("catVK2", 4,  20);
        cat[3] = new Cat("catVK3", 5,  20);

        cat[0].run(192);
        cat[1].run(12);
        cat[2].run(10);
        cat[3].run(222);

        cat[0].swim(2);

        dog[0] = new Dog("DogVK0", 10,  20);
        dog[1] = new Dog("DogVK1", 10,  20);


        dog[0].run(499);
        dog[1].run(499);

        dog[0].swim(9);
        dog[1].swim(499);





        System.out.println("Котов = " + countCat);
        System.out.println("Собак = " + countDog);
        int all =  countCat + countDog;
        System.out.println("Животных = " + all);



        System.out.println();



        Bowl bowl = new Bowl(5);
        System.out.println("Еды в миске: " + bowl.getFood());
        System.out.println();



        // Коты едят
        for (int i = 0; i < cat.length; i++) {
            cat[i].eat(bowl);
            System.out.println(cat[i].getName() + " сытость: " + cat[i].isFull());
            System.out.println("Еды в миске: " + bowl.getFood());
            System.out.println();


        }

        System.out.println();

        // Добавляем еду в миску
        bowl.addFood(10);
        System.out.println("Добавили, стало еды в миске: " + bowl.getFood());

        System.out.println();


        // Повторная попытка покушать
        for (int i = 0; i < cat.length; i++) {
            if (!cat[i].isFull()) {
                cat[i].eat(bowl);
                System.out.println(cat[i].getName() + " сытость: " + cat[i].isFull());
                System.out.println("Еды в миске: " + bowl.getFood());
                System.out.println();


            }
        }

    }
}
