/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur;

import java.util.ArrayList;
import java.util.Scanner;
import modele.Fonds;
import modele.Instrument;
import modele.Portefeuille;

/**
 *
 * @author JOGARAJAH Kishor, NITHIANANDAN Vishnu
 */
public class TestProtefeuille {
    public static void main(String[] args) throws FondsExistantException, FondsInexistantException{
        //declaration
        Fonds f = new Fonds();
        Instrument i = new Instrument();
        Portefeuille p = new Portefeuille();
        String key1, key2;
        double montant = 0.0;
        
        // Saisir des données ( clé et montant)
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez la clé de fonds:");
        key1= sc.next();
        System.out.println("Entrez le montant de fonds:");
        montant = sc.nextDouble();
        
        try {
            double fondsAmount = p.rechercherFonds(key1);
        }catch(FondsInexistantException e1) {
            System.out.println(e1.getMessage());
            p.ajouterFonds(key1, montant);
            System.out.println("Le fonds est maintenant ajouté dans le portefeuille");
        }
        // Afficher
        for(String j: p.getFondsMap().keySet()){
            System.out.println("key="+j+" Value ="+ p.rechercherFonds(j));
            
        }
        
                // test de l'instruction
    System.out.println("Entrer la clé de l'instrument:");
    String keyz = sc.next();
    System.out.println("Entrer le montant de fonds de cet instrument:");
    Double montant2 = sc.nextDouble();
    try { ArrayList<Fonds> aF= new ArrayList<>();
    aF=p.rechercherInstrument(keyz);
    }
    catch(InstrumentInexistantException e3){
        System.out.println(e3.getMessage());
        try { Fonds f2 = new Fonds(montant2);
        ArrayList<Fonds> alF = new ArrayList<>();
        alF.add(f2);
        i= new Instrument(alF);
        p.getInstrumentMap().put(keyz,i);
        System.out.println("l'instrument est mainteant ajouté");
                //ajouter le fond dasn hashmap;
        p.ajouterInstrument(keyz, f2);
        
        }
        catch(InstrumentInexistantException e4){
            System.out.println(e4.getMessage());
        }
        
    }
    
        
    }
}
