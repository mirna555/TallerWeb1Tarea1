package ar.edu.unlam.tallerweb1.cuadrado;

public class Cuadrado {
		
	private Double lado;
		
	public Cuadrado(Double lado){
		
		this.lado = lado;
	}
	
	public Double calcularArea(){
		
	    return this.lado*lado;
		
	}
	
	public Double calcularPerimetro(){
			
	    return this.lado * 4;
		
	}
}

