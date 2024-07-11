package teste01;

public class ContaBanco {
    public float numConta;
    protected String tipo;
    private String dono;
    private Boolean status;
    private float saldo;

    public void estadoAtual(){
        System.out.println("---------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Status: " + this.getStatus());
        System.out.println("Saldo: " + this.getSaldo());
    }


    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if (t == "CC"){
            this.setSaldo(50);
        } else if( t == "CP") {
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso");
    }

    public void fecharConta(){
        if (this.getSaldo() > 0){
            System.out.println("Conta não pode ser fechado porque ainda tem dinheiro");
        } else if (this.getSaldo() < 0) {
            System.out.println("Conta não pode ser fechada devido a dividas");
        }else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso");
        }
    }

    public void depositar(float v){
        if (this.getStatus()){
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Depósito realizado naconta de: " +this.getDono());
        }else {
            System.out.println("Impossível depositar em uma conta fechada!");
        }
    }

    public void sacar(float v){
        if (this.getStatus()) {
            if (this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Dinheiro sacado com sucesso. O valor atual é de : " + this.getSaldo());
            } else {
                System.out.println("Saldo insuficiente ");
            }
        }
           else{
                System.out.println("impossível sacar de uma conta fechada!");
            }


    }

    public void pagarMensal(){
        int v = 0;
        if (this.getTipo() == "CC"){
            v = 12;
        } else if (this.getTipo() == "CP") {
            v = 20;
        }
        if (this.getStatus()){
           this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso por : " + this.getDono());
        } else {
            System.out.println("Impossível pagar uma conta fechada!");
        }


    }

    public ContaBanco(){
        this.setSaldo(0);
        this.setStatus(false);
    }


    public float getNumConta() {
        return this.numConta;
    }

    public void setNumConta(float n) {
        this.numConta = n;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String t) {
        this.tipo = t;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }


}
