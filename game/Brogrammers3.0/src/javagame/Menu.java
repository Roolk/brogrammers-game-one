package javagame;

import org.lwjgl.input.*;
import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

import java.awt.Color;
import java.awt.Frame;

public class Menu extends BasicGameState {
	
	Image playNow;
	Image exitGame;
	
	public static Frame bg;
	
	
	public Menu(int state) {
		bg = new Frame() {{
			setBackground(Color.green);
			setSize(500, 500);
			setVisible(true);
		}};
	
	}
	
	@Override
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
		playNow = new Image("res/play-now.png");
		exitGame = new Image("res/exit icon.png");
		
	}
	
	@Override
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
		g.drawString("Food Delivery!", 100, 50);
		playNow.draw(100, 100);
		exitGame.draw(100, 230);
	}
	
	@Override
	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException {
		
		
		
	}
	
	public int getID() {
		return 0;
	}
}
