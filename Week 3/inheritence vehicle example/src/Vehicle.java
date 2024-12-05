public class Vehicle {
    private String registration;
    private String brand;
    private String model;
    private String color;

    public Vehicle(String registration, String brand, String model, String color) {
        this.registration = registration;
        this.brand = brand;
        this.model = model;
        this.color = color;
    }
    public String getRegistration() {
        return registration;
    }
    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public String getColor() {
        return color;
    }
}

    class Bike extends Vehicle {
        private int wheels;
        private double engineSize;

        public Bike(String registration, String brand, String model, String color) {
            super(registration, brand, model, color);
            this.wheels = 2;
            this.engineSize = 2;
        }
        public int getWheels() {
            return wheels;
        }
        public double getEngineSize() {
            return engineSize;
        }
    }

    class Car extends Vehicle {
        private int wheels;
        private double engineSize;

        public Car(String registration, String brand, String model, String color) {
            super(registration, brand, model, color);
            this.wheels = 4;
            this.engineSize = 1.2;
        }
        public int getWheels() {
            return wheels;
        }
        public double getEngineSize() {
            return engineSize;
        }
    }

    class Truck extends Vehicle {
        private int wheels;
        private double engineSize;
        private double weight;

        public Truck(String registration, String brand, String model, String color) {
            super(registration, brand, model, color);
            this.wheels = 4;
            this.engineSize = 1.2;
            this.weight = 1600;
        }
        public int getWheels() {
            return wheels;
        }
        public double getEngineSize() {
            return engineSize;
        }
        public double getWeight() {
            return weight;
        }
    }