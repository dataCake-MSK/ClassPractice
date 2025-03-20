import CarPackage.Car;

public class ClassPracticeApplication {
    public static void main(String[] args) {
        Car myCar = new Car();
        Car myCar2 = new Car("CuteCar", "Pink");
        System.out.println(myCar2.totalCars);  // totalCars available because public
        Car.carsInfo();
    }
}


