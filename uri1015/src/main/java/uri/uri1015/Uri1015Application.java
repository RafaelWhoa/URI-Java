package uri.uri1015;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Uri1015Application {

	public static void main(String[] args) {
		SpringApplication.run(Uri1015Application.class, args);
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Double x1 = sc.nextDouble();
		Double y1 = sc.nextDouble();
		Double x2 = sc.nextDouble();
		Double y2 = sc.nextDouble();


		x2 = x2 - x1;
		y2 = y2 - y1;

		y2 *= y2;
		x2 *= x2;
		
		Double distancia = Math.sqrt(x2 + y2);

		System.out.println(String.format("%.4f", distancia));



		sc.close();
	}

}
