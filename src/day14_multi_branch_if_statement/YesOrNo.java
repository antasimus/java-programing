package day14_multi_branch_if_statement;
/*
add new package day14_multi_branch_if_statements
add new class YesOrNo
add main method

print "Are you sure you want to delete this file?"
selection > "y";
answer -> boolean variable

selection -- "y"
    true :
        "your file will be deleted"
        answer -> true
    false :
        "file deletion cancelled"
        answer -> false


"Did file get deleted? - true"
 */
public class YesOrNo {
    public static void main(String[] args) {
        System.out.println("Are you sure you want to delete this file?");
        char selection = 'n';
        boolean answer;
        String result;
        if (selection == 'y'){
            System.out.println("Your file will be deleted");
            answer = true;
            result = "deleted";
        } else{
            System.out.println("File deletion cancelled");
            answer = false;
            result = "not deleted";
        }
        System.out.println("Did file get deleted? - " + answer);
        System.out.println("Did file get deleted? - " + result);
    }
}
