package fr.eni;

public class Chien extends Animal implements Savant{

	private int age;
	
	public Chien(String nom) {
		super(nom);
		this.age=10;
		// TODO Auto-generated constructor stub
	}
	@Override
	public void comprend(String mot){
		System.out.println(getNom()+" comprend "+mot +" et il est content");
	}
	
	protected int getAge() {
		return age;
	}
	protected void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Chien [age=" + age + ", toString()=" + super.toString() + "]";
	}
	


}
