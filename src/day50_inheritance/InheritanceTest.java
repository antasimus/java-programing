package day50_inheritance;

public class InheritanceTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Misha";
        p1.age = 30;
        p1.talk();
        p1.walk();
        p1.work("SDET");

        Teacher t1 = new Teacher();
        t1.teacherID = 1234;
        t1.name = "Saim";
        t1.age = 35;
        t1.talk();
        t1.walk();


        Student student = new Student();
        student.name = "Anta";
        student.age = 33;
        student.walk();
        student.talk();
        student.work("Java programmer");
        student.school = "CybertekSchool";
        student.study("java programming inheritance");

    }
}
