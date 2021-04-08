/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.matrica;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 *
 * @author Ivor
 */
public class Matrica {
    
         public static void main(String[] args) {
    
              int prviBroj = Metode.ucitajCijeliBroj("upisi cijeli broj", "hej ovo nije broj");
         int drugiBroj = Metode.ucitajCijeliBroj("unesi drugi broj", "de pazi malo");
        int kvadrat = prviBroj * drugiBroj; 
        //System.out.println(prviBroj + " " + drugiBroj);
      

             
        int matrica [][] = new int [prviBroj] [drugiBroj];  
    
         int i;
       int red = 0; //index prvog  reda matrice
       int stupac = 0; //index prvog stupca matrice
       int redovi= prviBroj-1; //index zadnjeg reda matrice
       int stupci= drugiBroj-1; //index zadnjeg stupca matrice
       int ispis = 1;
        
       //    while(true){try{  
           
         //pošto je zbroj svih "čelija" u tablici jednak umnosku broja redova i 
         //broja stupaca tablice, ona ce se popunjavati zadanim redom od 1 
         // pa sve dok se zadnja čelija ne popuni umnoskom dva unesena broja
       while(ispis<=kvadrat){
       
           //popunjava donji red matrice , on se gleda kao odrađen i ne uzima se vise u obzir (redovi--)
           for(i=stupci;i >= stupac; i--){
           matrica[redovi][i]= ispis;
           ispis++;}
           redovi--; 
          
           //popunjava prvi stupac matrice
           for(i=redovi; i >= red; i--){
           matrica[i][stupac]=ispis;
           ispis++;} 
           stupac++;
           
           if (red<=redovi){
           //popunjava prvi red matrice
               for(i=stupac; i <=stupci; i++){
           matrica[red][i]=ispis;
           ispis++;}
               red++;}
           
           if(stupac <= stupci){
           //popunjava posljednji stupac matrice
               for(i = red; i <= redovi; i++){
           matrica[i][stupci]= ispis;
           ispis++;}
               stupci--;}}
      //  } catch(Exception e){break;}}
          // }
          
           
                 
                 for (int[] r : matrica) {
               for (int s = 0; s < r.length; s++) {
                   System.out.print(r[s] + "\t|");
               }
                 System.out.println(); }
       
       
       
       
       
       
       
       
       
         }
         }
       
        
    

