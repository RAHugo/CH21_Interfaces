package figuras.clases;

import figuras.util.Calcular;

public class Trapecio extends Triangulo implements Calcular {
	private double lado4;
	private double baseMayor;
	public Trapecio(String name, double base, double altura, double lado1, double lado2, double lado3, double lado4,
			double baseMayor) {
		super(name, base, altura, lado1, lado2, lado3);
		this.lado4 = lado4;
		this.baseMayor = baseMayor;
	}//Constructor 
	
	public double calcularArea() {
		return ((getAltura()*(getBase()*getBaseMayor()))/2);
	}
	
	public double calcularPerimetro() {
		return (getLado1()+getLado2()+getLado3()+getLado4());
	}
	
	public double getLado4() {
		return lado4;
	}//getLado4
	public void setLado4(double lado4) {
		this.lado4 = lado4;
	}//setLado4
	public double getBaseMayor() {
		return baseMayor;
	}//getBaseMayor
	public void setBaseMayor(double baseMayor) {
		this.baseMayor = baseMayor;
	}//setBaseMayor

	@Override
	public String toString() {
		return "Trapecio [lado4=" + lado4 + ", baseMayor=" + baseMayor + ", getName()=" + getName() + ", getBase()="
				+ getBase() + ", getAltura()=" + getAltura() + ", getLado1()=" + getLado1() + ", getLado2()="
				+ getLado2() + ", getLado3()=" + getLado3() + "]";
	}

	
	
	
	
	
	
	
	

}//Clase Trapecio
