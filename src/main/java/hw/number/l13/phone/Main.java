package hw.number.l13.phone;

public class Main {

    public static void main(String[] args) {
        PhoneDirectory phoneDirectory = new PhoneDirectory();
        phoneDirectory.add("Ivanov", "123-456-789");
        phoneDirectory.add("Ivanov", "987-654-321");
        phoneDirectory.add("Petrov", "555-555-555");

        System.out.println("Ivanov: " + phoneDirectory.get("Ivanov"));
        System.out.println("Petrov: " + phoneDirectory.get("Petrov"));
        System.out.println("Sidorov: " + phoneDirectory.get("Sidorov"));
    }
}
