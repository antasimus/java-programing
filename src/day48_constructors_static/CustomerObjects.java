package day48_constructors_static;

import java.util.ArrayList;
import java.util.List;

public class CustomerObjects {
    public static void main(String[] args) {
        Customer cs1 = new Customer();
        System.out.println(cs1); //print with default values
        cs1.setId(1);
        cs1.setName("Misha");
        System.out.println(cs1);

        Customer cs2 = new Customer("Anta", 2);
        Customer cs3 = new Customer("John Wall III", 4787);
        System.out.println(cs2);
        System.out.println(cs3);

        //array of Customers
        Customer[] todaysCustomers = {cs1, cs2, cs3, new Customer("Boka", 357)};

        //arrayList of Customer Objects
        List<Customer> customerList = new ArrayList<>();
        customerList.add(cs1);
        customerList.add(cs2);
        customerList.add(cs3);
        customerList.add(new Customer("Bobana", 135));
        customerList.add(new Customer("Abdul", 9763));


        //print info of 1st customer object in array and arrayList.
        System.out.println(todaysCustomers[0]);
        System.out.println(customerList.get(0).toString());

        System.out.println(customerList);//print toString() info of all Customer objects
        for (int i = 0; i < customerList.size(); i++) {
            System.out.println(customerList.get(i));
        }
        System.out.println("----- FOR EACH LOOP -----");
        for(Customer eachCustomer : customerList){
            System.out.println(eachCustomer);
        }
        //print only names of customers
        System.out.println("----- NAMES OF CUSTOMERS -----");
        customerList.forEach(each -> System.out.println(each.getName()));
        System.out.println("////");
        for(Customer eachCustomer : customerList){
            System.out.println(eachCustomer.getName());
        }



    }
}
