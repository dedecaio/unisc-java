import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        float[] vetor = new float[n];

        for(int i = 0; i < n; i++){
            vetor[i] = sc.nextFloat();
        }
        float soma = 0, maior = vetor[0], menor = vetor[0];

        for(int i = 0; i < n; i++){
            soma+=vetor[i];
            if (vetor[i] < menor)
                menor = vetor[i];

            if (vetor[i] > maior)
                maior = vetor[i];
        }
        float media = soma/n;

        System.out.println();
        System.out.println("Maior valor: "+maior);
        System.out.println("Menor valor: "+menor);
        System.out.printf("Média: %.2f\n",media);
        System.out.printf("Soma total: %.2f\n",soma);



    }
}
