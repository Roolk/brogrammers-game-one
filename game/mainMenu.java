package;

import org.lwjgl.input.Mouse;
import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

public class mainMenu extends BasicGameState {

	Image playNow;
	Image exitGame; 

	public mainMenu(int state){

	}

	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {

	}

	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
			g.drawString("Welcome!", 100, 50);
			playNow.draw();
			exitGame.draw();
	}

	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException {
			int posX = Mouse.getX();
			int posY = Mouse.getY();
			// playNow button
			if((posX > 100 && posX < 311) && (posY > 209 && 260)) {
				if(Mouse.isButtonDown(0)) {
					sbg.enterState(1); // the local map state 
				}
			}
			// exit button
			if((posX > 100 && posX < 311) && (posY > 109 && 160)) {
				if(Mouse.isButtonDown(0)) {
					System.exit(0);
				}
			}

	}


	public int getID() { // returns the id of the state, so 0 for menu 
		return 0;
	}
}