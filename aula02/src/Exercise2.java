import entities.Aluno;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Aluno a = new Aluno();

        System.out.println("Digite a nota da prova 1:");
        double nP1 = sc.nextDouble();
        a.setnP1(nP1);
        System.out.println("Digite a nota da prova 2:");
        double nP2 = sc.nextDouble();
        a.setnP2(nP2);
        System.out.println("Digite a nota do Trabalho:");
        double nTrab = sc.nextDouble();
        a.setnTrab(nTrab);
        System.out.println("Digite a nota do Exame:");
        double nEx = sc.nextDouble();
        a.setnEx(nEx);

        a.calculaMedia();

        System.out.printf("Média do aluno: %.2f\n",a.getMedia());
        System.out.print("Situação: ");
        if(a.getMedia() < 7D)
            System.out.println("REPROVADO");
        else
            System.out.println("APROVADO");

    }
}
