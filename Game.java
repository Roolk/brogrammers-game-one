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
	// the different states' id
	public static final int mainMenu = 0;
	public static final int localMap = 1;
	public static final int worldMap = 2;
	public static final int stats = 3;
	public static final int combatMode = 4;



	public Game(String gamename) {
		super(gamename);
		this.addState(new Menu(mainMenu));
		this.addState(new Play(play));
	}

	public void initStatesList(GameContainer gc) throws SlickException {
		this.getState(mainMenu).init(gc, this);
		this.getState(play).init(gc, this);
		this.enterState(mainMenu); // the initial state

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
