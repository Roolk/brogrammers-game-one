package; // we'll name the package later depending on the class name

/**
  * @author	 Brogrammers
  * @since '17
  * @version 1.0 
  */



import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

public class Game extends StateBasedGame {

	public static final String gamename = "";
	// the different states
	public static final int menu = 0;
	public static final int play = 1; 

	public Game(String gamename) {
		super(gamename);
		this.addState(new Menu(menu));
		this.addState(new Play(play));
	}

	public void initStatesList(GameContainer gc) throws SlickException {
		this.getState(menu).init(gc, this);
		this.getState(play).init(gc, this);
		this.enterState(menu);

	}

	public static void main(String[] args) {
		AppGameContainer appgc;
		try {
			appgc = new AppGameContainer(new Game(gamename));
			appgc.setDisplayMode(640, 360, false);
		} catch(SlickException e) {
			e.printStackTrace(); // method that outputs the error by the Slick library
		}
	}
	
}
