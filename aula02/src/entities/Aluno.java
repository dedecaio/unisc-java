package entities;

public class Aluno {
    private Integer matricula;
    private String nome;
    private Double nP1,nP2,nTrab, nEx, media;

    public Aluno() {
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getnP1() {
        return nP1;
    }

    public void setnP1(Double nP1) {
        this.nP1 = nP1;
    }

    public Double getnP2() {
        return nP2;
    }

    public void setnP2(Double nP2) {
        this.nP2 = nP2;
    }

    public Double getnTrab() {
        return nTrab;
    }

    public void setnTrab(Double nTrab) {
        this.nTrab = nTrab;
    }

    public Double getnEx() {
        return nEx;
    }

    public void setnEx(Double nEx) {
        this.nEx = nEx;
    }

    public Double getMedia() {
        return media;
    }

    public void calculaMedia(){
        media =  (nP1+nP2+nTrab+nEx)/4D;
    }
}
