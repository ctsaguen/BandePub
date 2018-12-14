/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandepub;

import bandepub.Bandeau;
import java.awt.Color;
import java.awt.Font;


/**
 *
 * @author kevin
 */
abstract class Effet  {
    
    static protected final Bandeau b = new Bandeau();
    protected String message;
    Font font = b.getFont();
    Color back = b.getBackground();
    Color fore = b.getForeground();
    
    Effet(String message){
        this.message = message;
        b.setMessage(message);
    }
    
    
   abstract void afficheToiSur();
   
   public void nombreDeRepetition(int nombreRepetition){
       int i;
       for(i = 1; i<= nombreRepetition;i++){
           this.afficheToiSur();
       }
   
   }

    
}
