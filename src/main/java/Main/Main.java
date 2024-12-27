package Main;

import hw.number.l6.Employee;
import hw.number.l6.Park;

import static hw.number.l4.HomeWorkL4.*;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Home work L4

        printThreeWords();
        checkSumSign();
        printColor();
        compareNumber();
        task5Summ(11, 33);
        task6PosNeg(-700);
        task7boolean(-50);
        stringAndNum("teststring ", 5);
        leapYear();
        array0to1();
        arrayX2();
        array100();
        sqrArray();
        initValueArr(5, 777);

        //Home work L6

        //Создать класс “Сотрудник” с полями: ФИО, должность, email, телефон, зарплата, возраст.
        //Конструктор класса должен заполнять эти поля при создании объекта.
        //Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.


        Employee[] employeeArray = new Employee[5];

        //  создать массив из 5 сотрудников

        employeeArray[0] = new Employee("Ivan Ivanov", "Engineer", "ivan@example.com", "+123456789", 50000, 30);
        employeeArray[1] = new Employee("Petr Petrov", "Manager", "petr@example.com", "+987654321", 60000, 35);
        employeeArray[2] = new Employee("Anna Smirnova", "Developer", "anna@example.com", "+123123123", 55000, 28);
        employeeArray[3] = new Employee("Olga Sokolova", "Designer", "olga@example.com", "+321321321", 48000, 25);
        employeeArray[4] = new Employee("Sergey Kuznetsov", "Analyst", "sergey@example.com", "+456456456", 53000, 32);

        for(int i = 0; i < 5; i++) {
            employeeArray[i].printInfoEmployee();
        }

        //Создать класс Park с внутренним классом, с помощью объектов которого можно хранить информацию об аттракционах,
        // времени их работы и стоимости


        Park parkVK = new Park();
        parkVK.createAndShowAttractions();


    }

    }




