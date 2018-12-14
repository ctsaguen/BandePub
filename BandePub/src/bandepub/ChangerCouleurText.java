/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandepub;

import static bandepub.Effet.b;
import java.awt.Color;

/**
 *
 * @author raguiri
 */
public class ChangerCouleurText extends Effet {
    
      public ChangerCouleurText( String message) {
        super( message);
    }

    void afficheToiSur() {
        b.setMessage(message);
	b.sleep(400);
	b.setForeground(Color.RED);
	b.sleep(400);
	b.setForeground(Color.YELLOW);
	b.sleep(400);
	b.setForeground(Color.BLUE);
        b.sleep(400);
	b.setForeground(Color.ORANGE);
        b.sleep(400);
	b.setForeground(Color.BLACK);
        b.sleep(400);
    
}
    
}
