
package testeretangulo;

public class TesteRetangulo {
    public static double calculaArea(double base, double altura) {
        double area = base * altura;
        return area;
    }
    public static double calculaPerimetro(double base, double altura) {
        return 2* base + 2* altura;
    }
    
    public static void main(String[] args) {
        int b = 7;
        int h = 5;
        //double a = calculaArea(base,alt);
        
        System.out.println("Area: "+ calculaArea(b,h));
        System.out.println("Perimetro: "+ calculaPerimetro(b,h));
    }
}
