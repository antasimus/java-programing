package day61_exceptions_collections;

public class ElementaryStudent {
    private String name;
    private int age;

    public ElementaryStudent (){}

    public ElementaryStudent(String name, int age) {
        setName(name);
        setAge(age);
    }

    @Override
    public String toString() {
        return "ElementaryStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        // check if name is null first, otherwise we might get nullPointer exception
        if(name==null || name.isEmpty()){
            throw new IllegalArgumentException("Name can not be empty!");
        }
        //if name is all numbers, or stats with number
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 5 || age > 12){
            throw new IllegalArgumentException("Age can not be less than 5 or more than 12!");
        }
        this.age = age;
    }
}
