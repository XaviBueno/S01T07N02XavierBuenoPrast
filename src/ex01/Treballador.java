package ex01;

public class Treballador {
	protected String nom;
	protected String cognom;
	protected double preuHora;
	
	public Treballador (String nom, String cognom, double preuHora) {
		
		this.nom=nom;
		this.cognom=cognom;
		this.preuHora=preuHora;
	}
	
public Treballador () {
		
		
	}
	
	public String getNom() {
		return nom;
	}
	
	public String getCognom() {
		return cognom;
	}
	
	public double getPreuHora() {
		return preuHora;
	}
	public double calcularSou(double hores) {
		return preuHora*hores;
	}

}
