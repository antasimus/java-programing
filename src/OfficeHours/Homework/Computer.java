package OfficeHours.Homework;
/*
Create a class named Computer
create a main method

    - Create variables with most appropriate datatypes:

        - brand, processor, ram memory, storage memory, has monitor, has wifi card, description, price, cpu, color, number of monitors, number of usb slots, has usb 3.0

        - Print out all the variables and values of the computer
 */
public class Computer {
    public static void main(String[] args) {
        String brand="Mac", procesor="Intel", description="All in one", cpu="i7", color="Space gray";
        int ram=16, rom=512, numMonitors=1, usb=3;
        boolean monitor=true, wifi=true, usb3_0=false;
        System.out.println("Brand - \t\t\t"+brand);
        System.out.println("Type - \t\t\t\t"+description);
        System.out.println("Processor - \t\t"+procesor);
        System.out.println("CPU - \t\t\t\t"+cpu);
        System.out.println("RAM - \t\t\t\t"+ram+"GB");
        System.out.println("HD memory - \t\t"+rom+"GB");
        System.out.println("Has monitor - \t\t"+monitor);
        System.out.println("Numb of monitors -\t"+numMonitors);
        System.out.println("Has a wifi - \t\t"+wifi);
        System.out.println("Has USB - \t\t\t"+usb3_0);
        System.out.println("USB ports \t\t\t"+usb);
        System.out.println("Color - \t\t\t" + color);

    }
}
