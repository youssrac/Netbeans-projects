/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testdivision;

import java.util.Scanner;
       ;

/**
 *
 * @author PAVILION
 */
public class Testdivision {

    /**
     * @param args the command line arguments
     */  static String type;
       public static String test(Object a) {
         
       if(a instanceof Double){
    
       type="double";
       }
       if(a instanceof Integer){
       
       
        type="int";
       }
       
       if(a instanceof String){
        type="String";
        
 
       } 
        if(a instanceof Boolean){
        type="Boolean";
  
       }
        return type;
    }
       public static void division(Object a,Object b) {
       Testdivision.test(a);
       if ( Testdivision.test(a)=="String"|| Testdivision.test(a)=="Boolean"||  Testdivision.test(b)=="String"|| Testdivision.test(b)=="Boolean"){
           System.out.println("division impossible,type incorrect");
       }
      
       else{
           if ( Testdivision.test(a)=="int"&& Testdivision.test(b)=="int"){
               
               int i = (Integer) a;
               int j = (Integer) b;
               if (j==0){
                   System.out.println("division par 0 impossible");
               }
               else{
               System.out.println("int/int,resultat est = "+i/j);
      }
       
       
       }
           else 
           {
       if (Testdivision.test(a)=="double"&& Testdivision.test(b)=="double"){
           
            double i = (double) a;
            double j = (double) b;
               if (j==0){
                   System.out.println("division par 0 impossible");
               }
               else{
               System.out.println("double/double,resultat est = "+i/j);
           
       }}
       else{
                {
       if (Testdivision.test(a)=="double"&& Testdivision.test(b)=="int"){
           
           double i = (double) a;
              int j = (int) b;
               if (j==0){
                   System.out.println("division par 0 impossible");
               }
               else{
               System.out.println("double/int,resultat est = "+i/j);
           
       }}
       else{
           if (Testdivision.test(a)=="int"&& Testdivision.test(b)=="double"){
           
            int i = (int) a;
             double j = (double) b;
               if (j==0){
                   System.out.println("division par 0 impossible");
               }
               else{
               System.out.println("int/double,resultat est = "+i/j);
           
       }}
           
       }}}}}}        
    public static void main(String[] args) {

Testdivision.division(5,4);
Testdivision.division(0,4);
Testdivision.division(4,0);
Testdivision.division("vf",4);
Testdivision.division(5,"ddsd");
Testdivision.division(true,4);
Testdivision.division(5,4.5);
Testdivision.division(5.2,4);
       

    }


}











