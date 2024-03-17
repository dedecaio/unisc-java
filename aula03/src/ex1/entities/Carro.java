package ex1.entities;

public class Carro {
    private String cor;
    private String nome;
    private String marca;
    private int marcha;
    private boolean ligar;

    public Carro() {
        ligar = false;
        marcha = 0;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isLigar() {
        return ligar;
    }

    public void ligarCarro(){
        passarMarcha(false);
        if(isLigar())
            System.out.println("Carro já está ligado");
        else {
            ligar = true;
            System.out.println("Ligando carro...");
        }
    }


    public void passarMarcha(boolean isRe){
        if (isRe)
            marcha = -1;
        else {
            if (marcha < 5)
                marcha++;
        }
    }

    @Override
    public String toString() {
        return "Carro{" +
                "cor='" + cor + '\'' +
                ", nome='" + nome + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
}
