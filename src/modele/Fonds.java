/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

/**
 *
 * @author JOGARAJAH Kishor, NITHIANANDAN Vishnu
 */
public class Fonds {
    // attribut
    private double amount;
    
    //constructeur 1
    public Fonds(){
        amount = 0.0;
    }
    //constructeur 2
    public Fonds(double newAmount){
        amount = newAmount;
    }
    
    // setter et getter
    public void setAmount(double newAmount){
        amount = newAmount;
    }
    public double getAmount(){
        return amount;
    }
}
