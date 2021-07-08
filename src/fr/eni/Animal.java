package fr.eni;

public class Animal{

	private String nom;

	public Animal(String nom) {

		this.nom = nom;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "AnimalImpl [nom=" + nom + "]";
	}
	
}
