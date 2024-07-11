package aula04;

public class Caneta {
    public String modelo;
    private float ponta;
    private String cor;
    private boolean tampada;

    public Caneta(String m, float p, String c) {
        this.modelo = m;
        this.ponta = p;
        this.cor = c;
        this.tampada = tampada;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }

    public void status() {
        System.out.println(this.cor);
        System.out.println(this.modelo);
        System.out.println(this.ponta);
        System.out.println("tampada: " +this.tampada);
    }
}






