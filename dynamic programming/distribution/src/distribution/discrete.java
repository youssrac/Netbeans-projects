/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distribution;

import static distribution.Distribution.x;
import java.util.Random;

/**
 *
 * @author PAVILION
 */
public class discrete {
 static double []x=new double[51];
 static int []b=new int[51];
 static int []ef=new int[4];
 static int []cu=new int[4];
 static double []nf=new double[4];
   static int []p={0,0,2,6};
    static double e=0;static int N=50; 
     static double var=0; 

  static Random random = new Random();
    public static void main(String[] args) {
    
 for(int i=1;i<x.length;i++){
    x[i]=  random.nextFloat();
      }

 for(int i=1;i<x.length;i++){
 if(x[i]>=0.5){b[i]=6;}
 else {
     if(x[i]>=0.3){b[i]=0;}
     else{
         b[i]=2;
     }
 }
      }

   for(int i=1;i<b.length;i++){
         e=e+b[i];
      }   
          e=e/50;        
        
  for(int i=1;i<b.length;i++){
        var=var+(float)Math.pow(b[i], 2);;
      }        
     var=(var/50)-(float)Math.pow(e, 2);
     
    System.out.print("X[i]   ");
   for(int i=1;i<b.length;i++){
    System.out.print(b[i]+ " | ");
   }
             System.out.println("");
                  System.out.println("***********************************************************");
    System.out.println("moyenne= " +e ); 
      System.out.println("Variance= " +var ); 
           System.out.println("***********************************************************");
    System.out.println("Pour la distribution discrete,la moyenne-E(x)= " + (e-3.4));
     System.out.println(" Pour la distribution discrete,la variance-Var(x)= " + (var-7.24));
                 System.out.println("***********************************************************");
       
        for(int j=1;j<b.length;j++){
            if(b[j]==0){ef[1]++;}
            else{
             if(b[j]==2){ef[2]++;}
             else{
                 ef[3]++;
            }
            
    } 
        }
        cu[1]=ef[1];
      for(int i=2;i<cu.length;i++){
    cu[i]= cu[i-1]+ef[i];
    }
      
      nf[1]=N*0.3;
      nf[2]=N*0.5;
      nf[3]=N*1;
      
        System.out.print("X        ");
        System.out.print("effectif      ");
       System.out.print("cummul  ");
        System.out.println(" N*F(X)          ");
       System.out.println("***********************************************************");
         for(int i=1;i<cu.length;i++){
    System.out.print(p[i] +"       ");
    System.out.print(ef[i]+"             ");
     System.out.print(cu[i]+"      ");
     System.out.print(nf[i]+"      ");
    System.out.println("");
   } 
  System.out.println("************************************************************************");
      
     
}
}
