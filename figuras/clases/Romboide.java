package figuras.clases;

import figuras.util.Calcular;

public class Romboide extends Rectangulo implements Calcular{

	public Romboide(String name, double base, double altura) {
		super(name, base, altura);
		// TODO Auto-generated constructor stub
	}
	
	public double calcularArea() {
		return (getBase()*getAltura());
	}
	
	public double calcularPerimetro() {
		return ((2*getBase())+(2*getAltura()));
	}

	@Override
	public String toString() {
		return "Romboide [getName()=" + getName() + ", getBase()=" + getBase() + ", getAltura()=" + getAltura() + "]";
	}
	
	
	
	

}
