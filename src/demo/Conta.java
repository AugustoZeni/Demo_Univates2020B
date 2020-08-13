
package demo;

public class Conta {
    private int conta;
    private String nome;
    private float saldo;

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    public void saque(float valorSaque){
        this.saldo -= valorSaque;
    }
    
    public void deposito(float valorDeposito){
        this.saldo += valorDeposito;
    }
    
    @Override
    public String toString(){
        return "Conta: " + this.conta + " Nome: " + this.nome + " Saldo: " + this.saldo; 
    }
}
