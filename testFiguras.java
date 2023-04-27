import figuras.calculo.Calculo;
import figuras.clases.Triangulo;
import figuras.clases.Cuadrado;
import figuras.clases.Rectangulo;
import figuras.clases.Rombo;
import figuras.clases.Romboide;
import figuras.clases.Trapecio;

public class testFiguras {
	public static void main(String[] args) {
		Triangulo t1 = new  Triangulo("Triángulo t1", 20.0, 10.0, 15.0,15.00,15.00);
		Triangulo t2 = new  Triangulo("Bermudas", 87.0, 121.0, 101.0,101.0,101.0);
		// TODO: Aquí se deben instanciar las otras figuras geométricas
		Cuadrado c1 = new Cuadrado("Cuadrado 1",12.0);
		Cuadrado c2 = new Cuadrado("Cuadrado 2",15.0);
		
		Rectangulo r1 = new Rectangulo("Rectangulo 1",12.00,6.00);
		Rectangulo r2 = new Rectangulo("Rectangulo 2",10.00,4.00);
		
		Romboide ro1 = new Romboide("Romboide 1",12.00,20.00);
		Romboide ro2 = new Romboide("Romboide 2",10.00,20.00);
		
		Rombo rombo1 = new Rombo("Rombo 1",10.00,12.00,16.00);
		Rombo rombo2 = new Rombo("Rombo 2",85.00,50.00,62.50);
		
		
		//Nomabre Base Menos Altura Lado 1 Lado 2 Lado 3 Lado 4 Base Mayos
		Trapecio tra1 = new Trapecio("Trapecio 1", 6.00, 7.50, 6.00, 7.00, 12.00,7.50,12.00);

		
		
		
		// TODO: Aquí se debe probar cada figura con el método imprimirCalculo
		Calculo.imprimirCalculo(t1);
		Calculo.imprimirCalculo(t2);
		Calculo.imprimirCalculo(c1);
		Calculo.imprimirCalculo(c2);
		Calculo.imprimirCalculo(r1);
		Calculo.imprimirCalculo(r2);
		Calculo.imprimirCalculo(ro1);
		Calculo.imprimirCalculo(ro2);
		Calculo.imprimirCalculo(rombo1);
		Calculo.imprimirCalculo(rombo2);
		Calculo.imprimirCalculo(tra1);
		
		
		
	}//main
}//class testFiguras