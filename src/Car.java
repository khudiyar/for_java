public class Car {
    private String color;
    private String model;
    private double price;
    private String transmission;

    public Car() {

    }

    public Car(String color, String model, double price, String transmission) {
        this.color = color;
        this.model = model;
        this.price = price;
        this.transmission = transmission;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public void info(){
        System.out.println("Model: "+model+". Rangi: "+color+". Narxi: "+price+". Transmissiya: "+transmission);
    }
}
