package day52_inheritance.discordUsers;

public class Admin extends User{

    public Admin(){
        super();
        System.out.println("Admin class constructor");
    }

    public Admin(String name, int id){
        super("Admin", name, id);//public User(String role, String name, int id)
        System.out.println("Admin class 2 args constructor");
    }

    @Override
    public String toString() {
        return "User{" +
                "role='" + getRole() + '\'' +
                ", name='" + getName() + '\'' +
                ", id=" + getId() +
                '}';
    }

}
