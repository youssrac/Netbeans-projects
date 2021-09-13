/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mintas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.*;  
import java.awt.event.*;  
/**
 *
 * @author PAVILION
 */
public class NewJFrame extends javax.swing.JFrame {
    
   JTextField tf1,tf2,tf3,tf4,tf5,tf6,tf7,tf8,tf9;  
   public static int minium;
   int s=0;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9; 
    public draw drawer;
  JPanel j=new JPanel() ;
    public NewJFrame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
      JFrame f= new JFrame();  
        
        tf1=new JTextField("le minimum");  
      ; 
        tf1.setEditable(false); 
        
       b1=new JButton("afficher min");  
       tf2=new JTextField("les elements max");  
        tf2.setBounds(100,150,100,100); 
        tf2.setEditable(false);
        b2=new JButton("les elements max");  
        b2.setBounds(100,100,150,20); 
        
        tf3=new JTextField("le tas resultant");  
        tf3.setBounds(50,150,150,20);  
        tf3.setEditable(false);  
        
        
        tf4=new JTextField("extraire le min");  
        tf4.setBounds(50,200,150,20);  
        tf4.setEditable(false);  
        
      
        tf6=new JTextField("la somme");  
        tf6.setBounds(50,250,150,20);  
        tf6.setEditable(false);  
        
        
        tf7=new JTextField("0");  
        tf7.setBounds(50,350,150,20);  
       
        tf8=new JTextField("valeurs superieures");  
        tf8.setBounds(50,300,150,20);   
        
        tf9=new JTextField("valeurs inferieures");  
        tf9.setBounds(50,400,150,20);
        
        
        
      
        b3=new JButton("tas resultant ");  
        b3.setBounds(200,200,100,50); 
        
         b4=new JButton("extraire le minimum ");  
         b4.setBounds(250,200,100,50); 
         
           b5=new JButton("inserer");  
          b5.setBounds(300,200,100,50); 
        
          b6=new JButton("valeurs superieures");  
          b6.setBounds(350,200,100,50); 
          
            b7=new JButton("valeurs inferieures");  
            b7.setBounds(400,200,100,50);
             b8=new JButton("afficher le tas");  
            b8.setBounds(10,500,150,50);
             b9=new JButton("somme");  
            b9.setBounds(10,500,150,50);
             min tree1 = new min(); 
          drawer=new draw(tree1);
         
            
  // tree1.insert(3);
   //tree1.insert(2);
  // tree1.insert(4);
  // tree1.insert(1);

 
     
    
      
        
        b1.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent e)
      {
            minium=tree1.list.get(0); 
        tf1.setText("min est " +minium); 
      }
    });
        
            b9.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent e)
      {
          
         for (int j = 0; j < tree1.list.size(); j++) {
            
			s=s+tree1.list.get(j);
		}
          tf6.setText(String.valueOf(s)); 
      }
    });
        
        
        
        b2.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent e)
      {
        String element=" ";
         for (int j =(tree1.list.size()/2);j<tree1.list.size();j++){

             
             element=element+tree1.list.get(j)+" ";
		}
         tf2.setText("les elements max " +element); 
      }
    }); 
        

        b5.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent e)
      { 
     tree1.insert(Integer.parseInt(tf7.getText()) );
        String element=" ";
          for (int j = 0; j < tree1.list.size(); j++) {
            
			element=element+tree1.list.get(j)+" ";
		}
         tf3.setText(element);  
     
      }
    }); 
          b3.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent e)
      {
        String element=" ";
          for (int j = 0; j < tree1.list.size(); j++) {
            
			element=element+tree1.list.get(j)+" ";
		}
         tf3.setText(element); 
      }
    });
    
     b4.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent e)
      {
       tree1.extrairemin();
           String element=" ";
          for (int j = 0; j < tree1.list.size(); j++) {
        element=element+tree1.list.get(j)+" ";
		}
         tf3.setText(element); 
      }
    });
     
       b6.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent e)
      {
          String elm=" ";
       for (int j = 0; j < tree1.list.size(); j++) {
            if(Integer.parseInt(tf7.getText())<tree1.list.get(j))
			elm=elm+Integer.parseInt(tf7.getText())+" <"+tree1.list.get(j)+" ";
            
		}
        tf8.setText(elm);
      }
    });
         b7.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent e)
      {
          String elm=" ";
       for (int j = 0; j < tree1.list.size(); j++) {
            if(Integer.parseInt(tf7.getText())>tree1.list.get(j))
			elm=elm+Integer.parseInt(tf7.getText())+" >"+tree1.list.get(j)+" ";
		}
        tf9.setText(elm);
     
      }
    });
     b8.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent e)
      {
  f.revalidate();
  f.repaint();
 
      }
    });
        



//j.setLayout(new FlowLayout(FlowLayout.CENTER));
j.setBackground(Color.LIGHT_GRAY);
       j.add(tf1); j.add(b1);
        j.add(tf2); j.add(b2);
        j.add(tf3); j.add(b3);
       j.add(tf6); 
       j.add(b9); //somme
//       f.add(tf5);
     
       
        j.add(tf7); //0 
        j.add(b5); //inserer
       j.add(tf8);  j.add(b6);//sup
       j.add(tf9);  j.add(b7);//inf
        
        //0
       j.add(b8); //affich
          
        j.add(b4);
        j.setLayout(new GridLayout(8,2));
        j.setSize(200,200); 
        /////////////////////
      f.add(drawer);
      f.add(j);
      f.setSize(800,800);  
      f.setLayout(new GridLayout(1, 2));  
     f.setVisible(true);
        
        
 
    
    }

 
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 488, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
   

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              
              
                //new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}




