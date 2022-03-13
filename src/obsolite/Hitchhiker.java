package obsolite;

import java.util.Random;

import location.Location;
import main.GameCode;
import resources.DataManager;

public class Hitchhiker extends Location {
	int eventRandom = 0;
	Random RNG = new Random ();
	public Hitchhiker () {
		super(false);
	}
	@Override
	public void eventStart() {
		GameCode.getTextInterface().println("AS YOU ARE DRIVEING ALONG THE ROAD YOU SEE A FIGURE WAVEING THIER ARM ITS A HICHIKER PICKING THEM UP COULD BE RISKY BUT IT COULD BE FUN");
        GameCode.getTextInterface().println(" ");
        GameCode.getTextInterface().println(" ");
        GameCode.getTextInterface().println(" ");
        GameCode.getTextInterface().println(" ");
        GameCode.getTextInterface().query(new String[] { "PICK THEM UP", "DRIVE DRIVE DRIVE !!!!" });
        eventRandom = (RNG.nextInt(8) + 1);
	}
	 @Override
	public void runEventCode () {
		      if (GameCode.getTextInterface().selected.equals("PICK THEM UP")) {
		        if (eventRandom >= 8) {
		          GameCode.getTextInterface().println("YOU TALK FOR A WHILE WITH THE MAN UNTIL HE DISAPEARS RANDOMLY YOU FIND A NOTE IT READS HA HA I HAVE SABATOGED THE EVIL CAPTALIST FOOD SUPPLY");
		          GameCode.getTextInterface().println(" ");
		          GameCode.getTextInterface().println("LOSE 40 PERCENT GRAIN");
		          GameCode.getDataManager().grain -= 40;
		          GameCode.getTextInterface().println("IN SOVIET RUSSIA GOD THANKS YOU FOR AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM");
		          GameCode.getTextInterface().println(" ");
		          GameCode.getTextInterface().println(" ");
		          GameCode.getDataManager().setCommunist(true);
		          GameCode.getTextInterface().query(new String[] { "GET BACK ON THE ROAD" });
		          GameCode.getTextInterface().selected = "unimportant";
		        }
		        if (eventRandom <= 5) {
		          GameCode.getTextInterface().println("YOU MEET UP WITH THE HITCHIKER AND HE TELLS YOU THAT HE NEEDS YOU TO TAKE HIM TO A PAYPHONE BECAUSE HIS CAR WAS DESTROYIED IN AN ACCIDENT HE ALSO TELLS YOU THAT ");
		          GameCode.getTextInterface().println("HIS CAR HAD A BIT OF GAS LEFT ON IT AND HE SIPHONED IT OUT HE DOESNENT NEED IT ANYMORE SO HE GIVES IT TO YOU");
		          GameCode.getTextInterface().selected = "unimportant";
		          GameCode.getDataManager().gas += 25.0D;
		          GameCode.getTextInterface().println(" ");
		          GameCode.getTextInterface().println("GAIN 25 GAS UNITS");
		          GameCode.getTextInterface().query(new String[] { "GET BACK ON THE ROAD" });
		        }
		        if ((eventRandom == 6) || (eventRandom == 7)) {
		          GameCode.getTextInterface().println("AS SOON AS THE HITCHIKER GETS IN YOUR CAR HE STARTS TALKING ABOUT A ISLAND THAT COULD BE YOURS FOR ONLY A SMALL AMOUNT OF MONEY A MONTH");
		          GameCode.getTextInterface().println("HE DESCRIBES IT FOR A LONG TIME IT SEEMS TO BE ALL HE WANTS TO TALK ABOUT YOU TRY TO CHANGE THE TOPIC BUT HE WONT ALLOW YOU TOO");
		          GameCode.getTextInterface().println("EVENTUALLY HE TELLS YOU HE IS TESTING OUT A NEW MARKETING TECHNICE AND WONT GET OUT OF YOUR CAR UNTIL YOU BUY ONE YOU EVENTUALLY");
		          GameCode.getTextInterface().println("YOU YEILD AND BUY A TIMESHARE (SOMETHING GOOD MIGHT HAPPEN IF YOU BEAT THE GAME WITHOUT TURRNING IT OFF FROM NOW ON)");
		          GameCode.getTextInterface().println(" ");
		          GameCode.getDataManager().hasTimeShare = true;
		          this.playSoundEffect(6.0F, "soundEffects/buy BUY BUY!.wav");
		          GameCode.getTextInterface().selected = "unimportant";
		          GameCode.getTextInterface().println("THANK GOD FOR ISLANDS AND THE EISENHOWER HIGHWAY SYSTEM");
		          GameCode.getTextInterface().println(" ");
		          if (GameCode.getDataManager().money >= 800) {
		            GameCode.getTextInterface().println("PAY 800 DOLLARS");
		            GameCode.getDataManager().money -= 800;
		            GameCode.getTextInterface().query(new String[] { "GET BACK ON THE ROAD" });
		          } else {
		            GameCode.getTextInterface().println("YOU CAN'T AFFORD IT BUT THE GUY IS NICE AND DECIDEDS TO GIVE IT TO YOU FOR JUST ALL THE MONEY YOU HAVE");
		            GameCode.getDataManager().money = 0;
		            GameCode.getTextInterface().query(new String[] { "GET BACK ON THE ROAD" });
		          }
		        }
		      }
		      
		      if (GameCode.getTextInterface().selected.equals("DRIVE DRIVE DRIVE !!!!")) {
		        GameCode.getTextInterface().selected = "unimportant";
		        GameCode.getTextInterface().println("YOU DECIDE NOT TO PICK UP SOME RANDOM STRANGER YOU DON'T KNOW PROBABLY A SMART CHOCE");
		        GameCode.getTextInterface().println(" ");
		        GameCode.getTextInterface().query(new String[] { "GET BACK ON THE ROAD" });
		      }
		if (this.checkSelected("GET BACK ON THE ROAD")) {
			GameCode.setCurrentEvent(GameCode.getDataManager().getComunityDrive());
		}
	}
	 @Override
	 public int getProbablity() {
			int probablity = 4;
			return probablity;
	 }
}
