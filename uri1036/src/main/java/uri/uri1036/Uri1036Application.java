package uri.uri1036;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Uri1036Application {

	public static void main(String[] args) {
		SpringApplication.run(Uri1036Application.class, args);
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Double a = sc.nextDouble();
		Double b = sc.nextDouble();
		Double c = sc.nextDouble();

		Double delta = b * b - 4 * a * c;
		delta = Math.sqrt(delta);

		if (a != 0.0 && delta >= 0.0) {
			Double raiz1 = (-b + delta) / (2 * a);
			Double raiz2 = (-b - delta) / (2 * a);
			System.out.println("R1 = " + String.format("%.5f", raiz1));
			System.out.println("R2 = " + String.format("%.5f", raiz2));
		}
		else System.out.println("Impossivel calcular");

		sc.close();
	}

}
