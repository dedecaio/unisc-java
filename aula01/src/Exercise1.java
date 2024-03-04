import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome = sc.nextLine();
        System.out.println("println: Bem vindo ao Java, "+nome);
        System.out.printf("printf: Bem vindo ao Java, %s",nome);

        sc.close();
    }
}