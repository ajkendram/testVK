import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    public static void main(String[] args) {

        int number = 5;
        int factorial = calculateFactorial(number);
        System.out.println(factorial);
    }

    public static int calculateFactorial(int number) {
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }

        @Test
        public void testCalculateFactorial() {
            int number = 5;
            int expectedFactorial = 120;
            int actualFactorial = calculateFactorial(number);
            assertEquals(actualFactorial, expectedFactorial);
        }
    }



