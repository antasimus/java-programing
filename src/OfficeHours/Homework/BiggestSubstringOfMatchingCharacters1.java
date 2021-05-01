package OfficeHours.Homework;

public class BiggestSubstringOfMatchingCharacters1 {
    public static void main(String[] args) {
        String word = "aaaabbbbbbbbcaaaaaaaaaaddeeaaaaaa";
        char biggestChar = ' ';
        int count = 1;
        int biggest = 0;

        for (int i = 0; i < word.length() - 1; i++) {
            if (word.charAt(i) == word.charAt(i + 1)) {
                count++;
                if (i + 1 == word.length() - 1) {
                    if (count > biggest) {
                        for (int j = 0;j < count;j++){
                            System.out.print(word.charAt(i));
                        }
                    }else{
                        for (int j = 0;j < biggest;j++){
                            System.out.print(biggestChar);
                        }
                    }
                }
            } else {
                if (i + 1 == word.length() - 1) {
                    if (count > biggest) {
                        biggest = count;
                        System.out.println(biggest + "" + word.charAt(i));
                        System.out.println(count + " count");
                    }else{
                        System.out.println("biggest " + biggest + "" + biggestChar);
                    }
                }
                if (count > biggest) {
                    biggest = count;
                    count = 1;
                    biggestChar = word.charAt(i);
                }else{
                    count = 1;
                }
            }
        }
    }
}
