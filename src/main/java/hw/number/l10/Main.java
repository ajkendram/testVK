package hw.number.l10;


import hw.number.l6.Employee;

import static hw.number.l10.Cat.countCat;
import static hw.number.l10.Dog.countDog;

public class Main {

    public static void main(String[] args) {

        int miska = 7;

        Cat[] cat = new Cat[5];
        Dog[] dog = new Dog[5];


        cat[0] = new Cat("catVK0", 0,  20);
        cat[1] = new Cat("catVK1", 0,  20);
        cat[2] = new Cat("catVK2", 0,  20);
        cat[3] = new Cat("catVK3", 0,  20);

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


        cat[0].eat(miska, cat[0].getHungry());


    }
}
