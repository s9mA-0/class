import java.util.Scanner;

class Car {
    String brand;
    String color;
    double price;

    public Car(String brand, String color, double price) {
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    public String getBrand() {

        return brand;
    }

    public String getColor() {

        return color;
    }

    public double getPrice() {

        return price;
    }

    public boolean isBudget(double budget) {

        return price <= budget;
    }
}

class Manufacturer {
    String[] brands = {"Toyota", "Ford", "Honda", "Nissan", "Volkswagen"};
    String name;

    public Manufacturer(String[] userBrands) {
        if (userBrands.length > 0) {
            this.name = userBrands[0];
        } else {
            this.name = brands[(int) (Math.random() * brands.length)];
        }
    }

    public Car createCar() {
        String[] colors = {"Червоний", "Голубий", "Зелений", "Чорний", "Білий"};
        int price = (int) ((int)10000.0 + Math.random() * 20000.0);

        String color = colors[(int) (Math.random() * colors.length)];

        Car car = new Car(name, color, price);
        return car;
    }

    public static class Customer {
        private double budget;

        public Customer(double budget) {
            this.budget = budget;
        }

        public void chooseCar(Car car) {
            if (car.isBudget(budget)) {
                System.out.println("Ти можеш взяти " + car.getBrand() + " " + car.getColor() + " за $" + car.getPrice());
            } else {
                System.out.println("Цей авто не підходить під твій бюджет.");
            }
        }
    }
}