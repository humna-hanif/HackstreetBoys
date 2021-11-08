package Engine;

import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineEvent;
import javax.sound.sampled.LineEvent.Type;
import javax.sound.sampled.LineListener;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;


public class Audio {
	protected static AudioInputStream audio;
	protected static Clip clip;

	public static void playMusic(String fileName) {
		
		try {
			audio = AudioSystem.getAudioInputStream(new File(fileName));
		 clip = AudioSystem.getClip();
		clip.open(audio);
		clip.start();
		//needs to be fixed so that it stops when player dies
		//clip.loop(Clip.LOOP_CONTINUOUSLY);
		
		clip.addLineListener(new LineListener() {

            @Override
            public void update(final LineEvent event) {
                if (fileName == "BGM.wav" && event.getType().equals(Type.STOP)) {
                	clip.loop(1);
                }
            }
        });
		
		
		} catch (IOException | UnsupportedAudioFileException | LineUnavailableException error) {
			error.printStackTrace();
		}

	}
	public static void stopMusic() {

		clip.close();
		clip.stop();

	}

}
