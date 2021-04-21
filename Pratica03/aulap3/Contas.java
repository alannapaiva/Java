
package aulap3;

public class Contas {
    double saldo;
    public int numero;

    public Contas() {
        this.saldo = 0;
    }
    
    public void depositar(double valor) {
        this.saldo += valor;
    }
    
    public void sacar(double valor) {
        if(valor<=saldo) {
            double novoSaldo = saldo - valor;
            this.saldo = novoSaldo;
            System.out.println("Saque efetuado com sucesso");
        }
              
        else System.out.println("Saldo insuficiente");
    }
    
    public void tipoConta(){
        System.out.println("Tipo de conta: comum");
    }
    
    public double getSaldo() {
        return saldo;
    }

    void reajustar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
}

