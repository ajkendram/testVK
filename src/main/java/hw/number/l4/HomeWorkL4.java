package hw.number.l4;

public class HomeWorkL4 {


    // Создайте метод printThreeWords(), который при вызове должен отпечатать в столбец три слова: Orange, Banana, Apple.
    //Task#1

    public static void printThreeWords() {
        System.out.println();
        System.out.println("          Task#1");

        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }




    //Создайте метод checkSumSign(), в теле которого объявите две int переменные a и b,
    // и инициализируйте их любыми значениями, которыми захотите. Далее метод должен просуммировать эти переменные,
    // и если их сумма больше или равна 0, то вывести в консоль сообщение “Сумма положительная”,
    // в противном случае - “Сумма отрицательная”.
    //Task#2
    public static void checkSumSign() {
        System.out.println();
        System.out.println("          Task#2");

        int a = 1;
        int b = -20;
        if ((a + b) >= 0) {
            System.out.printf("Сумма положительая");
        } else {
            System.out.printf("Сумма отрицательная");

        }
    }





    //Создайте метод printColor(), в теле которого задайте int переменную value и инициализируйте ее любым значением.
    // Если value меньше 0 (0 включительно), то в консоль метод должен вывести сообщение “Красный”,
    // если лежит в пределах от 0 (0 исключительно) до 100 (100 включительно), то “Желтый”, если больше 100
    // (100 исключительно) - “Зеленый”.
    //Task#3
    public static void printColor() {
        System.out.println();
        System.out.println();
        System.out.println("          Task#3");

        int value = 0;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Желтый");
        } else
            System.out.println("Зеленый");


    }


    //Создайте метод compareNumbers(), в теле которого объявите две int переменные a и b, и инициализируйте их любыми значениями,
    // которыми захотите. Если a больше или равно b, то необходимо вывести в консоль сообщение “a >= b”, в противном случае “a < b”.
    //Task#4
    public static void compareNumber() {
        System.out.println();
        System.out.println("          Task#4");

        int a = 1;
        int b = 20;
        if (a >= b) {
            System.out.printf("a >= b");
        } else {
            System.out.printf("a < b");

        }
    }


// Задание 5: Напишите метод, принимающий на вход два целых числа и
// проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно), если да - вернуть true, в противном случае - false.

    //Task#5

    public static void task5Summ(int number1, int number2) {
        System.out.println();
        System.out.println("          Task#5");


        boolean answerBoolean = true;
        int sum = number1 + number2;

        if ((sum >= 10) && (sum <= 20) ){
            System.out.println(number1 + " + " + number2 + " = " + sum +  " сумма лежит в пределах от 10 до 20 (включительно) - answerBoolean = " + answerBoolean );}
        else {
            answerBoolean = false;
            System.out.println(number1  + " + " + number2 + " = " + sum + " сумма НЕ лежит в пределах от 10 до 20 (включительно) - answerBoolean = " + answerBoolean );}
    }



//
//    Задание 6: Напишите метод, которому в качестве параметра передается целое число, метод должен
//    напечатать в консоль, положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
    //Task#6

    public static void task6PosNeg(int number) {
        System.out.println();
        System.out.println("          Task#6");

        if (number >= 0) {
            System.out.println(number + " positive");}
        else {
            System.out.println(number + " negative" );}
    }




    //
//    Задание 7: Напишите метод, которому в качестве параметра передается целое число. Метод должен возвращать true,
//    если число отрицательное, и возвращать false если положительное. Замечание: ноль считаем положительным числом.
    //Task#7
    public static void task7boolean(int number) {
        System.out.println();
        System.out.println("          Task#7");

        boolean answer = true;
        if (number > 0) {
            answer = false;
            System.out.println(number + " positive, answer = " + answer);}
        else {
            answer = true;
            System.out.println(number + " negative, answer = " + answer);}
    }





//    Задание 8: Напишите метод, которому в качестве аргументов
//    передается строка и число, метод должен отпечатать в консоли указанную строку, указанное количество раз.
    //Task#8

    public static void stringAndNum(String myString, int number) {
        System.out.println();
        System.out.println("          Task#8");

        for (int i = 0; i < number; i++) {

            System.out.print(myString+ " ");
        }

    }




//    Задание 9: Напишите метод, который определяет, является ли год високосным, и возвращает boolean (високосный -
//    true, не високосный - false). Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
    //Task#9

    public static void leapYear() {
        System.out.println();
        System.out.println("          Task#10");

        int year = 1700;
        boolean answer = true;

        if ((year % 4 == 0) && (year % 100 != 0)) {

            answer = true;
            System.out.print(year + " is leapYear!!! answer =  " + answer);}
        else {
            if (year % 400 == 0){
                answer = true;
                System.out.print(year + " is leapYear!!! answer =  " + answer);}

            else {
                answer = false;
                System.out.print(year + " is not leapYear!!! answer =  " + answer);
            }
        }
    }

    //Task#10

    public static void array0to1() {
        System.out.println();
        System.out.println("          Task#10");


        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        int length = array.length;


        for (int i = 0; i < length; i++) {
            System.out.print(array[i]+ " ");
        }

        System.out.println();


        for (int i = 0; i < length; i++) {
            if (array[i] == 0) {
                array[i] = 1;}
            else array[i] = 0;

            System.out.print(array[i]+ " ");
        }

    }


    //Task#11

    public static void arrayX2() {
        System.out.println();
        System.out.println("          Task#11");


        int[] myArray = new int[100];


        for (int i = 0; i < 100; i++) {
            myArray[i] = i+1;

            System.out.print(myArray[i]+ " ");
        }
    }



    //Task#12

    public static void array100() {
        System.out.println();
        System.out.println("          Task#12");


        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int length = array.length;


        for (int i = 0; i < length; i++) {
            if (array[i]< 6) {
                array[i] = array[i] * 2;
            }
            System.out.print(array[i]+ " ");
        }
    }


    //Task#13

    public static void sqrArray() {
        System.out.println();
        System.out.println("          Task#13");

        int arrlen = 7;
        int[][] myArray = new int[arrlen][arrlen];

        for (int i = 0; i < arrlen; i++) {
            for (int j = 0; j < arrlen; j++) {
                if (i == j) {
                    myArray[i][j] = 1;
                }
                else {
                    myArray[i][j] = 0;}
                System.out.print(  myArray[i][j] + "  ");
            }
            System.out.println();
        }

    }




    //Task#14

    public static void initValueArr(int len ,int initValue) {
        System.out.println();
        System.out.println("          Task#14");

        int[] myArray = new int[len];
        for (int i = 0; i < len; i++) {
            myArray[i] = initValue;
            System.out.println( "el# " + i + " =  " + myArray[i]);
        }
    }




}
