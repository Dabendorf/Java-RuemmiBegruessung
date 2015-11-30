package ruemmi;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * Dies ist die Hauptklasse des Ruemmibegruessungsprojektes.
 * Sie fragt sie nach ihrem Gemuetszustand und zeigt abhaengig davon eine Meldung, einen Baum oder einen Wald an.
 * 
 * @author Lukas Schramm
 * @version 1.0
 *
 */
public class RuemmiBegruessung {
	
	public static void main(String[] args) {
	    new RuemmiBegruessung().gemuetsfrage();
	}
	
	private void gemuetsfrage() {
		String umbruch = System.getProperty("line.separator");
		final JFrame Frage = new JFrame("");
	    Frage.setTitle("Willkommen");
	    Object[] options = {"Knorke!", "Fabulös!", "Es geht", "Schlecht"};
	    int willkommen = JOptionPane.showOptionDialog(null,
	    "Wunderschönen Guten Tag Frau Rümmler!"+umbruch+"Wie geht es Ihnen?",
	    "Willkommen",
	    JOptionPane.DEFAULT_OPTION, 
	    JOptionPane.QUESTION_MESSAGE, 
	    null, options, options[0]);
	    if(willkommen == 0) {
	    	JOptionPane.showMessageDialog(null, "Das freut uns ungemein!"+umbruch+"Ihre Klasse grüßt und wünscht einen tollen Tag!", "Perfekt", JOptionPane.PLAIN_MESSAGE);
	    	System.exit(0);
	    } else if(willkommen == 1) {
	    	JOptionPane.showMessageDialog(null, "Ihre Klasse wünscht einen tollen Tag &"+umbruch+"bittet darum, keinen Schüler zu ärgern!", "Perfekt", JOptionPane.PLAIN_MESSAGE);
	    	System.exit(0);
	    } else if(willkommen == 2) {
	    	JOptionPane.showMessageDialog(null, "Na das könnte besser laufen!"+umbruch+"Nehmen Sie diesen Baum als Symbol der Besserung!", "Das geht besser", JOptionPane.PLAIN_MESSAGE);
	    	new WBaumZeichnen();
	    } else if(willkommen == 3) {
	    	JOptionPane.showMessageDialog(null, "Na das ist ja schrecklich!"+umbruch+"Nehmen Sie diesen Wald als Symbol der Besserung!", "Das geht besser", JOptionPane.PLAIN_MESSAGE);
	    	new WaldZeichnen();
	    } else {
	    	JOptionPane.showMessageDialog(null, "Bitte beantworten Sie doch die Frage!", "Bitte Anweisungen folgen", JOptionPane.PLAIN_MESSAGE);
	    	gemuetsfrage();
	    }
	}
}