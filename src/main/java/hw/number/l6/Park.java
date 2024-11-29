package hw.number.l6;

public class Park {
    // Внутренний класс Attraction
    public class Attraction {
        private String name;
        private String workingHours;
        private double price;

        // Конструктор
        public Attraction(String name, String workingHours, double price) {
            this.name = name;
            this.workingHours = workingHours;
            this.price = price;
        }

        // Метод для вывода информации об аттракционе
        public void printInfo() {
            System.out.println("Attraction Name: " + name);
            System.out.println("Working Hours: " + workingHours);
            System.out.println("Price: " + price);
        }
    }

    // Публичный метод для создания и вывода информации об аттракционах
    public void createAndShowAttractions() {
        Attraction rollerCoaster = new Attraction("Roller Coaster", "10:00 - 18:00", 20.0);
        Attraction ferrisWheel = new Attraction("Ferris Wheel", "09:00 - 20:00", 15.0);
        Attraction hauntedHouse = new Attraction("Haunted House", "11:00 - 22:00", 25.0);

        rollerCoaster.printInfo();
        System.out.println();
        ferrisWheel.printInfo();
        System.out.println();
        hauntedHouse.printInfo();
    }

    public void createAndShowAttractionsMLEEE() {
        System.out.println("MlEEEEE ");


    }
}