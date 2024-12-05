public class main {
    public static void main(String[] args) {
        Bike bike1 = new Bike("BD18 SMR", "Yamaha", "YZF R3", "Black");
        System.out.println("Bike: " + bike1.getBrand() + " " + bike1.getModel() + ", Colour: " + bike1.getColor());

        Car car1 = new Car("SM07 VDH", "Volskwagen", "Golf", "Blue");
        System.out.println("Car: " + car1.getBrand() + " " + car1.getModel() + ", Colour: " + car1.getColor());

        Truck truck1 = new Truck("XD21 MWM", "Mercedes", "Big Truck", "White");
        System.out.println("Truck: " + truck1.getBrand() + " " + truck1.getModel() + ", Colour: " + truck1.getColor() + ", Weight: " + truck1.getWeight());
    }
}