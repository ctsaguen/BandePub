/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandepub;
import java.awt.Font;

/**
 *
 * @author kevin
 */
public class Clignoter extends Effet {

    public Clignoter(String message) {
        super(message);
    }
    public void afficheToiSur(){
       for (int i = 1; i < 10 ; i++) {
		b.sleep(700);
                b.setMessage(" ");
		b.sleep(700);
                b.setMessage(message);
	}
    
}

}
