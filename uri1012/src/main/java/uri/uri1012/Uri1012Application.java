package uri.uri1012;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Uri1012Application {

	public static void main(String[] args) {
		SpringApplication.run(Uri1012Application.class, args);
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Double a = sc.nextDouble();
		Double b = sc.nextDouble();
		Double c = sc.nextDouble();

		Double triangulo = a * c / 2;
		Double circulo = 3.14159 * c * c;
		Double trapezio = (a + b) / 2 * c;
		Double quadrado = b * b;
		Double retangulo = a * b;

		System.out.println("TRIANGULO: " + String.format("%.3f", triangulo));
		System.out.println("CIRCULO: " + String.format("%.3f", circulo));
		System.out.println("TRAPEZIO: " + String.format("%.3f", trapezio));
		System.out.println("QUADRADO: " + String.format("%.3f", quadrado));
		System.out.println("RETANGULO: " + String.format("%.3f", retangulo));
		


		sc.close();
	}

}
