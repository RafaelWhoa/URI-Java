package app;

import java.util.Locale;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double n3 = sc.nextDouble();
        double n4 = sc.nextDouble();

        double media = (n1 * 2 + n2 * 3 + n3 * 4 + n4 * 1) / 10;
        System.out.println("Media: " + String.format("%.1f", media - 0.01));

        if (media >= 7) {
            System.out.println("Aluno aprovado.");
        }
        else if (media < 5){
            System.out.println("Aluno reprovado.");
        }
        else if (media >= 5 && media <= 6.9){
            System.out.println("Aluno em exame.");
            double notaExame = sc.nextDouble();
            System.out.println("Nota do exame: " + String.format("%.1f", notaExame));
            media = (media + notaExame) / 2;
            if (media >= 5) {
                System.out.println("Aluno aprovado.");
            }
            else {
                System.out.println("Aluno reprovado.");
            }
            System.out.println("Media final: " + String.format("%.1f", media));
        }


        sc.close();
    }
}
