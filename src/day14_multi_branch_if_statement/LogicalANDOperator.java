package day14_multi_branch_if_statement;

public class LogicalANDOperator {
    public static void main(String[] args) {
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);

        System.out.println(10>5 && 1==1);
        System.out.println(10>5 && 1>1);
        System.out.println(10==5 && 1==1);
        System.out.println(10==5 && 1<1);
        
        int a=10, b=5;
        boolean c= a>5 && b>3;
        System.out.println("c = " + c);
    }
}
