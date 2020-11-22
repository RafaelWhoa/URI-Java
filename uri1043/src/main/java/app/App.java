package app;

import java.util.Locale;
import java.util.Scanner;

/**
 * * URI 1043
 * 
 *  Leia 3 valores reais (A, B e C) e verifique se eles formam ou não um triângulo. Em caso positivo, calcule o perímetro do triângulo e apresente a mensagem:
 * 
 * 
 *  Perimetro = XX.X
 * 
 * 
 *  Em caso negativo, calcule a área do trapézio que tem A e B como base e C como altura, mostrando a mensagem
 * 
 * 
 *  Area = XX.X
 * 
 * * 
 */
public class App 
{
    public static void main( String[] args )
    {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double area, perimetro;

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        if (a < b + c && b < a + c && c < b + a) {

            System.out.println("Perimetro = " + String.format("%.1f", perimetro = (a + b + c)));
    
        }
        else System.out.println("Area = " + String.format("%.1f", area = (a + b) * c / 2));

        sc.close();
    }
}
