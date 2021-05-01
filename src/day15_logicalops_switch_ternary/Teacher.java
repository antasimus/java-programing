package day15_logicalops_switch_ternary;
import java.util.Scanner;
public class Teacher {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Chose your teacher for today: Saim, Murodil, Nadir.");
        String teacher = scan.next();
        if (teacher.equals("Saim") || teacher.equals("Murodil")){
            System.out.println("It is Java class with " + teacher);
        }else if(teacher.equals("Nadir")){
            System.out.println("It is soft skills class with" + teacher);
        }else{
            System.out.println("Wrong entry. " + teacher + " doesn't teach in Cybertek!");
        }
        System.out.println("");

        String company ="Apple";
        double salary = 100_000.0;
        if(company.equals("Apple") || salary >= 100_000){
            System.out.println("Accept offer");
        } else {
            System.out.println("Keep seeking!");
        }
    }
}
