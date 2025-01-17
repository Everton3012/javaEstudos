package fundamentos;

public class Temperatura {

	public static void main(String[] args) {
		final double FATOR = 5.0 / 9.0;
		final double AJUSTE = 32;
		
		double fahrenheit = 150;
		double celcius = (fahrenheit - AJUSTE) * FATOR;
		
		System.out.println("O resultado é " + celcius + "C°");
	}
}
