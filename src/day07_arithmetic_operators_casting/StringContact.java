package day07_arithmetic_operators_casting;

public class StringContact {
    public static void main(String[] args) {
        System.out.println("Java" + 5 + 3);
        System.out.println("Java" + (5+3));
        System.out.println(5 + 3 + "Java");
        System.out.println(5 + (3 + "Java"));
        System.out.println();
        System.out.println("hello" + 1+2+3);
        System.out.println("hello" + (1+2+3));

        String str1 = "hello";
        String str2 = "friends";
        System.out.println(str1+str2);
        System.out.println(str1 +" " + str2);

        int num1 = 7, num2 = 8;
        System.out.println(num1 + num2);
        System.out.println(num1 +" "+num2);
        System.out.println(num1 +""+num2);

        char char1 = 'a', char2 = 'b';
        System.out.println(char1 + char2);
        System.out.println(char1 + "" + char2);


    }
}
