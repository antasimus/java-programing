package day08_casting_scanner;

public class CastingExamples {
    public static void main(String[] args) {
        double num13 = 55.3;
        float num14 =(float) num13;
        System.out.println("Num13=" + num13);
        System.out.println("Num14=" + num14);

        double num15=1234.5;
        int num16=(int)num15;
        System.out.println("Num15=" + num15);
        System.out.println("Num16=" + num16);

        int num17=254587;
        byte num18=(byte)num17;
        System.out.println("Num17=" + num17);
        System.out.println("Num18=" + num18);

        char letter ='M';
        int numLetter = letter;

        System.out.println("Letter M is number " + numLetter);

        char ch = 'J';
        int chNum = ch;
        System.out.println(chNum);

    }
}
