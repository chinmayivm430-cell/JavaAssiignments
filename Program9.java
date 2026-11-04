class Vehicle {
    String brand;

    Vehicle(String brand) {
        this.brand = brand;
    }

    void display() {
        System.out.println("Vehicle brand: " + brand);
    }
}

class Car extends Vehicle {
    String brand;

    Car(String parentBrand, String childBrand) {
        super(parentBrand);
        this.brand = childBrand;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Car brand: " + brand);
        System.out.println("Parent brand using super: " + super.brand);
    }
}

public class Program9 {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "BMW");
        car.display();
    }
}
