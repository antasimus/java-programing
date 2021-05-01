package day26_loops;
import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numb = scan.nextInt();

        if (numb <1 || numb > 10){
            System.out.println("EROR: invalid input!");
            return;
        }
        for(int i=1; i<=10; i++){
            System.out.println(numb + " x " + i + " = " + (numb*i));
        }
    }
}
