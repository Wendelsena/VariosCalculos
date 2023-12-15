import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		double A, B, C;
		
		System.out.println("VAi ALGUNS CALCULOS AI? ;D");
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nEntre com três valores com uma casa decimal: ");
		
		System.out.println("\nDigite o primeiro valor: ");
		A = sc.nextDouble();
		
		System.out.println("\nDigite o segundo valor: ");
		B = sc.nextDouble();
		
		System.out.println("\nDigite o terceiro valor: ");
		C = sc.nextDouble();
		
		System.out.printf("\nA área do triângulo retângulo que tem %.1f por base e %.1f por altura é: %.3f%n", A, C, ((A * C) / 2));
		
		System.out.printf("\nA área do círculo de raio %.1f: %.3f%n", C, (3.14159 * Math.pow(C, 2.0)));

		System.out.printf("\nA área do trapézio que tem %.1f por base menor, %.1f por base maior e %.1f por altura é: %.3f%n", A, B, C, (((A + B) * C) / 2));

		System.out.printf("\nA área do quadrado que tem lado %.1f: %.3f%n", B, Math.pow(B, 2.0));
		
		System.out.printf("\nA área do retângulo que tem lados %.1f e %.1f: %.3f%n", A, B, (A * B));
		
		System.out.println("\nOBRIGADO!");
		
		sc.close();
		
	}

}
