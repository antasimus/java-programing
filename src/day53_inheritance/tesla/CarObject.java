package day53_inheritance.tesla;

public class CarObject {
    public static void main(String[] args) {
        ElectricCar ec1 = new ElectricCar("Tesla", "Model", 48190.0, 2021, 326);
        ec1.drive(50);
        System.out.println(ec1.toString());
        //System.out.println(ec1.make); ERROR
        //System.out.println(ElectricCar.make); ERROR - make needs to be public static
        System.out.println("ec1 make= " + ec1.getMake());
        System.out.println("ec1 model= " + ec1.getModel());
        System.out.println("ec1 price= " + ec1.getPrice());
        System.out.println("ec1 year= " + ec1.getYear());
        System.out.println("ec1 range= " + ec1.getRange());

        if(ec1.getPrice()>10000){
            System.out.println(ec1.getMake() +" - "+ec1.getModel() +" is out of my budget");
        }else{
            System.out.println("purchasing " + ec1.toString());
        }

        System.out.println(ElectricCar.getCount());

        ElectricCar ec2 = new ElectricCar("Tesla", "CyberTruck", 59990.0, 2022, 250);
        System.out.println(ec2.toString());
        System.out.println("Count = " + ec2.getCount()); //call static method using object
        System.out.println("Count = " + ElectricCar.getCount());//call static method using Classname

        Roadster ec3 = new Roadster("Roadster", 200000.0, 2022, 620);
        System.out.println(ec3.toString());
        ec3.drive(1000);
        ec3.drive(437);
        System.out.println(ec3.getCount());

        modelX ec4 = new modelX("Model X", 89990.0, 2021, 360);
        System.out.println(ec4.toString());
        ec4.drive(35);
        ec4.drive(7);
        System.out.println(ec4.getCount());



    }
}
