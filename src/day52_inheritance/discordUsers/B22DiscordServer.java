package day52_inheritance.discordUsers;

public class B22DiscordServer {
    public static void main(String[] args) {
        User user1 = new User();
        user1.setId(4787);
        user1.setName("Misha");
        user1.setRole("Student");

        Admin admin1 = new Admin();
        admin1.setId(1234);
        admin1.setName("Salim");
        admin1.setRole("Admin");

        System.out.println(user1);
        System.out.println(admin1);
    }
}
