/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandepub;

import bandepub.Effet;
import java.awt.Font;

/**
 *
 * @author kevin
 */
public class Zoom extends Effet {

    public Zoom(String message) {
        super(message);
    }
    
    public void afficheToiSur(
    ){
        b.setMessage(message);
	b.sleep(120);
	for (int i = 5; i < 60 ; i+=5) {
		b.setFont(new Font("Dialog", Font.BOLD, 5+i));
		b.sleep(100);
	}
	b.sleep(120);
    
}
}
