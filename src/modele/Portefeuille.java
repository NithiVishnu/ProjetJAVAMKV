/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import controleur.FondsExistantException;
import controleur.FondsInexistantException;
import controleur.InstrumentInexistantException;
import static java.time.Clock.system;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author JOGARAJAH Kishor, NITHIANANDAN Vishnu
 */
public class Portefeuille {
    // attributs 
    private HashMap<String, Fonds> fondsMap;
    private HashMap<String, Instrument> instrumentMap;
    
    //constructeur 1
    public Portefeuille() {
        fondsMap = new HashMap<String, Fonds>();
        instrumentMap = new HashMap<String, Instrument>();
    }
    // constructreur 2
    public Portefeuille(HashMap<String, Fonds> newFondsMap,HashMap<String, Instrument> newInstrumentMap ){
        fondsMap = new HashMap<>();
        fondsMap.putAll(newFondsMap);
        instrumentMap = new HashMap<>();
        instrumentMap.putAll(newInstrumentMap);
        
    }
    
    // Question 1.3
    
    public double rechercherFonds(String cle) throws FondsInexistantException{
        double montant = 0.0;
        Fonds f;
        //rechercher si le fonds existe
        f = fondsMap.get(cle);
        if (f == null){
            throw new FondsInexistantException();
        } else {
            montant = f.getAmount();
            return montant; 
        }
    }
    
    // Question 1.4
    public ArrayList<Fonds> rechercherInstrument(String cle) throws InstrumentInexistantException{
        ArrayList<Fonds> myFonds;
        myFonds = new ArrayList<Fonds>();
        // rechercher l'instrument
        Instrument i = instrumentMap.get(cle);
        if(i == null) {
            throw new InstrumentInexistantException();
            }else {
            myFonds = i.getValeursFonds();
            return myFonds;   
        }
       

    }
     
   
    // Question 1.5
    public void ajouterFonds(String key, double montant) throws FondsExistantException{
        Fonds f = new Fonds();
        //rechercher si le fonds existe déja
        f = fondsMap.get(key);
        if ( f!= null){
            throw new FondsExistantException();
        }else {
            //le fonds n'existe pas; ajouter le fond dansfondsMAp
            f = new Fonds(montant);
            fondsMap.put(key,f);
        }
    }
    
    // Question 1.6
    public void ajouterInstrument(String key, Fonds f) throws InstrumentInexistantException{
        Instrument i = new Instrument();
        //tester intrumentMap(hashmap) si ce fonds existe déja
        i=instrumentMap.get(key);
        if (i==null){
            //ça n'esxite pas 
            throw new InstrumentInexistantException();
        }else {
            i.ajouter(f);
        }
    }
    
    //Question 1.7
    public void supprimerFonds(String key) throws FondsInexistantException{
        if (fondsMap.containsKey(key)){
            fondsMap.remove(key);
        }
        else {
            throw new FondsInexistantException();
        }
        
    }
    
    public void supprimerFondsInstrument(String cle) throws InstrumentInexistantException
	{
		if(instrumentMap.containsKey(cle))
		{
			instrumentMap.get(cle).getValeursFonds().clear();
			instrumentMap.remove(cle);
		}
		else throw new InstrumentInexistantException();	
	}
    
    
    //Question 1.8
    

    

            
    
    //getter et setter 
    public HashMap<String, Fonds> getFondsMap() {
        return fondsMap;
    }
    public HashMap<String, Instrument> getInstrumentMap() {
        return instrumentMap;
    }
    public void setFondsMap(HashMap< String, Fonds> newFondsMap) {
         fondsMap = new HashMap<>();
         fondsMap.putAll(newFondsMap);
    }
     public void setInstrumentMap(HashMap< String, Instrument> newInstrumentMap) {
         instrumentMap = new HashMap<>();
        instrumentMap.putAll(newInstrumentMap);
     }
}
