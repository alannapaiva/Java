
package trabalhojava2;

/**
 *
 * @author alann
 */
import javax.swing.JOptionPane;

public class ContaPoupanca extends Contas {
    
      
    private String nomePoupanca;
    private String senhaPoupanca;
    private int numeroPoupanca;
    private double saldoPoupanca;
    private double depositar;
    private double sacar;
    private String tipoConta;
    private double transferir;
    private double reajustar;
    public int flag;

    public String getNomePoupanca() {
        return nomePoupanca;
    }

    public void setNomePoupanca(String nomePoupanca) {
        this.nomePoupanca = nomePoupanca;
    }

    public String getSenhaPoupanca() {
        return senhaPoupanca;
    }

    public void setSenhaPoupanca(String senhaPoupanca) {
        this.senhaPoupanca = senhaPoupanca;
    }

    public int getNumeroPoupanca() {
        return numeroPoupanca;
    }

    public void setNumeroPoupanca(int numeroPoupanca) {
        this.numeroPoupanca = numeroPoupanca;
    }

    public double getSaldoPoupanca() {
        return saldoPoupanca;
    }

    public void setSaldoPoupanca(double saldoPoupanca) {
        this.saldoPoupanca += saldoPoupanca;
    }

    @Override
    public double getDepositar() {
        return depositar;
    }

    @Override
    public void setDepositar(double depositar) {
        flag = 0;
        if( depositar < 0)
        {
            JOptionPane.showMessageDialog(null, "Deposito não efetuado!");
        }else{
            this.saldoPoupanca += depositar;
            flag = 1;
        }
    }

    @Override
    public double getSacar() {
        return sacar;
    }

    @Override
    public void setSacar(double sacar) {
        this.flag = 0;
        
        if(sacar>saldoPoupanca)
        {
            JOptionPane.showMessageDialog(null, "Saldo Insuficiente!");
        }
        if(sacar < 0)
        {
            JOptionPane.showMessageDialog(null, "O saque não pode ser efetuado!");
        }
        if(sacar < saldoPoupanca && sacar >0)
        {
            this.flag = 1;
            this.saldoPoupanca -= sacar;
        }
    }

    @Override
    public String getTipoConta() {
        tipoConta = "Poupança";
        return tipoConta;
    }

    @Override
    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    @Override
    public double getTransferir() {
        return transferir;
    }

    @Override
    public void setTransferir(double transferir) {
        this.transferir = transferir;
    }

    public double getReajustar() {
        return reajustar;
    }

    public void setReajustar(double reajustar) {
        
        this.saldoPoupanca += ((reajustar/100)*saldoPoupanca);
    }
    
}