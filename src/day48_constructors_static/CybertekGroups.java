package day48_constructors_static;

import java.util.Arrays;

public class CybertekGroups {
    public static void main(String[] args) {
        // dpendency injection. Group object creatin depends on String name
        Group group1 = new Group("CyberBugs");
        //print size of member
        System.out.println(group1.getMembers().size());
        group1.addMember("Berek");
        group1.addMember("Pavel");
        group1.addMember("Elvin");
        group1.addMember("Ali");
        group1.addMember("Parvin");
        group1.addMember("Rasim");
        group1.addMember("Maria");
        group1.addMember("Misha");
        group1.addMember("Masha");
        System.out.println(group1.getMembers().size());
        System.out.println(group1.toString());

        Group group2 = new Group("CyberCats");
        group2.setMembers(Arrays.asList("Vlaja", "Gaja", "Raja", "Paja", "Donald", "Miki", "Mini", "Silja"));
        //print all members. not toString()
        System.out.println("grou2 members = " + group2.getMembers());

        //use if statement to check if Donald is in a groupa
        if(group2.getMembers().contains("Donald")){
            System.out.println("Donald is a member of group2");
        }else{
            System.out.println("Donal is not a member of group2");
        }
    }
}
