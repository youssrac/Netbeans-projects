/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sacados;

import static java.lang.Integer.max;
import java.util.Scanner;

/**
 *
 * @author PAVILION
 */
public class Sacados {

 
    public static void main(String[] args) {
        System.out.println("entrer le volume totale :");
    Scanner scanner = new Scanner(System.in);
     int W = scanner.nextInt();
         System.out.println("entrer nombre d'objets :");
     int n = scanner.nextInt();
      int[] v = new int[n+1];
      int[] c = new int[n+1];
        	for (int i=1;i<=n;i++){
		System.out.println("volume objet "+ i);
               scanner = new Scanner(System.in);
               v[i] = scanner.nextInt();
        	System.out.println("cout objet "+ i);
               scanner = new Scanner(System.in);
              c[i] = scanner.nextInt();       
              
	}
/////////////////////////////////////////
 int[][] z = new int[100][100];
 int j;
	for( j=0;j<=W;j++){
		z[j][0]=0;
	}
	for(int i=1;i<=n;i++){
		for(j=0;j<=W;j++){
			if(j<v[i]){
				z[j][i]=z[j][i-1];
			}else{
				z[j][i]=max(z[j][i-1],z[j-v[i]][i-1]+c[i]);
			}
		}
	}
        
 ///////////////////////affichage//////////////////////////:
  System.out.println("le tableau finale :");
           	for (int i=n;i>0;i--){System.out.print(" i=" +i);
			for ( j=0;j<=W;j++){
				System.out.print(" | ");
				System.out.print(z[j][i]);
			}
			System.out.println(" | v"+i+" = "+v[i]);
      
    }
////////////////////selection///////////////////////////
    boolean[] utilise = new boolean[n+1];
    int i=0;
   	while(i<=n){
		utilise[i]=false;
		i++;
	} 
        	
        i=n;
	int k=W;
        while((j>0)&&(i>=1)){
		if(z[j][i]!=z[j][i-1]){
			utilise[i]=true;
			j=j-v[i];
		}
		i--;
	}
    ////////////////////////////
      System.out.println(" On Utilise les objets pour le volume :"+ W);
      for(i=1;i<=n;i++){
		if(utilise[i]=true)
		{
		System.out.println("objet "+ i +" de cout: " +c[i]+" volume de: "+v[i]);
	}
	}
    
    }
    
}
