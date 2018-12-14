/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandepub;
import bandepub.Clignoter;
import bandepub.ChangerCouleur;
import static java.sql.DriverManager.println;

import java.awt.Color;
import java.awt.Font;
/**
 *
 * @author kevin
 */
public class BandePub {

    /**
     * @param args the command line arguments TEST
     */
    public static void main(String[] args) {
       
        Clignoter cli = new Clignoter("je clignote un peu mieu");
        //cli.afficheToiSur();
        ChangerCouleur chan = new ChangerCouleur("couleur");
        //chan.afficheToiSur();
        Rotation rot = new Rotation("je tourne");
        //rot.afficheToiSur();
        JeuDuPendu jeu = new JeuDuPendu("je joue");
        //jeu.afficheToiSur();
        TeleType tel = new TeleType("j'ecris progressivement");
        //tel.afficheToiSur();
        Zoom zo = new Zoom("je Zoom");
        //zo.afficheToiSur();
        ChangerCouleurText chant = new ChangerCouleurText("couleur du texte");
        //chant.afficheToiSur();
        Scenario scene = new Scenario();
        scene.AjouterEffet(chant, 3);
        scene.AjouterEffet(zo, 2);
        scene.AjouterEffet(cli, 1);
        scene.AjouterEffet(jeu, 1);
        scene.AjouterEffet(chan, 2);
        scene.AjouterEffet(rot, 2);
         scene.AjouterEffet(tel, 1);
        scene.LireScenario();
    }
    
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

