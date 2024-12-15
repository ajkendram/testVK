package hw.number.l12;

public class ArrayStr {



    public static int sumArrayElements(String[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += Integer.parseInt(array[i][j]);
            }
        }
        return sum;
    }

        }