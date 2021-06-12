package day52_inheritance.discordUsers;

public class Admin extends User{

    @Override
    public String toString() {
        return "User{" +
                "role='" + getRole() + '\'' +
                ", name='" + getName() + '\'' +
                ", id=" + getId() +
                '}';
    }

}
