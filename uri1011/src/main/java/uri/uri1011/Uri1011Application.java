package uri.uri1011;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Uri1011Application {

	public static void main(String[] args) {
		SpringApplication.run(Uri1011Application.class, args);
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Double raio, volume;

		raio = sc.nextDouble();

		volume = (4/3.0) * 3.14159 * (raio * raio * raio);

		System.out.println("VOLUME = " + String.format("%.3f", volume));


		sc.close();
	}

}
