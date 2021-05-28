package day47_constructors;

public class AddressList {
    public static void main(String[] args) {
        Address cybertekAddress = new Address();
        cybertekAddress.setStreet("7925 Jones Brnach Dr Suite 3300");
        cybertekAddress.setCity("Fort Washington");
        cybertekAddress.setState("MD");
        cybertekAddress.setZipCode("20746");

        System.out.println("CybertekSchool address: " + cybertekAddress.toString());
        cybertekAddress.setStreet("7925 Jones Branch Dr Suite 3200");

        System.out.println("Address after update = " + cybertekAddress);
        System.out.println("street info = " + cybertekAddress.getStreet());

        Address newAddress = new Address();
        System.out.println(newAddress.toString());
    }
}
