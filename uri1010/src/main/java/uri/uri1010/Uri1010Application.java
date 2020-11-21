package uri.uri1010;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Uri1010Application {

	public static void main(String[] args) {
		SpringApplication.run(Uri1010Application.class, args);
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int itemCode, quantity;
		Double price, valorTotal = 0.0;

		for (int i = 0; i < 2; i++) {
			itemCode = sc.nextInt();
			quantity = sc.nextInt();
			price = sc.nextDouble();
			valorTotal += quantity * price;
		}

		System.out.println("VALOR A PAGAR: R$ " + String.format("%.2f", valorTotal));


		sc.close();

	}

}
