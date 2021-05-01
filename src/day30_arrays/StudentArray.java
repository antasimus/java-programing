package day30_arrays;

public class  StudentArray {
    public static void main(String[] args) {
        String[] student1 = new String[5];
        student1[0] = "AD1234";
        student1[1] = "Misha";
        student1[2] = "Antic";
        student1[3] = "B30";
        student1[4] = "202-600-6060";

        String[] student2 = {"MK4421" , "Milos" , "Anta" , "B22" , "202-642-8999"};

        System.out.println("student1 ID = " + student1[0]);
        System.out.println("student1 First Name = " + student1[1]);
        System.out.println("student1 Last Name = " + student1[2]);
        System.out.println("student1 Group = " + student1[3]);
        System.out.println("student1 Phone# = " + student1[4]);
        System.out.println("student data length: " + student1.length);

        /**check if student1 data array contains 5 items.
         true: PASS: data array has correct length
         false: FAIL: data array has incorrect length */

        if (student1.length == 5) {
            System.out.println("PASS: data array has correct length");
        } else {
            System.out.println("FAIL: data array has incorrect length");
        }

        /**
         check if student1 and student2 arrays have same number of data
         TRUE: PASS: data arrays length match
         FALSE: FAIL: data arrays length mismatch
         */
        if (student1.length == student2.length) {
            System.out.println("PASS: data arrays length match");
        } else {
            System.out.println("FAIL: data arrays length mismatch");
        }

        /**
         read from array and print firstname and lastname in all uppercase
         ADAM SMITH
         */
        //  "Adam" --> "ADAM"                "Smith"  --> "SMITH"
        System.out.println(student1[1].toUpperCase() + " " + student1[2].toUpperCase());
    }
}
