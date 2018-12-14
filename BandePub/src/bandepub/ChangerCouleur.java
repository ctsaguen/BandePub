/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandepub;
import java.awt.Color;

/**
 *
 * @author kevin
 */
public class ChangerCouleur extends Effet {

    public ChangerCouleur( String message) {
        super( message);
    }

    void afficheToiSur() {
        b.setMessage(message);
	b.sleep(400);
	b.setBackground(Color.DARK_GRAY);
	b.sleep(400);
	b.setBackground(Color.YELLOW);
	b.sleep(400);
	b.setBackground(Color.RED);
        b.sleep(400);
	b.setBackground(Color.BLUE);
        b.sleep(400);
	b.setBackground(back);
        b.sleep(400);
    
}
}
