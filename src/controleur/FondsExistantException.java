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
public class FondsExistantException extends Exception{
    public String getMessage(){
        String erreur = "Erreur ce fonds existe déja ";
        return erreur;
    }
    
}
