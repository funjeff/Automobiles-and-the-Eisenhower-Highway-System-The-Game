package location;

import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

import main.GameCode;
import resources.DataManager;

public class StartGame extends Location {

	public StartGame() {
		super(true);
	}
	@Override
	public void eventStart () {                  
	        this.setSelected("unimportant");
	        GameCode.getTextInterface().println("THE YEAR IS 1955 YOU ARE A FARMER LIVING IN IOWA YOU HEAR THAT GRAIN CAN SELL FOR A LOT OF MONEY IN NEW YORK SO YOU INTEND TO MAKE THE TRIP THERE TO SELL");
	        GameCode.getTextInterface().println("LUCKILY YOU HAVE THE POWER OF AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM SO IT SHOULD BE A PRETTY SMOOTH TRIP REGARDLESS YOU TAKE $1000 DOLLARS FOR SUPPLYS,");
	        GameCode.getTextInterface().println("TOLL BOOTHS, AND OTHER 'MISHAPS' YOU MAY RUN INTO ONCE YOUR REDAY YOU SET OFF WITH A FULL TANK OF GAS AND THE DETERMINATION TO MAKE IT TO NEW YORK");
	        GameCode.getTextInterface().println("THANK GOD FOR AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM");
	        GameCode.getTextInterface().query(new String[] { "HIT THE ROAD!" });
	        this.changeMusic("music/thank god for automobiels and the eisenhower hiway sytem attempt 6.wav", DataManager.getVolume());
	        while (DataManager.noError()) {
	          DataManager.setFileNumber(DataManager.fileNumber() + 1);
	          try {
	            FileReader fr = new FileReader("custom Events/Custom Event " + Integer.toString(DataManager.fileNumber()) + ".txt");
	            fr.close();
	          } catch (IOException e) {
	            DataManager.setnoError(false);
	            DataManager.setFileNumber(DataManager.fileNumber() - 1);
	          }
	        }
	        int amountOfStuffLeftToGo = 0;
	        while (amountOfStuffLeftToGo != DataManager.fileNumber()) {
	      	  amountOfStuffLeftToGo++;
	          try {
	            DataManager.setMaxRNGValue(DataManager.getMaxRNGValue() + Integer.parseInt((String)Files.readAllLines(Paths.get(DataManager.getAbsolutePath().replace(".", "") + "custom Events/Custom Event " + Integer.toString(amountOfStuffLeftToGo) + ".txt", new String[0]), Charset.forName("ISO-8859-1")).get(1)));
	          }
	          catch (IOException localIOException8) {}
	        }
	}
@Override
public void runEventCode () {
	if (this.checkSelected("HIT THE ROAD!")) {
		GameCode.setCurrentEvent(GameCode.getDataManager().getComunityDrive());
	}
}
}
