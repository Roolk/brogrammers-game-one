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

	}

	public int getID() { // returns the id of the state, so 0 for menu 
		return 0;
	}
}