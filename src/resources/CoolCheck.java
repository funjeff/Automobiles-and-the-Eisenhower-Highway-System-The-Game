package resources;

import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.LineEvent;
import javax.sound.sampled.LineListener;

import main.GameCode;

public class CoolCheck implements LineListener{
	public CoolCheck (){
	}
	public boolean playing = false;
	public void play (String songName, float volume){
		if (songName.equals("marsh")){
			GameCode.waitUntil = 1800;
			GameCode.soundFile = new File ("music/marsh-ans theme version 2.wav");
		}
		if (songName.equals("god")){
			GameCode.waitUntil = 1624;
			GameCode.soundFile = new File ("music/thank god for automobiels and the eisenhower hiway sytem attempt 6.wav");
		}
		if (songName.equals("extrasensory")){
			GameCode.waitUntil = 1317;
			GameCode.soundFile = new File ("music/extrasensory.wav");
		}
		if (songName.equals("tital")){
			GameCode.soundFile = new File ("music/tital theme.wav");
			GameCode.waitUntil = 696;
		}
		if (songName.equals("roads")){
			GameCode.soundFile = new File ("music/clear the roads (final).wav");
			GameCode.waitUntil = 1654;
		} 
		if (songName.equals("bandits")) {
			GameCode.soundFile = new File ("music/vs bandits.wav");
			GameCode.waitUntil = 1125;
		}
		if (songName.equals("road rage")) {
			GameCode.soundFile = new File ("music/ROAD RAGE!.wav");
			GameCode.waitUntil = 1513;
		}
		if (songName.equals("mobius")) {
			GameCode.soundFile = new File ("music/mobius batte.wav");
			GameCode.waitUntil = 1620;
		}
		if (songName.equals("jumping")) {
			GameCode.soundFile = new File ("music/jumping through hoops.wav");
			GameCode.waitUntil = 1266;
		}
		try {
		GameCode.ais = AudioSystem.getAudioInputStream(GameCode.soundFile);
		GameCode.format = GameCode.ais.getFormat();
		DataLine.Info info = new DataLine.Info(Clip.class, GameCode.format);
		GameCode.clip = (Clip) AudioSystem.getLine (info);
		GameCode.clip.addLineListener(this);
		GameCode.clip.open (GameCode.ais);
		FloatControl gainControl = (FloatControl) GameCode.clip.getControl(FloatControl.Type.MASTER_GAIN);
		gainControl.setValue(volume);
		GameCode.clip.start();
		playing = true;
		} catch (Exception e){
		System.out.println("whoops (error message) ");
		}
		
	}
	public boolean isPlaying () {
		return playing;
	}
	public void playSoundEffect (float volume, String effectName){
		GameCode.soundFile2 = new File (effectName);
		try {
		GameCode.ais2 = AudioSystem.getAudioInputStream(GameCode.soundFile2);
		GameCode.format2 = GameCode.ais2.getFormat();
		DataLine.Info info2 = new DataLine.Info(Clip.class, GameCode.format2);
		GameCode.clip2 = (Clip) AudioSystem.getLine (info2);
		GameCode.clip2.open (GameCode.ais2);
		FloatControl gainControl2 = (FloatControl) GameCode.clip2.getControl(FloatControl.Type.MASTER_GAIN);
		gainControl2.setValue(volume);
		GameCode.clip2.start();
		} catch (Exception e){
		System.out.println("whoops (error message) ");
		}
	}
	@Override
	public void update(LineEvent event) {
		if (event.getType() == LineEvent.Type.START){
			playing = true;
		} else {
			if (event.getType() == LineEvent.Type.STOP){
				GameCode.clip.stop ();
				GameCode.clip.flush ();
				GameCode.clip.setFramePosition(0);
				playing = false;
		}
			
		}
		
	}

}
