package ex2and3;

import ex2and3.entites.Trator;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Trator trator = new Trator();
        System.out.println("Criando Trator");
        System.out.println("Qual a marca do trator? ");
        trator.setMarca(sc.nextLine());
        System.out.println("Qual a cor dele?");
        trator.cor = sc.nextLine();


        int n = 14;
        while (n != 0){
            System.out.println("# Trator #");
            System.out.println("1 - Ligar Trator.");
            System.out.println("2 - Analisar Trator.");
            System.out.println("3 - Andar com o Trator.");
            System.out.println("4 - Reduzir Marcha.");
            System.out.println("5 - Subir Marcha.");
            System.out.println("6 - Desligar Trator.");
            System.out.println("7 - Mudar cor do Trator.");
            System.out.println("8 - Mudar marca Trator.");
            System.out.println("0 - Sair.");
            n = sc.nextInt();
            sc.nextLine();
            switch (n){
                case 1:
                    trator.ligar();
                    continue;
                case 2:
                    trator.mostrarCarac();
                    continue;
                case 3:
                    trator.andar();
                    continue;
                case 4:
                    trator.reduzirMarcha();
                    continue;
                case 5:
                    trator.subirMarcha();
                    continue;
                case 6:
                    trator.desligar();
                    continue;
                case 7:
                    corTrator(trator,sc);
                    continue;
                case 8:
                    marcaTrator(trator,sc);
                    continue;
                case 0:
                    break;
                default:
                    System.out.println("Opção Inválida! Tente Novamente");
            }
        }
    }

    private static void marcaTrator(Trator trator, Scanner sc) {
        System.out.println("Qual a nova marca do trator? ");
        trator.setMarca(sc.nextLine());
    }

    private static void corTrator(Trator trator, Scanner sc) {
        System.out.println("Qual a nova cor dele?");
        trator.cor = sc.nextLine();
    }
}
