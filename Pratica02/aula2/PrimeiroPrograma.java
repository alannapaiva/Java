/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula2;

/**
 *
 * @author alann
 */
public class PrimeiroPrograma {

    public static void main(String[] args) {
        //System.out.println("Mensagem Teste");
            //   String s = "Ana dos Santos";
//        String s2 = "Roberto Padilha";
//        
//        System.out.println("Eh igual: "+s.equals("Ana dos Santos"));System.out.println("Mensagem Teste");
//        System.out.println("O tamanho da string: "+ s.length());
//        System.out.println("O caractere na posicao especificado: " +s2.charAt(5));

          //Exemplo 01
          int a = 5;
          boolean b = (a==10);
          System.out.println(b);
          int c = 10%3;
          System.out.println(c);
          System.out.println("\n");
          
          //Exemplo 2
          double d = 15.3;
          d +=10;
          System.out.println(d);
          boolean e = (d>10 && d<=50);
          System.out.println(e);
          System.out.println("\n");
          
          //Exemplo 3
          int i =1, j=2, k = ++j;
          System.out.println("K: " +k);
          System.out.println("J: " +j);
          System.out.println("I: " +i);
          System.out.println("\n");
          //Exemplo 4
          int l = i++;
          System.out.println("L: " +l);
          System.out.println("I: " +i);
          k++;
          
          //Exemplo 5
          double a2 = 5/2;
          System.out.println(a2);
          double a3 = 5/2.0;
          System.out.println(a3);
             
    }
}

//      AND     OR
//0  0   0      0
//0  1   0      1
//1  0   0      1
//1  1   1      1