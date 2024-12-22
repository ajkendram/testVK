package hw.number.l13;

import java.util.*;

public class Main {

    public static void main(String[] args) {


        List<String> colors = new ArrayList<>(Arrays.asList("red", "blue", "red", "green",
                "blue", "yellow", "red", "purple", "yellow", "purple", "orange", "orange", "blue", "red"));

        Map<String, Integer> colorCount = new HashMap<>();

        for (String color : colors) {
            if (colorCount.containsKey(color)) {
                colorCount.put(color, colorCount.get(color) + 1);
            } else {
                colorCount.put(color, 1);
            }
        }

        System.out.println("Уникальные цвета:");
        for (String color1 : colorCount.keySet()) {
            System.out.println(color1);
        }


        for (Map.Entry<String, Integer> entry : colorCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}


