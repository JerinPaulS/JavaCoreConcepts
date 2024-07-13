public class Car extends Vehicle {

    // Data variables
    private String name;
    private String color;
    private String brand;
    private long cc;
    private String type;
    static String gears;

    // Data methods
    public String getName() {
        return this.name;
    }

    public String getColor() {
        return this.color;
    }

    public String getBrand() {
        return this.brand;
    }

    public long getCc() {
        return this.cc;
    }

    public String getType() {
        return this.type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setCc(long cc) {
        this.cc = cc;
    }

    public void setType(String type) {
        this.type = type;
    }

    // Method overriding | Runtime polymorphism | Dynamic polymorphism
    public String getEngine() {
        return "petrol turbo";
    }

    public String getTypeVal() {
        Vehicle vehicle = new Vehicle();
        return vehicle.getType();
    }

}