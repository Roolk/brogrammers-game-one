import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

public class Play extends BasicGameState, Characters, Stats {
	// list of characters and their animations 
	Animation malv, movingUp, movingDown, movingLeft, movingRight;
	int[] duration = malv.walkSpeed; 
	float malvPositionX = malv.positionX;
	float malvPositionY = malv.positionY;
	// repeat ^^^
	Animation;

	Image map;
	boolean quit = false;


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