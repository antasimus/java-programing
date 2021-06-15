package day53_inheritance.tesla;

public class ElectricCar {
    private String make;
    private String model;
    private double price;
    private int year;
    private int range;
    private static int count;

    public ElectricCar(String make, String model, double price, int year, int range){
        setMake(make); //this.make = make; same functionality
        //setModel(model);
        this.model = model;
        //setPrice(price);
        this.price = price;
        //setYear(year);
        this.year = year;
        //setRange(range);
        this.range = range;
        count++;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", year=" + year +
                ", range=" + range +
                '}';
    }

    protected void drive(int miles){
        if(range == 0 || range - miles <0){
            System.out.println("ERROR: Cannot drive that far, need to charge");
        }else{
            range -= miles;
            System.out.println("Driving "+miles+" miles ...");
        }

    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        if(make.isEmpty()){
            System.out.println("ERROR: Make can not be blank!");
        }else {
            this.make = make;
        }
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
