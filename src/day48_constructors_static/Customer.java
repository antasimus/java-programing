package day48_constructors_static;

public class Customer {
    private String name;
    private int id;

    //no arg constructor
    public Customer(){
        System.out.println("No-args constructor");
        name = "new customer";
        id = -1;
    }

    //add a Constructor with params
    public Customer(String name, int id){
        System.out.println("2-args constructor");
        this.name = name; //setName(name)
        this.id = id; //setId(id)
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

}
