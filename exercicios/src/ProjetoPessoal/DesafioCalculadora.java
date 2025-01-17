package ProjetoPessoal;

import java.util.Scanner;

public class DesafioCalculadora {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe um numero:");
		Double valor1 = entrada.nextDouble();
		
		System.out.print("Informe o segundo numero:");
		Double valor2 = entrada.nextDouble();
		
		System.out.print("Informe o operador:");
		String operador = entrada.next();
		
		
		 
		
		double resultado = "+".equals(operador) ? valor1 + valor2 : 0 ;
		resultado = "-".equals(operador) ? valor1 - valor2 : resultado ;
		resultado = "*".equals(operador) ? valor1 * valor2 : resultado ;
		resultado = "/".equals(operador) ? valor1 / valor2 : resultado ;
		resultado = "%".equals(operador) ? valor1 % valor2 : resultado ;
		
		System.out.printf("%.2f %s %.2f = %.2f", valor1 , operador,valor2,resultado);
		
		entrada.close();
	}
}
