/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandepub;

import bandepub.Effet;


/**
 *
 * @author kevin
 */
public class TeleType extends Effet {

    public TeleType(String message) {
        super(message);
    }
    
    public void afficheToiSur(){
        b.setMessage(message);
       String values[] = message.split("");
       String textFinal = values[0];
       for (int i = 1; i <= values.length ; i++) {
           b.setMessage(textFinal);
           textFinal = textFinal + values[i]; 
           b.sleep(200);
}
    }
}
