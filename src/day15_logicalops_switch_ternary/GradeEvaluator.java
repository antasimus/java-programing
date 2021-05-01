package day15_logicalops_switch_ternary;
import java.util.Scanner;
public class GradeEvaluator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your exam grade: ");
        char grade = scan.next().charAt(0);
        if (grade == 'A' || grade == 'a' || grade == 'B' || grade == 'b' || grade == 'C' || grade == 'c'){
            System.out.println("Exam passed with grade " + grade);
        }else if(grade == 'D' || grade == 'd'){
            System.out.println("Qualify for retake of the exam.");
        }else if(grade == 'E' || grade == 'e'){
            System.out.println("You failed exam!");
        }else{
            System.out.println("Invalid entry!");
        }

    }
}
