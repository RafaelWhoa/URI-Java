package app;

import java.util.Locale;
import java.util.Scanner;

/**
 * URI 1038
 * 
 *  Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item.
 *  A seguir, calcule e mostre o valor da conta a pagar.
 *   
 *  +-------------------------------------------------------+
 *  |CODIGO             |ESPECIFICACAO              |PRECO  |
 *  |                   |                           |       |
 *  |1                  |Cachorro quente            |R$ 4.00|
 *  |2                  |X-Salada                   |R$ 4.50|
 *  |3                  |X-Bacon                    |R$ 5.00|
 *  |4                  |Torrada simples            |R$ 2.00|
 *  |5                  |Refrigerante               |R$ 1.50|
 *  +-------------------------------------------------------+
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int itemCode = sc.nextInt();
        int itemQuantity = sc.nextInt();
        Double totalPrice = 0.0;

        if (itemCode == 1) {
            totalPrice = 4.00 * itemQuantity;
        }
        else if (itemCode == 2) {
            totalPrice = 4.50 * itemQuantity;
        }
        else if (itemCode == 3) {
            totalPrice = 5.00 * itemQuantity;
        }
        else if (itemCode == 4) {
            totalPrice = 2.00 * itemQuantity;
        }
        else if (itemCode == 5) {
            totalPrice = 1.50 * itemQuantity;
        }

        System.out.println("Total: R$ " + String.format("%.2f", totalPrice));

        sc.close();

    }
}
