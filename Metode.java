/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.matrica;

import javax.swing.JOptionPane;

/**
 *
 * @author Ivor
 */
public class Metode {
    public static int ucitajCijeliBroj(String poruka, String greska){
       while(true){
              try{
              return Integer.parseInt(JOptionPane.showInputDialog(poruka));
              }catch (Exception e){
              JOptionPane.showMessageDialog(null, greska);}} 
 
    

}}

    
  
        
  


