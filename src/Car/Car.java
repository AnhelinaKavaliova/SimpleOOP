package Car;

public class Car {
    private String brand;
    private String model;
    private int yearOfManufacture;

    public Car(String brand, String model, int yearOfManufacture){
        this.brand = brand;
        this.model = model;
        this.yearOfManufacture = yearOfManufacture;
    }
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public void printInfo(){
        System.out.println("Brand:" + brand + " Model:" + model + " Year of manufacture:" + yearOfManufacture);
    }
}
