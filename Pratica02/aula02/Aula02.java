
package aula02;

import java.util.Scanner;

public class Aula02 {

    public static void main(String[] args) {
//        Scanner ler = new Scanner(System.in);
//        String nome;
//        int idade;
//        System.out.print("Digite o seu nome:");
//        nome = ler.next(); //para receber uma string usa-se o .next
//        System.out.print("Digite sua idade:");
//        idade = ler.nextInt(); //para receber um inteiro usa-se o .nextInt
//        
//        System.out.println("seja bem vindo " +nome);
//        System.out.println("A idade de " +nome+ " é: " +idade);
        Scanner ler = new Scanner(System.in);
        int valor, i;
        int a = 1, b = 0, aux;
        
        System.out.print("Digite um valor de 3 a 90: ");
        valor = ler.nextInt();
        System.out.println("Série de Fibonacci:");
        
        for(i = 0; i < valor; i++){
            aux = a;
            a = a+b;
            b = aux;
             System.out.print(aux+ "\n");    
        }
    } 
}
