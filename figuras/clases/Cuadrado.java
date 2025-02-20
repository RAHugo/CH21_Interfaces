package figuras.clases;
import figuras.util.Calcular;

public class Cuadrado implements Calcular{
	private String name;
	private double lado;
	
	public Cuadrado(String name, double lado) {
		super();
		this.name = name;
		this.lado = lado;
	}//Constructor
	
	public double calcularArea() {
		return (getLado()*getLado());
	}//calcularArea
	
	public double calcularPerimetro() {
		return (getLado()*4);
	}

	
	public String getName() {
		return name;
	}//getName

	public void setName(String name) {
		this.name = name;
	}//setName

	public double getLado() {
		return lado;
	}//getLado

	public void setLado(double lado) {
		this.lado = lado;
	}//setLado

	@Override
	public String toString() {
		return "Cuadrado [name=" + name + ", lado=" + lado + "]";
	}//toString


}//Clase cuadrado
