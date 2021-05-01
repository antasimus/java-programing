package day32_arrays_split;

public class CountUsingSplit {
    public static void main(String[] args) {
        String cats = "bengal cat, tabby cat, persian ca, no cat here";
        int count = 0;
        for (int i = 0; i < cats.length() -2; i++) {
            if (cats.substring(i,i+3).equalsIgnoreCase("cat")){
                count++;
            }
        }
        System.out.println("Number of cats: " + count);

        String catTypes = "bengal cat, tabby cat, persian cat, no cat here, some other cat";
        String[] catsArray = catTypes.split("cat");
        System.out.println("Number of 'cat' = " + (catsArray.length - 1));

        for (String type: catsArray){
            System.out.println(type);
        }

    }
}
