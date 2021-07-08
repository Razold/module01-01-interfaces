package fr.eni;

public class TRex extends Animal implements Predateur{

	public TRex(String nom) {
		super(nom);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "TRex [toString()=" + super.toString() + "]";
	}

	@Override
	public void chasse() {
	System.out.println("déchiquete!!");
	}



}
