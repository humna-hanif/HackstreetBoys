package Screens;

import Engine.*;
import Game.GameState;
import Game.ScreenCoordinator;
import Level.Map;
import Maps.TitleScreenMap;
import SpriteFont.SpriteFont;

import java.awt.*;

public class HowToScreen extends Screen{
	protected ScreenCoordinator screenCoordinator;
    protected Map background;
    protected KeyLocker keyLocker = new KeyLocker();
    protected SpriteFont instructionsLabel;
    protected SpriteFont how1;
    protected SpriteFont how2;
    protected SpriteFont how3;
    protected SpriteFont how4;
    protected SpriteFont how5;
    protected SpriteFont returnInstructionsLabel;


    public HowToScreen(ScreenCoordinator screenCoordinator) {
        this.screenCoordinator = screenCoordinator;
    }
    
    @Override
    public void initialize() {
        // setup graphics on screen (background map, spritefont text)
        background = new TitleScreenMap();
        background.setAdjustCamera(false);
        instructionsLabel = new SpriteFont("How To Play", 260, 49, "Serif Bold", 50, Color.red);
        how1 = new SpriteFont("Goal: Dodge the enemies to hit the gold box at the end to complete the level.", 100, 100, "Serif Bold", 18, Color.black);
        how2 = new SpriteFont("Use arrow keys or 'A', 'W', 'S', 'D' keys to move avatar up, down, left, or right.", 100, 130, "Serif Bold", 18, Color.black);
        how3 = new SpriteFont("Obstacles are outlined in red. Either jump or crouch to pass through.", 100, 160, "Serif Bold", 18, Color.black);
        how4 = new SpriteFont("If avatar hits enemy a life is lost. You have 3 lives in total.", 100, 190, "Serif Bold", 18, Color.black);
        how5 = new SpriteFont("When all lives are lost you can try again.", 100, 220, "Serif Bold", 18, Color.black);
        returnInstructionsLabel = new SpriteFont("Press Space to return to the menu.", 20, 560, "Times New Roman", 30, Color.black);
        keyLocker.lockKey(Key.SPACE);
    }

    public void update() {
        background.update(null);

        if (Keyboard.isKeyUp(Key.SPACE)) {
            keyLocker.unlockKey(Key.SPACE);
        }

        // if space is pressed, go back to main menu
        if (!keyLocker.isKeyLocked(Key.SPACE) && Keyboard.isKeyDown(Key.SPACE)) {
            screenCoordinator.setGameState(GameState.MENU);
        }
    }

    public void draw(GraphicsHandler graphicsHandler) {
        background.draw(graphicsHandler);
        instructionsLabel.draw(graphicsHandler);
        how1.draw(graphicsHandler);
        how2.draw(graphicsHandler);
        how3.draw(graphicsHandler);
        how4.draw(graphicsHandler);
        how5.draw(graphicsHandler);
        returnInstructionsLabel.draw(graphicsHandler);
      
    }
}

