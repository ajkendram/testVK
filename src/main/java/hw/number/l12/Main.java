package hw.number.l12;

public class Main {

    public static void main(String[] args) {
        String[][] myArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        int sum = ArrayStr.sumArrayElements(myArray);
        System.out.println("Сумма всех элементов массива: " + sum);


    }
}