package ex2and3.entites;

public class Trator {
    public String cor;
    private String marca;
    private Integer marcha;
    protected Boolean revisado;
    protected  Boolean ligado;

    public Trator() {
        this.marcha = 0;
        this.revisado = false;
        this.ligado = false;
    }

    public Trator(String cor, String marca) {
        this.cor = cor;
        this.marca = marca;
        this.marcha = 0;
        this.revisado = false;
        this.ligado = false;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Integer getMarcha() {
        return marcha;
    }


    public void mostrarCarac(){
        System.out.println("Carro: " +marca+" | Cor: "+cor+" | Na marcha: " +
               marcha+" | Revisado: " +revisado+" | Ligado: "+ligado );
    }

    public void ligar() {
        if (ligado)
            System.out.println("Trator já está ligado");
        else {
            ligado = true;
            System.out.println("Trator foi ligado");
        }
    }
    public void andar(){
        if(ligado)
            System.out.println("Andando...");
        else
            System.out.println("O trator não foi ligado");
    }

    public void desligar() {
        if (!ligado)
            System.out.println("Trator já está desligado");
        else {
            ligado = false;
            System.out.println("Trator foi desligado");
        }
    }

    public void reduzirMarcha(){
        if(marcha > 0)
            marcha--;
        else System.out.println("Não foi possível reduzir a marcha");
    }

    public void subirMarcha(){
        if(marcha < 3)
            marcha++;
        else System.out.println("Não foi possível subir a marcha");
    }
}
