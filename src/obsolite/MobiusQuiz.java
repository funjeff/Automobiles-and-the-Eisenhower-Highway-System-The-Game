package obsolite;

import java.util.Random;

import location.Location;
import main.GameCode;
import resources.DataManager;

public class MobiusQuiz extends Location {
	 int eventRandom;
	 MobiusChase parent;
	/** 
	 * uses the original constructer
	 */
	public MobiusQuiz (MobiusChase parent) {
		super(true);
		this.parent = parent;
	}
	
	 
	@Override
	public void eventStart() {
		Random RNG = new Random ();
		 eventRandom = (RNG.nextInt(4) + 1);
         String question = "THIS MESSAGE SHOULD NOT APPEAR PLEASE REPORT THIS BUG TO JEFFREY MARSH AT JEFFREY MARSH INDUSTRYS (CHOSE BLUE)";
         if (eventRandom == 1) {
           question = "HOW MUCH DID THE GRAIN BUYER BUY YOUR GRAIN FOR? YELLOW FOR 10 GREEN FOR 15 AND BLUE FOR 20";
         }
         if (eventRandom == 2) {
           question = "HOW GRAIN DID THE NUKE DESTROY (IF YOU WENT THROUGH)? YELLOW FOR 20 GREEN FOR 35 AND BLUE FOR 50";
         }
         if (eventRandom == 3) {
           question = "WHAT CODE ALLOWS YOU TO ENTER HARD MODE? YELLOW FOR NICE GREEN FOR SUPER OR BLUE FOR HARD";
         }
         if (eventRandom == 4) {
           question = "HOW MUCH DO HOTELS COST? YELLOW FOR 80 GREEN FOR 120 OR BLUE FOR 200";
         }
         if (eventRandom == 5) {
           question = "WHICH EVENT YEILDS $900? YELLOW FOR HOMELESS GREEN FOR EXPERMENTS OR BLUE FOR GHOST WRIGHTING";
         }
         GameCode.getTextInterface().println("AS YOUR ARE SPEEDING THROUGH SPACE YOU SEE THREE WORMHOLES ONE GREEN ONE BLUE AND ONE YELLOW A SIGN APPEARS");
         GameCode.getTextInterface().println("THE SIGN READS " + question);
         GameCode.getTextInterface().println("DONT QUESTION HOW YOU CAN READ THE SIGN MOVING SO FAST IT TOTALLY MAKES SENSE OR SOMETHING");
         GameCode.getTextInterface().println(" ");
         GameCode.getTextInterface().query(new String[] { "BLUE WORMHOLE", "YELLOW WORMHOLE", "GREEN WORMHOLE" });
         GameCode.getTextInterface().selected = "not important";
	}
	 
	public void runEventCode () {
	super.runEventCode();
    if (((GameCode.getTextInterface().selected.equals("BLUE WORMHOLE")) && ((eventRandom == 3) || (eventRandom == 5))) || ((GameCode.getTextInterface().selected.equals("YELLOW WORMHOLE")) && (eventRandom == 4)) || ((GameCode.getTextInterface().selected.equals("GREEN WORMHOLE")) && ((eventRandom == 1) || (eventRandom == 2)))) {
        if ((GameCode.getTextInterface().selected.equals("BLUE WORMHOLE")) && ((eventRandom == 3) || (eventRandom == 5))) {
          GameCode.getTextInterface().println("YOU WENT THROUGH THE BLUE WORMHOLE YOU APPEAR BACK INTO SPACE ON SOME SORT OF STAR ROAD YOU ASSUME YOU GOT THE QUESTION RIGHT");
          GameCode.getTextInterface().println("BUT THAT IS MOSTLY BECAUSE SOMETHING BAD PROBABLY WOULD OF HAPPEND OF YOU GOT IT WRONG AND NOTHING PARTICULARLY INTRISTING HAPPENED");
          GameCode.getTextInterface().println(" ");
          GameCode.getTextInterface().selected = "not important";
          GameCode.getTextInterface().query(new String[] { "RUN RUN RUN" });
        }
        if ((GameCode.getTextInterface().selected.equals("YELLOW WORMHOLE")) && (eventRandom == 4)) {
          GameCode.getTextInterface().println("YOU WENT THROUGH THE YELLOW WORMHOLE YOU APPEAR BACK INTO SPACE ON SOME SORT OF STAR ROAD YOU ASSUME YOU GOT THE QUESTION RIGHT");
          GameCode.getTextInterface().println("BUT THAT IS MOSTLY BECAUSE SOMETHING BAD PROBABLY WOULD OF HAPPEND OF YOU GOT IT WRONG AND NOTHING PARTICULARLY INTRISTING HAPPENED");
          GameCode.getTextInterface().println(" ");
          GameCode.getTextInterface().selected = "not important";
          GameCode.getTextInterface().query(new String[] { "RUN RUN RUN" });
        }
        if ((GameCode.getTextInterface().selected.equals("GREEN WORMHOLE")) && ((eventRandom == 1) || (eventRandom == 2))) {
          GameCode.getTextInterface().println("YOU WENT THROUGH THE GREEN WORMHOLE YOU APPEAR BACK INTO SPACE ON SOME SORT OF STAR ROAD YOU ASSUME YOU GOT THE QUESTION RIGHT");
          GameCode.getTextInterface().println("BUT THAT IS MOSTLY BECAUSE SOMETHING BAD PROBABLY WOULD OF HAPPEND OF YOU GOT IT WRONG AND NOTHING PARTICULARLY INTRISTING HAPPENED");
          GameCode.getTextInterface().println(" ");
          GameCode.getTextInterface().selected = "not important";
          GameCode.getTextInterface().query(new String[] { "RUN RUN RUN" });
        }
      }
      if (((!GameCode.getTextInterface().selected.equals("BLUE WORMHOLE")) || ((eventRandom != 3) && (eventRandom != 5))) && ((!GameCode.getTextInterface().selected.equals("YELLOW WORMHOLE")) || (eventRandom != 4)) && ((!GameCode.getTextInterface().selected.equals("GREEN WORMHOLE")) || ((eventRandom != 1) && (eventRandom != 2))) && ((GameCode.getTextInterface().selected.equals("GREEN WORMHOLE")) || (GameCode.getTextInterface().selected.equals("BLUE WORMHOLE")) || (GameCode.getTextInterface().selected.equals("YELLOW WORMHOLE")))) {
        GameCode.getTextInterface().println("YOU GO THOUGH THE WORMHOLE AND FIND THAT YOU GOT THE QUESTION WRONG AND YOUR BACK WHERE YOU WERE A WHILE AGO");
        GameCode.getTextInterface().println(" ");
        GameCode.getTextInterface().println("YOUR 12 LIGHT YEARS BACK MOBIUS DRAWS CLOSER");
        GameCode.getTextInterface().println(" ");
        GameCode.getDataManager().setMilesLeft( GameCode.getDataManager().getMilesLeft() + 12);
        parent.distanceFromMobius -= 3;
        GameCode.getTextInterface().selected = "not important";
        GameCode.getTextInterface().query(new String[] { "RUN RUN RUN" });
      }
	}
}
