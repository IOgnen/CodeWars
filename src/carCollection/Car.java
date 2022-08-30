package carCollection;

public class Car{

    private String manufacturer;
    private String model;
    private int price;
    private float power;

    public Car(String manufacturer, String model, int price, float power) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.price = price;
        this.power = power;
    }

    public int getPrice() {
        return price;
    }

    public float getPower() {
        return power;
    }
    public int compareTo(Car car, boolean ascending) {
        int result = Integer.compare(this.price, car.price);
            if (result == 0) {
                return Float.compare(this.power, car.power);
            }
            return ascending ? result : -result;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

}
