package day25_loops;

public class FizzBuzzForLoop {
    public static void main(String[] args) {
        String fizz="", buzz="", fizzbuzz="", none="";

        for(int i=0; i<=100; i++ ){
            if(i%3==0 && i%5==0){
                fizzbuzz +=i + " ";
            }else if(i%3==0){
                fizz +=i + " ";
            }else if(i%5==0){
                buzz +=i + " ";
            }else{
                none +=i + " ";
            }
        }
        System.out.println("fizzbuzz = " + fizzbuzz);
        System.out.println("fizz = " + fizz);
        System.out.println("buzz = " + buzz);
        System.out.println("none = " + none);
    }
}
