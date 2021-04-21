
package aulap3;

import javax.swing.JOptionPane;

public class Principal {
    public static void main(String args[]) {
        ContaPoupanca cp;
        cp = new ContaPoupanca();
        cp.depositar(1000);
        cp.reajustar(0.2);  
        cp.sacar(500);
        System.out.println("Saldo atual da conta poupanca: "+cp.getSaldo());
        
        Contas c = new Contas();
        c.tipoConta();
        cp.tipoConta();
 
        
        String name = JOptionPane.showInputDialog("Digite seu nome");
        JOptionPane.showMessageDialog(null, "Bem vindo " + name);
    }  
}
        
