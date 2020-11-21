package uri.uri1006;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Uri1006Application {

	public static void main(String[] args) {
		SpringApplication.run(Uri1006Application.class, args);
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Double A, B, C, media;

		A = sc.nextDouble() * 2;
		B = sc.nextDouble() * 3;
		C = sc.nextDouble() * 5;

		media = (A + B + C) / (2 + 3 + 5);

		System.out.println("MEDIA = " + String.format("%.1f", media));

		sc.close();
		
	}

}
