/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur;

/**
 *
 * @author JOGARAJAH Kishor, NITHIANANDAN Vishnu
 */
public class ComparableImplementee {
    
    
    private double montant;
	
	/**
	  * Constructeur par defaut de la classe Fonds
	  */
	public ComparableImplementee()
	{
		montant=0.0;
	}
	
	/**
	  * Constructeur surcharge de la classe Fonds
	  * @param double
	  */
	public ComparableImplementee(double argent)
	{
		montant=argent;
	}
	
	/**
	  * Getter de montant
	  * @return double
	  */
	public double getArgent()
	{
		return montant;
	}
	
	/**
	  * Setter de montant
	  * @param double
	  */
	public void setArgent(double argent)
	{
		montant=argent;
	}
    
    
    public boolean equals(ComparableImplementee fond)
	{
		boolean bool=false;
		if(equals(fond))
			bool=true;
		return bool;
	}
    
    public int compareTo(ComparableImplementee T)
	{
		int comp=0;
		if(this.getArgent()<T.getArgent())
			comp=-1;
		else if (this.getArgent()>T.getArgent())
			comp=1;
		return comp;
	}
    
}
