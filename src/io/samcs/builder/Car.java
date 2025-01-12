package io.samcs.builder;

public class Car {

    private final String make;
    private final String model;
    private final int year;
    private final String color;
    private final int price;
    private final int vin;

    private Car(CarBuilder carBuilder) {
        this.make = carBuilder.make;
        this.model = carBuilder.model;
        this.year = carBuilder.year;
        this.color = carBuilder.color;
        this.price = carBuilder.price;
        this.vin = carBuilder.vin;
    }

    public static class CarBuilder {
        private  String make;
        private  String model;
        private  int year;
        private  String color;
        private  int price;
        private  int vin;

        public CarBuilder make(String make) {
            this.make = make;
            return this;
        }

        public CarBuilder model(String model) {
            this.model = model;
            return this;
        }

        public CarBuilder year(int year) {
            this.year = year;
            return this;
        }

        public CarBuilder color(String color) {
            this.color = color;
            return this;
        }

        public CarBuilder price(int price) {
            this.price = price;
            return this;
        }

        public CarBuilder vin(int vin) {
            this.vin = vin;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }

    public static void main(String[] args) {
        Car car = new CarBuilder()
                .make("Toyota")
                .model("Camry")
                .year(2019)
                .color("Black")
                .price(25000)
                .vin(1234567890)
                .build();
        System.out.println(car.make);
        System.out.println(car.model);
        System.out.println(car.year);
        System.out.println(car.color);
        System.out.println(car.price);
        System.out.println(car.vin);
    }
}
