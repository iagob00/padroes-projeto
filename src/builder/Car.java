package builder;

public class Car {
    private final String make;
    private final String model;
    private final int year;
    private final String color;
    private final String engine;

    // Construtor público
    public Car(String make, String model, int year, String color, String engine) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car [make=" + make + ", model=" + model + ", year=" + year +
                ", color=" + color + ", engine=" + engine + "]";
    }
}

