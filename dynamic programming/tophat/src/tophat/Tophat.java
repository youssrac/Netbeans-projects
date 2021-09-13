/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tophat;

import java.util.Random;

/**
 *
 * @author PAVILION
 */
public class Tophat {

    static double []p={0,0.05,0.15,0.20,0.30,0.20,0.10};
     static double []f=new double[7];
     static double []u=new double[7];  
      static Random random = new Random();
    public static void main(String[] args) {
     f[1]=p[1];
        for(int i=2;i<p.length;i++){
     f[i]=f[i-1]+p[i]; 
      }
           for(int i=1;i<p.length;i++){
     u[i]=  random.nextDouble();
      }
           
    System.out.print("F(X)   ");
            for(int i=1;i<p.length;i++){
    System.out.print(f[i]+ " | ");
   }
             System.out.println("");
          System.out.print("U   ");
            for(int i=1;i<p.length;i++){
    System.out.print(u[i]+ " | ");
   }           
            System.out.println("");
           
             for(int i=1;i<p.length;i++){
                  int j=1;
            while(u[i]>=f[j]){
            j++;
            }
             System.out.print(j+ " | ");
             }
    }
    
}
