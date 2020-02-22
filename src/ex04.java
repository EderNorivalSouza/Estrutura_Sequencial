import java.util.Locale;
import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int func;
		double horas, valor, salario;
		func = sc.nextInt();
		horas = sc.nextDouble();
		valor = sc.nextDouble();
		salario = horas*valor;
		
		System.out.println("NUMBER = " + func);
		System.out.printf("SALARY = U$ %.2f%n", salario);
		
		sc.close();
		
	}

}
