package day43_list_custom_classes;

public class Person {
    String firstName;
    int age;
    char gender;
    public void Speak(){
        System.out.println("Person is speaking");
    }
}
 class People {
     public static void main(String[] args) {
         Person person1 =  new Person();
         person1.firstName = "Bob";
         person1.age = 33;
         person1.gender = 'M';

         System.out.println("Name: " + person1.firstName);
         System.out.println("Age" + person1.age);
         System.out.println("Gender: "+ person1.gender);
         person1.Speak();

         Person person2 = new Person();
         person2.firstName = "Mike";
         person2.age = 22;
         person2.gender = 'M';

         System.out.println(person2.firstName);
         System.out.println(person2.age);
         System.out.println("Gender: "+ person2.gender);
         person2.Speak();
     }
 }