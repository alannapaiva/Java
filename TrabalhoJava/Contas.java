
package trabalhojava2;

/**
 *
 * @author alann
 */
import javax.swing.JOptionPane;

public class Contas {
    private String nomeCorrente;
    private String senhaCorrente;
    private int numeroCorrente;
    private double saldoCorrente;
    private double depositar;
    private double sacar;
    private String tipoConta;
    private double transferir;
    public int flag;
    

   
    
    public String getNomeCorrente() {
        return nomeCorrente;
    }

    public void setNomeCorrente(String nomeCorrente) {
        this.nomeCorrente = nomeCorrente;
    }

    public String getSenhaCorrente() {
        return senhaCorrente;
    }

    public void setSenhaCorrente(String senhaCorrente) {
        this.senhaCorrente = senhaCorrente;
    }

    public int getNumeroCorrente() {
        return numeroCorrente;
    }

    public void setNumeroCorrente(int numeroCorrente) {
        this.numeroCorrente = numeroCorrente;
    }

    public double getSaldoCorrente() {
        return saldoCorrente;
    }

    public void setSaldoCorrente(double saldoCorrente) {
        this.saldoCorrente += saldoCorrente;
    }

    public double getDepositar() {
        return depositar;
    }

    public void setDepositar(double depositar) {
        this.flag = 0;
        
        if( depositar < 0)
        {
            JOptionPane.showMessageDialog(null, "Deposito não efetuado!");
            
        }else{
            this.saldoCorrente += depositar;
            this.flag = 1;
        }
        
    }

    public double getSacar() {
        return sacar;
    }

    public void setSacar(double sacar) {
        
        flag = 0;
        
        if(sacar > saldoCorrente)
        {
            JOptionPane.showMessageDialog(null, "Saldo Insuficiente!");
        }
        else if(sacar <= 0)
        {
            JOptionPane.showMessageDialog(null, "O saque não pode ser efetuado!");
        }
        else
        {
            flag = 1;
            this.saldoCorrente = this.saldoCorrente - sacar;
        }
        
    }

    public String getTipoConta() {
        tipoConta = "Corrente";
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        String tipoConta1 = this.tipoConta;
        
    }

    public double getTransferir() {
        return transferir;
    }

    public void setTransferir(double transferir) {
        this.transferir = transferir;
    }
    
    public void tipoConta() {
        JOptionPane.showMessageDialog(null, "Conta Comum");
    }
    
}
