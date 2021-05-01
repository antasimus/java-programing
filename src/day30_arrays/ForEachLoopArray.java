package day30_arrays;

public class ForEachLoopArray {
    public static void main(String[] args) {
        int[] data =  { 32,532,1,5454,22,123,543,999,321,3};

        for(int eachNum : data){
            System.out.println(eachNum);
        }
        for(int n : data){
            System.out.print(n + " ");
        }
// repeat above with regular for loop:
        System.out.println();
        System.out.println("Using the regular for loop: ");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
        System.out.println(data[data.length -1]);

        // print all number backwards in same line:

        System.out.println("Reverse printing:");

        for (int idx = data.length - 1; idx >=0; idx--){
            System.out.print(data[idx] + " ");
        }
    }
}
