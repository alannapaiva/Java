
package P4;
import java.lang.Math;
import java.util.Scanner;

public class operadorTernario {
   public static void main(String args[]) {

//    //Exercicio Prático 03 = OPERADOR TERMÁRIO
       Scanner ler = new Scanner(System.in);
        double minVal, absValue;
        double a, b;
        
        System.out.println("Insira um numero: ");
        a = ler.nextInt();
        System.out.println("Insira outro numero: ");
        b = ler.nextInt();
        
        minVal = (a<b)? a:b;
        System.out.println("Valor minimo é: " +minVal);
        
        absValue = (a < 0) ? -a : a; 
        System.out.println("Valor Absoluto: " + absValue);
    }  
  }
   

//        int num = 81;
//        double x = Math.sqrt(num);
//        System.out.println("A raiz quadrada de " +num+ " é " +x);
//        
//        System.out.println("Valor absoluto: "+Math.abs(-81.4));
//        System.out.println("Seno: "+Math.sin(90.0));
//        System.out.println("Seno: "+Math.sin(Math.toRadians(90)));
//        System.out.println("Max: "+Math.max(85, 20));
//        
//        
//        String nome = "Alanna";
//        String frase = "Meu nome é ";
//        String completa = frase + nome;
//        
//        System.out.println(completa);
//        System.out.println("O tamanho do nome é: "+nome.length());
//        System.out.println("O caracter da posicao 2 é: "+nome.charAt(1));
//        System.out.println("Frase toda em maiscula: "+completa.toUpperCase());
//        System.out.println("Trecho 2 a 8: "+completa.substring(2, 8));
//        System.out.println("Retira os espaços antes e depois: "+frase.trim());
//        System.out.println("Substituindo Fulano por Sicrano: "+completa.replace("Alanna", "Guiomar"));
        

