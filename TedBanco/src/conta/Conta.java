package conta;

public class Conta {
    private int numero_conta;
    private double saldo;
    
    
    public Conta(int numeroconta){
        this.numero_conta=numeroconta;
    }
    public Conta(int numeroconta,double saldo){
        this.numero_conta=numeroconta;
        this.saldo=saldo;
    }
    
    public void Deposito(double valor){
        this.saldo+=valor;
    }
    boolean Saque(double valor){
        if (this.saldo<valor){
            return false;
        } else {
            this.saldo-=valor;
            return true;
        }
    }

    public int getNumero_conta() {
        return numero_conta;
    }

    public void setNumero_conta(int numero_conta) {
        this.numero_conta = numero_conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Conta: " + this.numero_conta + " - Saldo R$: " + saldo + '\n';
    }
}
