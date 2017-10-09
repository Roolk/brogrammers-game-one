import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

public class Play extends BasicGameState {
	// list of characters and their animations 
	Animation malv, movingUp, movingDown, movingLeft, movingRight
	Image map;
	boolean quit = false;
	int[] duration = {200, 200};
	float malvPositionX = 0;
	
	public Play(int state) {

	}

	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {

	}

	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {

	}

	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException {

	}

	public int getID() {
		return 1;
	}
}