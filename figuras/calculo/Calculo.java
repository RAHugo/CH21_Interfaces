package figuras.calculo;

import figuras.util.Calcular;

public class Calculo {
	public static void imprimirCalculo(Calcular c) {
		System.out.println(c);
		System.out.println("+========================================");
		System.out.println("|El área de ["+c.getName()+"] es: " + c.calcularArea() + 
				"\n" + "|El perímetro de ["+c.getName()+"] es: " + c.calcularPerimetro());
		System.out.println("+========================================");
	}
}
