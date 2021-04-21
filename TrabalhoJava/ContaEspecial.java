
package trabalhojava2;

/**
 *
 * @author alann
 */
import javax.swing.JOptionPane;

public class ContaEspecial extends Contas {
    
  
    private String nomeEspecial;
    private String senhaEspecial;
    private int numeroEspecial;
    private double saldoEspecial;
    private double depositar;
    private double sacar;
    private String tipoConta;
    private double transferir;
    private double limite;
    private double descontar; 
    public static int flag;

    public double getLimite() {
        return limite;
    }

    public void setLimite(int limite) {
        this.limite = limite;
    }

    public double getDescontar() {
        return descontar;
    }

    public void setDescontar(double descontar) {
        this.descontar = descontar;
    }

    public String getNomeEspecial() {
        return nomeEspecial;
    }

    public void setNomeEspecial(String nomeEspecial) {
        this.nomeEspecial = nomeEspecial;
    }

    public String getSenhaEspecial() {
        return senhaEspecial;
    }

    public void setSenhaEspecial(String senhaEspecial) {
        this.senhaEspecial = senhaEspecial;
    }

    public int getNumeroEspecial() {
        return numeroEspecial;
    }

    public void setNumeroEspecial(int numeroEspecial) {
        this.numeroEspecial = numeroEspecial;
    }

    public double getSaldoEspecial() {
        return saldoEspecial;
    }

    public void setSaldoEspecial(double saldoEspecial) {
        this.saldoEspecial += saldoEspecial;
    }

    @Override
    public double getDepositar() {
        return depositar;
    }

    @Override
    public void setDepositar(double depositar) {
        this.flag = 0;
        if( depositar < 0)
        {
            JOptionPane.showMessageDialog(null, "Deposito não efetuado!");
        }else{
            this.saldoEspecial += depositar;
            this.flag = 1;
        }
    }

    @Override
    public double getSacar() {
        return sacar;
    }

    @Override
    public void setSacar(double sacar) {
        double aux;
        
        this.flag = 0;
        if(sacar < 0)
        {
            
            JOptionPane.showMessageDialog(null, "O saque não pode ser efetuado!");
            
        }
        if(sacar > (saldoEspecial + limite))
        {
            
            JOptionPane.showMessageDialog(null, "O saque não pode ser efetuado!");
            
        }
        else if(sacar <= saldoEspecial && sacar > 0)
        {
            
            saldoEspecial -= sacar;
            this.flag=1;
            
        }else
        {
            aux = sacar - saldoEspecial;
            limite -= aux;
            saldoEspecial += aux;
            saldoEspecial -= sacar;
            limite += (limite*(this.descontar/100));
            saldoEspecial = limite*(-1);
            this.flag=1;
            
        }
   
    }

    @Override
    public String getTipoConta() {
        tipoConta = "Especial";
        return tipoConta;
    }

    @Override
    public void setTipoConta(String tipoConta) {
        String tipoConta1 = this.tipoConta;
    }

    @Override
    public double getTransferir() {
        return transferir;
    }

    @Override
    public void setTransferir(double transferir) {
        this.transferir = transferir;
    }
    
    
    public void tipoConta() {
        JOptionPane.showMessageDialog(null, "Conta especial");
    }
   
}