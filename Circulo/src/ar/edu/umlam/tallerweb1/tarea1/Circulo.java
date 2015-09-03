package ar.edu.umlam.tallerweb1.tarea1;

public class Circulo {

	private Double radio;
	private Double pi = 3.1415;
			
	public Circulo(Double radio){
		
		this.radio = radio;
		
	}
	
		
	public Double CalcularArea(){
		
		 return this.radio*radio*pi;
			
	}
	
	public Double CalcularPerimetro(){
		return this.radio*2*pi;
	}
	
	
}
