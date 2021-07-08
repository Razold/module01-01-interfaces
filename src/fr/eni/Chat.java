package fr.eni;

public class Chat extends Animal implements Savant,Predateur{

	
	
	public Chat(String nom) {
		super(nom);
		// TODO Auto-generated constructor stub
	}
	
	public void comprend(String mot){
		System.out.println(getNom()+" comprend "+mot +" mais s'en fiche");
	}

	@Override
	public void chasse() {
		System.out.println();	
	}



}
