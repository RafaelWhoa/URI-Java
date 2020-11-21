package uri.uri1018;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Uri1018Application {

	public static void main(String[] args) {
		SpringApplication.run(Uri1018Application.class, args);
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int q100, q50, q20, q10, q5, q2, q1;

		int n = sc.nextInt();
		int num = n;

		q100 = n / 100;
		n = n % 100;
		q50 = n / 50;
		n = n % 50;
		q20 = n / 20;
		n = n % 20;
		q10 = n / 10;
		n = n % 10;
		q5 = n / 5;
		n = n % 5;
		q2 = n / 2;
		n = n % 2;
		q1 = n / 1;
		n = n % 1;

		System.out.println(num);
		System.out.println(q100 + " nota(s) de R$ 100,00");
		System.out.println(q50 + " nota(s) de R$ 50,00");
		System.out.println(q20 + " nota(s) de R$ 20,00");
		System.out.println(q10 + " nota(s) de R$ 10,00");
		System.out.println(q5 + " nota(s) de R$ 5,00");
		System.out.println(q2 + " nota(s) de R$ 2,00");
		System.out.println(q1 + " nota(s) de R$ 1,00");


		sc.close();

	}

}
