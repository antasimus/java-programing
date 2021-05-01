package day38_methods;

public class RecursiveMethod {
    public static void main(String[] args) {
        int num =1;
        printNums(num);
    }
    public static void printNums(int num){
        System.out.print(num+" ");
        num++;
        if (num<=100) {
            printNums(num);
        }
    }
}
