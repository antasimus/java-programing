package day50_inheritance;

public class Teacher extends Person {
    int teacherID;
    public void each(String topic) {
        System.out.println("Teacher is teaching " + topic);
    }
}
