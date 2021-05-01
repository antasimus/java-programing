package day11_comparison_operators;

public class BooleanComparisonOperators {
    public static void main(String[] args) {
        System.out.println(10 == 10);
        System.out.println(1000 > 100);
        System.out.println(985.44 < 98547.8);
        System.out.println(10 <= 11);
        System.out.println(5 >= 3);
        System.out.println(-100 != 44);

        int a=100, b=200;
        System.out.println(a==b);
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a>=b);
        System.out.println(a<=b);
        System.out.println(a!=b);

        boolean result= 5==5;
        System.out.println("result="+result);

        result=33>44;
        System.out.println("result="+result);
        
        boolean result2=88<99;
        System.out.println("result2 = " + result2);
        
        boolean result3= 10>=10;
        System.out.println("result3 = " + result3);
        
        boolean result4= 123<=124;
        System.out.println("result4 = " + result4);
        
        boolean result5= 2!=2;
        System.out.println("result5 = " + result5);

        String city="Seattle";
        System.out.println(city == "Seattle");
        System.out.println(city == "Baku");
        
        String name="Nadir";
        boolean checkName= name == "Nadir";
        System.out.println("checkName = " + checkName);
        
        checkName = name != "Misha";
        System.out.println("checkName = " + checkName);

    }
}
