
package trabalhojava2;

import javax.swing.JOptionPane;

/**
 *
 * @author alann
 */
public class Principal {

       public static ContaEspecial cep = new ContaEspecial();
       public static ContaPoupanca cp = new ContaPoupanca();
       public static Contas cc = new Contas();
       public static void main(String[] args) {
       
        JOptionPane.showMessageDialog(null, "Bem vindo(a)!");
        
       new Cadastro().setVisible(true);
       
    }
}
