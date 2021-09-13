/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mintas;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author PAVILION
 */
public class draw extends JPanel{
    	public min tree;
	//int ij=25,ji=25;
      //  int n=2; 
	public draw(min tree){
		this.tree = tree;
	}
    
public void paintComponent(Graphics g) {
  super.paintComponent(g);
  int ij=25,ji=25;
        int n=2;
    int max=0;
    for(int i=0;i<=tree.list.size();i++){
        for(int j=0;j<Math.pow(2,i)&&j+Math.pow(2,i)<tree.list.size();j++){
       if(j>max){
         max=j;
            }}}
     for(int i=0;i<=tree.list.size();i++){
     for(int j=0;j<Math.pow(2,i)&&j+Math.pow(2,i)<=tree.list.size();j++){

            for(int k=0;(k<max/((int)Math.pow(2, i)));k++){
             ij=ij+60; //width
            }
         ij=ij+60;
         g.setColor(Color.BLUE);
         g.fillOval(ij-10, ji-15,30, 30); 
         g.setColor(Color.WHITE);
         g.drawString(tree.list.get(j+(int)Math.pow(2,i)-1)+"  ",ij,ji);
         
        } 
    ji=ji+60; //niveau
    ij=ij/n; 
    n=n*2;
   
    
    }
     
        // g.drawString(tree.list.get(tree.list.size())+" ",ij,ji); 
    


 /* g.setColor(Color.BLUE);
   g.fillOval(10, 10, 200, 200); 
   g.setColor(Color.WHITE);
    g.drawString(sb.toString(), 100, 100); */
  
            
            
            
          
            
        }

}
