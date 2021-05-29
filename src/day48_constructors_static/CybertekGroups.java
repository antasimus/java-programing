package day48_constructors_static;

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

    }
}
