import entities.Carro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos carro irmão? ");
        int n = sc.nextInt();
        Carro[] carros = new Carro[n];


        for (int i = 0; i< carros.length; i++){
            sc.nextLine();
            carros[i] = new Carro();
            System.out.println("Nome: ");
            String nome = sc.nextLine();
            carros[i].setNome(nome);
            System.out.println("Cor: ");
            String cor = sc.nextLine();
            carros[i].setCor(cor);
            System.out.println("Marca: ");
            String marca = sc.nextLine();
            carros[i].setMarca(marca);
            System.out.println("Deseja ligar? (S - 1/N - 0)");
            int resposta = sc.nextInt();
            while (resposta != 0 && resposta != 1){
                System.out.println("Deseja ligar o carro? (S - 1/N - 0)");
                resposta = sc.nextInt();
            }
            if(resposta == 1)
                carros[i].ligarCarro();


            carros[i].passarMarcha(false);
        }

        for(Carro carro : carros){
            System.out.println(carro);
        }
    }
}