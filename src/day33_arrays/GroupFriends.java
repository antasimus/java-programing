package day33_arrays;

public class GroupFriends {
    public static void main(String[] args) {
        String group30 = "Mendbayar Mohamed Bahareh Zalina Svetlana Ahmed Ainur Michael Ziba Martina Dorjsuren";
        String adds = "Happy holiday";
        String[] group30Array = group30.split(" ");
        for(String name : group30Array){
            System.out.println(adds + " " + name + "!");
        }
    }
}
