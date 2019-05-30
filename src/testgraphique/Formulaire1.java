/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testgraphique;


/**
 *
 * @author ViNi
 */

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
 
public class Formulaire1 extends JFrame {
  private JPanel container = new JPanel();
  private JTextField jtf = new JTextField("Valeur par défaut");
  private JLabel label = new JLabel("NOM");
  private JTextField jtf1 = new JTextField("Valeur par défaut");
  private JLabel label1 = new JLabel("PRENOM");
  

  public Formulaire1(){
    this.setTitle("Animation");
    this.setSize(700, 700);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLocationRelativeTo(null);
    
    container.setBackground(Color.white);
    container.setLayout(new BorderLayout());
    JPanel top = new JPanel();
    Font police = new Font("Arial", Font.BOLD, 14);
    jtf.setFont(police);
    jtf.setPreferredSize(new Dimension(150, 30));
    jtf.setForeground(Color.BLUE);
    top.add(label);
    top.add(jtf);
    container.add(top, BorderLayout.NORTH);
    this.setContentPane(container);
    this.setVisible(true);
    

   

   
    jtf1.setFont(police);
    jtf1.setPreferredSize(new Dimension(150, 30));
    jtf1.setForeground(Color.BLUE);
    top.add(label1);
    top.add(jtf1);
    container.add(top, BorderLayout.NORTH);
    this.setContentPane(container);
    this.setVisible(true);
    
    
    
  }
}