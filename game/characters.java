/**
 * This Characters class creates instances of all the characters in the game
 * and gives additional info such as stats, dialog, appearance etc
 * Characters will be a inherit from Play, Stats class
 * @author ARP
 * @since 1.0
 * @version 1.0
 *
 */


import org.newdawn.slick.*;
import org.newdawn.slick.state.*;


public class Characters {

	protected final String charName;
	protected final int[] walkSpeed;
	protected final float positionX;
	protected final float positionY;

	protected final Image front;
	protected final Image back;
	protected final Image right;
	protected final Image left;



	public Characters(String charName, double walkSpeed, positionX, positionY, Image front, Image back, Image right, Image left) {
		this.charName = charName;
		this.walkSpeed = walkSpeed;
	}

	public static void main(String args[]) {
		Character malv = new Character("Malv", {200, 200}, new Image{'res'});

	}
}