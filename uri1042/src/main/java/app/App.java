package app;

import java.util.Locale;
import java.util.Scanner;

/**
 * 
 * Leia 3 valores inteiros e ordene-os em ordem crescente.
 * No final, mostre os valores em ordem crescente, uma linha em branco e em seguida, os valores na sequência como foram lidos.
 * 
 */
public class App 
{
    public static void main( String[] args )
    {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int aux;

        int[] vect = new int[3];
        int[] vect2 = new int[3];

        for (int i = 0; i < 3; i++){
            vect[i] = sc.nextInt();
        }

        for (int i = 0; i < 3; i++){
            vect2[i] = vect[i];
        }

        for (int i = 0; i < vect.length; i++){
            for (int j = 0; j < vect.length; j++){
                if (vect[i] < vect[j]){
                    aux = vect[i];
                    vect[i] = vect[j];
                    vect[j] = aux;
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            System.out.println(vect[i]);
        }

        System.out.println();

        for (int i = 0; i < 3; i++) {
            System.out.println(vect2[i]);
        }

        sc.close();
    }
}
