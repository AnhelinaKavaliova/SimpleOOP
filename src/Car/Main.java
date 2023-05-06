package Car;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("BWB", "SKD2", 2005);
        Car car2 = new Car("ghg", "SKD2", 1999);
        Car car3 = new Car("php", "SKD2", 2017);

        car1.printInfo();
        car2.printInfo();
        car3.printInfo();
    }
}
