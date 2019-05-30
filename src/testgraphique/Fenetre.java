/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testgraphique;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
 
public class Fenetre extends JFrame{
 
  private Panneau pan = new Panneau();
  private JButton bouton = new JButton("RECHERCHE");
  private JButton bouton2 = new JButton("MISE A JOUR");
  private JButton bouton3 = new JButton("GENERATION");
  private JPanel container = new JPanel();
  private JLabel label = new JLabel("BIENVENUE SUR LE GESTIONNIARE INFORMATIQUE DE L'ECOLE");
  private int compteur = 0;
  
  public Fenetre(){
    this.setTitle("MENU GESTION ECOLE");
    this.setSize(2000, 1000);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLocationRelativeTo(null);
 
    container.setBackground(Color.white);
    container.setLayout(new BorderLayout());
    container.add(pan, BorderLayout.CENTER);
        
    //Ce sont maintenant nos classes internes qui écoutent nos boutons 
    bouton.addActionListener(new BoutonListener());
    bouton2.addActionListener(new Bouton2Listener());
     bouton3.addActionListener(new Bouton3Listener());
        
    JPanel south = new JPanel();
    south.add(bouton);
    south.add(bouton2);
    south.add(bouton3);
    container.add(south, BorderLayout.SOUTH);
    Font police = new Font("Tahoma", Font.BOLD, 36);
    label.setFont(police);
    label.setForeground(Color.red);
    label.setHorizontalAlignment(JLabel.CENTER);
    container.add(label, BorderLayout.NORTH);
    this.setContentPane(container);
    this.setVisible(true);
  }
      
  
      
  //Classe écoutant notre premier bouton
  class BoutonListener implements ActionListener{
    //Redéfinition de la méthode actionPerformed()
    public void actionPerformed(ActionEvent arg0) {
      label.setText("RECHERCHER");   
      //=======VISHNUUUUUUUUUUUUUUUUUUUUU ICI METTRE FORMULAIRE RECHERCHERRRRRRRRRR============
      Formulaire1 FE = new Formulaire1();
    }
  }
      
  //Classe écoutant notre second bouton
  class Bouton2Listener implements ActionListener{
    //Redéfinition de la méthode actionPerformed()
    public void actionPerformed(ActionEvent e) {
      label.setText("METTRE A JOUR");  
       //=========VISHNUUUUUUUUUUUUUUUUUUUUU ICI METTRE FORMULAIRE METTRE A JOUUUUUR==========
    }
  }  
  class Bouton3Listener implements ActionListener{
    //Redéfinition de la méthode actionPerformed()
    public void actionPerformed(ActionEvent arg0) {
      label.setText("GENERER");        
      //============VISHNUUUUUUUUUUUUUUUUUUUUU ICI METTRE FORMULAIRE GENERERRRRRRR==============
    }
  }
}