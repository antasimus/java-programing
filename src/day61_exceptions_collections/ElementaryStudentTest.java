package day61_exceptions_collections;

public class ElementaryStudentTest {
    public static void main(String[] args) {
        try {
            ElementaryStudent el1 = new ElementaryStudent();
            el1.setName("Misha");
            el1.setAge(38);
            System.out.println(el1.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("---EXECUTION COMPLETED---");
    }
}
