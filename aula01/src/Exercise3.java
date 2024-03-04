import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        while (y > x){
            System.out.println("Número maior que o primeiro, este DEVE ser menor");
            y = sc.nextInt();
        }


        int accumulator = 0;

        for(int i = y+1; i<x-1; i++){
            if(i % 2!=0){
                accumulator+=i;
            }
        }
        System.out.printf("A soma dos números ímpares entre %d e %d é %d",y,x,accumulator);
    }
}
