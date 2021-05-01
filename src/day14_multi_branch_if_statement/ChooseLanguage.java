package day14_multi_branch_if_statement;
import java.util.Scanner;
public class ChooseLanguage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose your language: ");
        int L = scan.nextInt();
        if (L == 1){
            System.out.println("Hello, thank you for you call");
        }else if (L == 2){
            System.out.println("Hola, gracias para llamar");
        }else if (L == 3){
            System.out.println("Privet, spasibo za vash zvonik");
        }else if (L == 4){
            System.out.println("Bonjour, merci pour votre appel");
        }else if (L == 5){
            System.out.println("Zdravo, hvala na pozivu");
        }else {
            System.out.println("Wrong selection!");
        }
    }

}
