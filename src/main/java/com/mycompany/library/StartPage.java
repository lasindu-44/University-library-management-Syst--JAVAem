/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.library;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author crx
 */
public class StartPage extends JFrame implements ActionListener{
    
    JLabel l1;
    JButton b1;
        
        public StartPage() {
		
                setSize(1366,390);
                setLayout(null);
                setLocation(300,300);
                
                b1 = new JButton("Next");
                
                b1.setBackground(Color.WHITE);
                b1.setForeground(Color.BLACK);
                
                ImageIcon img = new ImageIcon("C:/Users/crx/Documents/NetBeansProjects/library/src/main/java/img/icons/first.jpg");
                img.getImage().getScaledInstance(1366, 390,Image.SCALE_DEFAULT);
                JLabel l1 = new JLabel(img);
      
                
                b1.setBounds(1050,250,200,60);
		l1.setBounds(0, 0, 1366, 390);
                
                l1.add(b1);
		add(l1);
                
                b1.addActionListener(this);
	}

    @Override
    public void actionPerformed(ActionEvent e) {
         new Login().setVisible(true);
         this.setVisible(false);//To change body of generated methods, choose Tools | Templates.
    }
    
    public static void main(String[] args) {
                StartPage window = new StartPage();
                window.setVisible(true);			
	}
    
}
