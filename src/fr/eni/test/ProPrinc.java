package fr.eni.test;

import java.util.ArrayList;
import java.util.List;

import fr.eni.Animal;
import fr.eni.Chat;
import fr.eni.Chien;
import fr.eni.Savant;
import fr.eni.TRex;

public class ProPrinc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal medor = new TRex("Medor");
		Animal miss = new Chat("Mistigri");

		
		Savant s1= new Chat("Mistigri2");
		Savant s2= new Chien("Rantanplan");
		
		List<Savant> listeS=new ArrayList<Savant>();
		listeS.add(s1);
		listeS.add(s2);
		System.out.println("Liste de tous les savants : ");
		
		for(Savant savant :listeS){
			System.out.println("-"+savant);
			savant.comprend("Assis !");
			
			if(savant instanceof Animal) {//Vérifier avant de faire un ranstypage que l'instance de savant en cours est bien un animal
				System.out.println("Nom : "+((Animal)savant).getNom());			
			}

		}
		
		
	}

}
