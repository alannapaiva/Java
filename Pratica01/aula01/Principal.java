
package aula01;

public class Principal {
    public static void main(String[] args) {
        Contas c1;
        Contas c2;
        c1 = new Contas();
        c2 = new Contas();
        
        c1.nome = "Lanna";
        c1.numero = 100;
        c1.saldo = 700;
        c1.depositar(40);
         
        c2.nome = "Simon";
        c2.numero = 50;
        c2.saldo = 1000;
        c2.depositar(30);
        
        //Resultados do c1
        boolean saque_efetuado = c1.sacar(1000);
        if(saque_efetuado){
            System.out.println("Saque efetuado com sucesso!");
        } 
            else {
                System.out.println("Saque não efetuado! Saldo insuficiente!");
            }
        System.out.println("Titular de c1: " +c1.nome);
        System.out.print("Saldo de c1: " +c1.saldo);
        System.out.println("\n");
        
        //Resultados do c2
        boolean saque_efetuado2 = c2.sacar(300);
        if(saque_efetuado2){
            System.out.println("Saque efetuado com sucesso!");
        } 
            else{
                System.out.println("Saque não efetuado! Saldo insuficiente!");
            }
        System.out.println("Titular de c2: " +c2.nome);
        System.out.println("Saldo de c2: " +c2.saldo);
        
    }
}
