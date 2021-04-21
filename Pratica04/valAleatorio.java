
package P4;
import java.lang.Math;

public class valAleatorio {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       //Exercicio Prático 02 - MATH
    //Gerar os 200 números aleatórios e mostrá-los:
     for (int i = 1; i < 200; i++) {
        int numAleatorio = (int)(Math.random() * 98 ) + 5;
       System.out.println("Número: " + numAleatorio);
     }
    }
}
