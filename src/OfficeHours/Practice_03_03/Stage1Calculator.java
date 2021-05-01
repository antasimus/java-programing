package OfficeHours.Practice_03_03;

/*
Make a class Stage1Calculator
create a main method

    - Declare two double variables
    - Declare 5 more double variables for each operation.
        > Execute all the operation between the first two numbers
    - Print out operations
        Ex: if the nums are 5 and 10
            5 + 10 = 15
            5 - 10 = -5
            etc..
 */
public class Stage1Calculator {
    public static void main(String[] args) {
        double d1=5, d2=10;
        double plus, minus, puta,procenat, kroz;
        plus=d1+d1;
        minus=d1-d2;
        puta=d1*d2;
        kroz=d1/d2;
        procenat=d1%d2;

        System.out.println(d1+" + " + d2 +" = " + plus);
        System.out.println(d1+" - " + d2 +" = " + minus );
        System.out.println(d1+" * " + d2 +" = " + puta);
        System.out.println(d1+" / " + d2 +" = " + kroz);
        System.out.println(d1+" % " + d2 +" = " + procenat); // remainder je %



    }
}
