/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import java.util.ArrayList;
import java.util.Collections;
import controleur.ComparableImplementee;


/**
 *
 * @author JOGARAJAH Kishor, NITHIANANDAN Vishnu
 */
public class Instrument {
    // attribut
    private ArrayList<Fonds> valeursFonds;
    
    
    
    //constructeur 1
    public Instrument() {
        valeursFonds = new ArrayList<Fonds>();
    }
     //constructeur 2
    public Instrument(ArrayList<Fonds> newFonds) {
        valeursFonds = newFonds ;
    }
    //question 1.2
    
    public void ajouter(Fonds f) {
        valeursFonds.add(f);
    }
    
    // setter et getter
    public ArrayList<Fonds> getValeursFonds(){
        return valeursFonds;
    }
    public void setValeursFonds(ArrayList<Fonds> newArrayListFonds){
        valeursFonds = newArrayListFonds;
    }
    
    //Question 1.9
    public void tri()
	{
		Collections.sort(valeursFonds);
		///Affichage de ces fonds dans l'ordre croissant des montants de fonds
		for(int i=0; i<getValeursFonds().size(); i++)
		{
			System.out.println(getValeursFonds().get(i).getArgent());
		}
		System.out.println();
		
	}
    
}
