package day17_ternary_nested_conditions;

public class TernaryExamples {
    public static void main(String[] args) {
        int score1 = 61;


        // With TERNARY
        int score = 88;
        String result = (score>60) ? "Pass" : "Fail";
        System.out.println("result = " + result);

        String quality = "Good";
        int rating = quality.equals("Good") ? 100 : 0;
        System.out.println("rating = " + rating);

        int score3= 100;
        char grade = (score > 90) ? 'A' : 'B';
//        if (score>90){
//            grade = 'A';
//        }else{
//            grade = 'B';
//        }

    }
}
