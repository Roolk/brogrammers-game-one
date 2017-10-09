/**
 * This Characters class creates instances of all the characters in the game
 * and gives additional info such as stats, dialog, appearance etc
 * Characters will be a inherit from Play, Stats class
 * @author ARP
 * @since 1.0
 * @version 1.0
 */


import org.newdawn.slick.*;
import org.newdawn.slick.state.*;


public class Characters {

	protected final String charName;


	public Characters(String charName) {
		this.charName = charName;
	}

	public static void main(String args[]) {
		Character malv = new Character("Malv");

	}
}