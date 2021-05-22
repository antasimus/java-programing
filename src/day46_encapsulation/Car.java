package day46_encapsulation;

public class Car {
    //encapsulated/hidden instance variables
    private String model;
    private int year;
    private int mileage;
    //setter method for model
    public void setModel(String carModel){
        model = carModel;
    }
    //getter method for model
    public String getModel() {
        return model;
    }
    //setter for year
    public void setYear(int carYear){
        year = carYear;
    }
    //getter for year
    public int getYear(){
        return year;
    }
    public void setMileage(int carMileage){
        mileage = carMileage;
    }
    public int getMileage(){
        return mileage;
    }

    @Override
    public String toString() {
        return "Car{"+"model='"+model+""+", year="+year+", mileage=" + mileage +"}";
    }
}
