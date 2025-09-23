public class Car extends Vehicle {
    String model;

    Car(String model) {
        this.model = model;
    }

    @Override
    public void honk() {
        System.out.println("Beep beep! This is a " + brand + " " + model);
    }

    public static void main(String[] args) {
        Car object1 = new Car("XYZ");
        object1.honk();
    }
}
