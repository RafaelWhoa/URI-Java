package iniciante.uri1002;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Uri1002Application {

	public static void main(String[] args) {
		SpringApplication.run(Uri1002Application.class, args);
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Double n = sc.nextDouble();
		Double area = 3.14159 * (n * n);

		System.out.println("A=" + String.format("%.4f", area));



		sc.close();

	}

}
