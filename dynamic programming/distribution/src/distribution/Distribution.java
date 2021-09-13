/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distribution;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author PAVILION
 */
public class Distribution {

    /**
     * @param args the command line arguments
     */ static double []x=new double[51];
     static double []c1=new double[11];
      static double []c2=new double[11];
       static double []cent=new double[11];
        static double []ef=new double[11];
      static double []cu=new double[11]; 
       static double []nfu=new double[11];
        static double []nfe=new double[11]; 
        
        
    static double e=0; static int N=50; 
     static double var=0;
    static double max=0;
    static double min=0;
   
           static double v2=1/Math.pow(3, 2);
       static Random random = new Random();
      static double L;
       public static double Maxv(double[] ns){
 double maxValue = ns[1];
  for(int i=2;i < ns.length;i++){
    if(ns[i] > maxValue){
	  maxValue = ns[i];
	}
  }
  return maxValue;
}
       
       
      public static double Minv(double[] numbers){
 double minValue = numbers[1];
  for(int i=2;i<numbers.length;i++){
    if(numbers[i] < minValue){
	  minValue = numbers[i];
	}
  }
  return minValue;
} 
       
       
    public static void main(String[] args) {
    
        
   for(int i=1;i<x.length;i++){
    x[i]=  random.nextFloat();
      }
    for(int i=1;i<x.length;i++){
         e=e+x[i];
      }   
          e=e/50;        
        
     for(int i=1;i<x.length;i++){
        var=var+(float)Math.pow(x[i], 2);
      }        
     var=(var/50)-(float)Math.pow(e, 2);
     
       System.out.print("X[i]   ");
            for(int i=1;i<x.length;i++){
    System.out.print(x[i]+ " | ");
   }
             System.out.println("");
    System.out.println("**********************************************************************************************************************************");
    System.out.println("moyenne= " +e ); 
      System.out.println("Variance= " +var ); 
 System.out.println("**********************************************************************************************************************************");      
    System.out.println("Pour la distribution uniforme,la moyenne-E(x)= " + (e-0.5));
     System.out.println("Pour la distribution exponentielle ,la moyenne-E(x)= " + (e-0.333333)); //1/3
      System.out.println("**********************************************************************************************************************************");
     System.out.println(" Pour la distribution uniforme,la variance-Var(x)= " + (var-0.0833333)); //1/12
      System.out.println(" Pour la distribution exponentielle,la variance-Var(x)= " + (var-v2)); //
       System.out.println("********************************************************************************************************************************");
      
     ///////////////////////////
    Arrays.sort(x);
   max=Maxv(x);
   min=Minv(x);
   L=(max-min)/10;
    for(int i=1;i<ef.length;i++){
         ef[i]=0;
      } 
   System.out.println("Max= "+max +"   Min= "+min+"  L= "+L);
   System.out.println("********************************************************************************************************************************");
   
     for(int i=1;i<c1.length;i++){
    c1[i]= min+((i-1)*L);
    }
      for(int i=1;i<c2.length;i++){
    c2[i]= min+(i*L);
    }
    
         for(int i=1;i<cent.length;i++){
    cent[i]= (2*min)+(((i*2)-1)*L);
    }
         
   for(int j=1;j<c1.length;j++){      
   for(int i=1;i<x.length;i++){
  if ((x[i]>=c1[j]) && (x[i]<=c2[j])){
      ef[j]=ef[j]+1;
  }
  }
    }
    cu[1]=ef[1];
      for(int i=2;i<c2.length;i++){
    cu[i]= cu[i-1]+ef[i];
    }  
    
         for(int i=1;i<c2.length;i++){
   nfu[i]=cent[i]*N;
    } 
         for(int i=1;i<c2.length;i++){
   nfe[i]=(1-Math.exp(cent[i]*-3))*N;
 } 
         
    System.out.print("intervalle                                                      ");
     System.out.print("centre          ");
      System.out.print("effectif        ");
       System.out.print("cummul          ");
        System.out.print("uniforme N*F(X)          ");
           System.out.println("exp N*F(X)             ");
   System.out.println("**********************************************************************************************************************************");
   for(int i=1;i<c2.length;i++){
    System.out.print(i +"**");
  System.out.print("["+c1[i] +"    -    "+c2[i]+"]     " );
   System.out.print(cent[i]+"       ");
    System.out.print(ef[i]+"        ");
     System.out.print(cu[i]+"        ");
    System.out.print(nfu[i]+"        ");
   System.out.print(nfe[i]+"        ");
    System.out.println("");
   } 
  System.out.println("********************************************************************************************************************************");
         
         
}
}
