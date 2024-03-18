import entities.ConversorDeUnidades;

public class Main {
    public static void main(String[] args) {
        double distancia = ConversorDeUnidades.metrosParaPes(10000);
        System.out.printf("A distância da terra à lua é %.2f pes", distancia);
    }
}