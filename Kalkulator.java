/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.lovecalc;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Ivor
 */
public class Kalkulator {
    
    public static void main(String[] args) {
         //potrebni stringovi
        String prvoIme = JOptionPane.showInputDialog("unesi ime").replace("-","").replace(" ", "");
        
        String drugoIme = JOptionPane.showInputDialog("unesi drugo ime").replace("-","").replace(" ", "");
        
        String obaImena = prvoIme.trim().replace("-", "") + drugoIme.trim().replace("-","");
        
        //prebacuje te stringove u odgovarajuci
        // character array 
        char[] nizA = new char [prvoIme.trim().length()];
        
            for(int i = 0; i < prvoIme.trim().length();i++){
            nizA[i]=prvoIme.charAt(i);}
        
               for (char a : nizA){System.out.print(a);}
               System.out.print("  ");
        
        
        char [] nizB = new char [drugoIme.trim().length()];
        
             for (int i = 0; i < drugoIme.trim().length();i++)
               {nizB[i]=drugoIme.charAt(i);}
        
               for(char a : nizB) {System.out.print(a);}
               
      //  System.out.println();
        char [] nizC = new char [obaImena.length()];
        
               for(int i = 0; i < obaImena.length();i++)
               {nizC[i]=obaImena.charAt(i);}
      //  for (char a : nizC){System.out.print(a);}
        
      int duzinaA = nizA.length-1;
      int duzinaB = nizB.length-1;
      int duzinaC = nizC.length-1;
      
      int [] brojcaniA = new int[nizA.length];
      int [] brojcaniB = new int [nizB.length];
      
       //// System.out.println(Arrays.toString(nizC));
      //ubacuje vrijednosti u prvi brojcani niz
        System.out.println();
        
 //  while (true){ 
  //    try{
      
      for(int i = 0; i <= duzinaA; i++){
          int broj = 0;
      for(int j = 0; j <= duzinaC; j++){
          
          if(Character.toLowerCase(nizA[i])==Character.toLowerCase(nizC[j])){
          broj++;} 
          
           
          
          brojcaniA[i]=broj;
          
      }}
      
     //popunjava drugi brojcani niz
     
     for(int i = 0; i <= duzinaB; i++){
          int broj = 0;
      for(int j = 0; j <= duzinaC; j++){
          
          if(Character.toLowerCase(nizB[i])==Character.toLowerCase(nizC[j])){
          broj++;} 
          
           
          
          brojcaniB[i]=broj;
          
      }}
     
   //  }
       
   // catch(Exception e){break;}}
   
   //ispisuje prvi broj
   for (int i = 0; i < brojcaniA.length;i++)
       {System.out.print(brojcaniA[i]);}
        System.out.print(" ");
        
     
   //Ispisuje drugi broj     
    for (int i = 0; i < brojcaniB.length;i++)
       {System.out.print(brojcaniB[i]);}   
        
    
        System.out.println();
        
        int [] noviBroj= null;
        //stvara novi broj s jednako znamenki kao veci broj od prethodna 2 i ispisuje
    if (brojcaniA.length>brojcaniB.length || brojcaniA.length==brojcaniB.length){
   noviBroj = new int [brojcaniA.length];
   
      // for (int i = 0; i < noviBroj.length;i++)
      // {System.out.print(noviBroj[i]);}
    }
    if (brojcaniA.length<brojcaniB.length){
     noviBroj = new int [brojcaniB.length]; 
   // for (int i = 0; i < noviBroj.length;i++)
    //  {System.out.print(noviBroj[i]);}
    }
        
      //  System.out.println(Arrays.toString(noviBroj));
 //   for (int i = 0; i <= noviBroj.length; i++){
  //      System.out.print("k   ");}
  
  
  
     //   System.out.println(noviBroj.length);
     int z = noviBroj.length-1;
     int a = brojcaniA.length-1;
     int b = brojcaniB.length-1;
     
     
     //popunjava niz noviBroj, neovisno o tome jel prvo ime duze ili krace od drugoga
     // te jesu li imena jednake duljine 
     
  if(brojcaniA.length-1!=brojcaniB.length-1){
     for (int k = 0 ; k<=noviBroj.length-1;k++){
         
         if(k<=a && b>=0){
         
         noviBroj[k] = brojcaniA[k] + brojcaniB[b];
             System.out.print(noviBroj[k]);
         b--;}
         
         if (k>a){
         noviBroj[k] = brojcaniB[b];
             System.out.print(noviBroj[k]);
         b--;
         }
         
        if(b<0 && k<=a){noviBroj[k]=brojcaniA[k]; System.out.print(noviBroj[k]);}
     
        }}
  //za slucaj da su imena jednake duljine  npr Ivo -- Iva
  if(brojcaniA.length-1==brojcaniB.length-1){
  for (int k = 0 ; k<=noviBroj.length-1;k++){
      if(k<=a && b>=0){
         
         noviBroj[k] = brojcaniA[k] + brojcaniB[b];
             System.out.print(noviBroj[k]);
         b--;}
  }
  }
        
         
         System.out.println();
         
     //popunjava od 3 do kraja
       int m = noviBroj.length-1;
       int n = 0;
       //int brojac = 0;
       
       for(int brojac =0; m>=brojac;brojac++){
           
           
         if(brojac<=m && m != 1){ 
           for(int i =0; i <= m; i++){
       
               if(i==m && m != 0){System.out.print(noviBroj[i]  );  
                  {if(brojac>=2){brojac--;}} 
       }

               if(i<m){noviBroj[i]=noviBroj[i]+noviBroj[m];
                 System.out.print(noviBroj[i] );
                  m--;  {if(brojac>=2 && i !=0){brojac--;}}
       }}
     
                 System.out.println();}
       
         if(brojac==m && (m ==1 || m ==0)){
       
                if(noviBroj[0]<10 && noviBroj[1]<10){
                System.out.print(noviBroj[0] + "" +noviBroj[1] +"%");}
        
                else{
                   for(int j = 0; j<=1;j++){
            
                       if(noviBroj[j]<10){System.out.print(noviBroj[j]);}
            
                       if (noviBroj[j]%10 == 0){
                       noviBroj[j]=noviBroj[j]/10;
                       System.out.print(noviBroj[j]);}
               
           
                      if(noviBroj[j]>10 && noviBroj[j]%10>0){
                     noviBroj[j]=(noviBroj[j]/10)+(noviBroj[j]%10);
                        if(noviBroj[j]>10&&noviBroj[j]%10>0){
                        noviBroj[j]=(noviBroj[j]/10)+(noviBroj[j]%10);}
                       if(noviBroj[j]%10==0){noviBroj[j]=noviBroj[j]/10;}
                        System.out.print(noviBroj[j]);}
          
                      if (j==1){System.out.print("%");}
           
           } }
       
       }}
       
       
          
    
   
        
         
}
    
 
    
}
 
     
     
 


 
 
 
       
   
       
      
        
        
              
        
    

