import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numCars = 3;

        System.out.println("Введіть марку автомобілю:");
        String userInput = scanner.nextLine();

        Manufacturer manufacturer = new Manufacturer(new String[]{userInput});

        Manufacturer.Customer customer = new Manufacturer.Customer(20000.0);

        for (int i = 0; i < numCars; i++) {
            Car myCar = manufacturer.createCar();
            System.out.println("Машина " + (i+1) + ": " + myCar.getBrand() + " " + myCar.getColor() + " $" + myCar.getPrice());

            customer.chooseCar(myCar);
        }
    }
}