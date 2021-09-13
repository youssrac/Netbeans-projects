/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piecemonnaie;

import static java.lang.Integer.min;
import java.util.Scanner;



/**
 *
 * @author PAVILION
 */
public class Piecemonnaie {


//int i,j;

    public static void main(String[] args) {
    System.out.println("entrer la somme :");
    Scanner scanner = new Scanner(System.in);
     int S = scanner.nextInt();
    System.out.println("entrer nombre de pieces :");
     int p = scanner.nextInt();
    int[] v = new int[p+1];
    	for (int i=1;i<=p;i++){
		System.out.println("la valeur de piece "+ i);
               scanner = new Scanner(System.in);
                int vi = scanner.nextInt();
		v[i] = vi;
              
	}
       //////////////algorithme/////////////

      int[][] Z = new int[100][100];
      int i;
        	for(i=0;i<=p;i++){
		Z[0][i]=0;
	}
	for(int t=1;t<=S;t++){
		Z[t][1]=t;
	}
	for(i=2;i<=p;i++){
		for(int t=1;t<=S;t++){
			if(t<v[i]){
				Z[t][i]=Z[t][i-1];
			}else{
				Z[t][i]= min(Z[t][i-1],Z[t-v[i]][i]+1);
			}
		}
	} 
        System.out.println("le tableau finale :");
         ////////affichage//////////
       
           	for (i=p;i>0;i--){System.out.print(" i=" +i);
			for (int j=0;j<=S;j++){
				System.out.print(" | ");
				System.out.print(Z[j][i]);
			}
			System.out.println(" | v"+i+" = "+v[i]);
      
    }
                
      /////////////selection des pieces//////////:
      int[] utilise = new int[p+1];
      i=0;
    	while(i<=p){
		utilise[i]=0;
		i++;
	}
	
	i=S;
        int k=p;
	while((i>0)&&(k>=1)){
		while (Z[i][k]!=Z[i][k-1]){
		
			utilise[k]++;
			i=i-v[k];
		}
		k--;
	}
        
          System.out.println(" On Utilise les pieces pour la somme :"+ S);
	for(i=1;i<=p;i++){
		if(utilise[i]!=0)
		{
		System.out.println(utilise[i]+"n de piece: "+v[i]);
	}
	}
}
        
  
 
    
    
}

