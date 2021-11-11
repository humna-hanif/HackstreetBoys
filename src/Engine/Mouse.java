package Engine;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import Game.GameState;
import Game.ScreenCoordinator;
import Screens.PlayLevelScreen;
import SpriteFont.SpriteFont;

/*
 * This class is used throughout the engine for detecting mouse state
 * This includes if a mouse is clicked
 */
public class Mouse {
	private static SpriteFont playGame;

	private static SpriteFont credits;

	private static SpriteFont howTo;

	private static SpriteFont chooseAvatar;
	
	private static ScreenCoordinator screenCoordinator;
	
	private static GamePanel gamePanel;
	
	private static final MouseListener mouseListener = new MouseListener() {

		@Override
		public void mouseClicked(MouseEvent e) {
			// Checks if the game state is menu screen to avoid other mouse detections
			if (screenCoordinator.getGameState() == GameState.MENU) {
				// gets mouse position on X and Y axis
				int mousex = e.getX();
				int mousey = e.getY();
				
				// This section gets the x and y location of sprite font along with the size of sprite font
				int minxplayGame = Math.round(playGame.getX());
				int minyplayGame = Math.round(playGame.getY() - 30);
				int maxxplayGame = (int) (minxplayGame + playGame.getWidth(playGame.getText()));
				int maxyplayGame = (int) (minyplayGame + playGame.getHeight(playGame.getText())); 
				
				int minxcredits = Math.round(credits.getX());
				int minycredits = Math.round(credits.getY() - 30);
				int maxxcredits = (int) (minxcredits + credits.getWidth(credits.getText()));
				int maxycredits = (int) (minycredits + credits.getHeight(credits.getText())); 
				
				int minxhowTo = Math.round(howTo.getX());
				int minyhowTo = Math.round(howTo.getY() - 30);
				int maxxhowTo = (int) (minxhowTo + howTo.getWidth(howTo.getText()));
				int maxyhowTo = (int) (minyhowTo + howTo.getHeight(howTo.getText())); 
				
				int minxchooseAvatar = Math.round(chooseAvatar.getX());
				int minychooseAvatar = Math.round(chooseAvatar.getY() - 30);
				int maxxchooseAvatar = (int) (minxchooseAvatar + chooseAvatar.getWidth(chooseAvatar.getText()));
				int maxychooseAvatar = (int) (minychooseAvatar + chooseAvatar.getHeight(chooseAvatar.getText())); 
				
				// If the mouse is within bounds of the sprite font (the area of sprite font) then go to that game state
				if ((mousex >= minxplayGame && mousex <= maxxplayGame) && (mousey >= minyplayGame && mousey <= maxyplayGame)) {
				    //System.out.println("Clicked on the play game.");
				    screenCoordinator.setGameState(GameState.LEVEL);
				} else if ((mousex >= minxcredits && mousex <= maxxcredits) && (mousey >= minycredits && mousey <= maxycredits)) {
				    //System.out.println("Clicked on the credits.");
				    screenCoordinator.setGameState(GameState.CREDITS);
				} else if ((mousex >= minxhowTo && mousex <= maxxhowTo) && (mousey >= minyhowTo && mousey <= maxyhowTo)) {
				   // System.out.println("Clicked on the how to.");
				    screenCoordinator.setGameState(GameState.HOWTO);
				} else if ((mousex >= minxchooseAvatar && mousex <= maxxchooseAvatar) && (mousey >= minychooseAvatar && mousey <= maxychooseAvatar)) {
				    //System.out.println("Clicked on the avatar choosing.");
				    screenCoordinator.setGameState(GameState.CHOOSEAVATAR);
				}
			} else if (PlayLevelScreen.playLevelScreenRunning() == true) {
				// gets mouse position on X and Y axis
				int mousex = e.getX();
				int mousey = e.getY();
				
				// This section gets the x and y location of pause/play button area
				// NOTE: Reconfigure the locations if you change location of pause/play button 
				// (I know this is inefficient but this worked within the time constraint we had)
				int minxButton = 670;
				int minyButton = 10;
				
				int maxxButton = (int) (705);
				int maxyButton = (int) (32); 
				
				// If the mouse is within bounds of the pause/play button (the area of pause/play button) then switch pause state
				if ((mousex >= minxButton && mousex <= maxxButton) && (mousey >= minyButton && mousey <= maxyButton)) {
				    //System.out.println("Clicked on the play game.");
					gamePanel.switchPauseState();
				}
			}
		}

		@Override
		public void mousePressed(MouseEvent e) {}

		@Override
		public void mouseReleased(MouseEvent e) {}

		@Override
		public void mouseEntered(MouseEvent e) {}

		@Override
		public void mouseExited(MouseEvent e) {}
    };

	// prevents Mouse from being instantiated -- it's my way of making a "static" class like C# has
	private Mouse() { }
	
	// sets the game panel to switch the pause states
	public static void setGamePanel(GamePanel gPanel) {
		gamePanel = gPanel;
    }
	
	// sets the screen coordinator to get the game states
	public static void setScreenCoordinator(ScreenCoordinator sCoordinator) {
		screenCoordinator = sCoordinator;
    }
	
	// sets the sprite fonts to get the options on menu screen
	public static void setSpriteToClick(SpriteFont spriteFont, int num) {
		if (num == 1) {
			playGame = spriteFont;
        } else if (num == 2) {
        	credits = spriteFont;
        } else if (num == 3) {
        	howTo = spriteFont;
        } else if (num == 4) {
        	chooseAvatar = spriteFont;
        }
    }
    
    public static MouseListener getMouseListener() {
    	return mouseListener;
    }
    
}
