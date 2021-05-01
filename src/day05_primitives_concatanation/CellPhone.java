package day05_primitives_concatanation;

public class CellPhone {
    public static void main(String[] args){
        String brand = "Samsung";
        String model = "S20 Ultra";
        String color = "Sapce Gray";
        double price = 1299.99;
        short storage = 256;
        boolean hasCamera = true;

        System.out.print("Brand: \t\t\t");
        System.out.println(brand);
        System.out.print("Model: \t\t\t");
        System.out.println(model);
        System.out.print("Color: \t\t\t");
        System.out.println(color);
        System.out.print("Price: \t\t\t$");
        System.out.println(price);
        System.out.print("Storage: \t\t");
        System.out.print(storage);
        System.out.println("GB");
        System.out.print("Has camera: \t");
        System.out.println(hasCamera);
        System.out.println();

        System.out.println("Brand: \t\t\t" + brand);
        System.out.println("Model: \t\t\t" + model);
        System.out.println("Color: \t\t\t" + color);
        System.out.println("Price: \t\t\t$" + price);
        System.out.println("Storage: \t\t" + storage + "GB");
        System.out.println("Has camera: \t" + hasCamera);

    }
}
