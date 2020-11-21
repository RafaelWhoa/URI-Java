package uri.uri1037;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Uri1037Application {

	public static void main(String[] args) {
		SpringApplication.run(Uri1037Application.class, args);
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Double n = sc.nextDouble();

		if (n >= 0.0 && n <= 25.0) {
			System.out.println("Intervalo [0,25]");
		}
		else if (n > 25.0 && n <= 50){
			System.out.println("Intervalo (25,50]");
		}
		else if (n > 50 && n <= 75){
			System.out.println("Intervalo (50,75]");
		}
		else if (n > 75 && n <= 100){
			System.out.println("Intervalo (75,100]");
		}
		else System.out.println("Fora de intervalo");

		sc.close();

	}

}
