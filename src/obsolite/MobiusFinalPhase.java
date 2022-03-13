package obsolite;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import location.Location;
import main.GameCode;
import main.MainLoop;
import main.thingy;
import resources.DataManager;

public class MobiusFinalPhase extends Location {
	/** 
	 * uses the original constructer
	 */
	int timer = 0;
	int eventRandom;
	Random RNG = new Random ();
	boolean survived = false;
	boolean alive = true;
	int amountOfTimesPushed;
	int pushCounter2;
	public MobiusFinalPhase () {
		super(true);
	}
	@Override
	public void eventStart() {
		
	}
	 
	public void runEventCode () {
	super.runEventCode();
	if (alive) {
		timer += 1;
	}
      if (timer == 60) {
        GameCode.getTextInterface().println("...");
      }
      if (timer == 90) {
        GameCode.getTextInterface().println("...");
      }
      if (timer == 120) {
        eventRandom = (RNG.nextInt(299) + 1);
        if (eventRandom < 101) {
          GameCode.getTextInterface().println("NOTHING");
          survived = true;
        }
        if ((eventRandom > 100) && (eventRandom < 201)) {
          GameCode.getTextInterface().println("QUICK PRESS CONTROL");
        }
        if (eventRandom > 200) {
          GameCode.getTextInterface().println("QUICK MASH CONTROL");
        }
      }
      if ((timer < 150) && (timer > 120) && (eventRandom > 101) && (eventRandom < 201) && (MainLoop.getWindow().keyPressed(17))) {
        GameCode.getTextInterface().println("A ROCK FELL BUT YOU HEARD IT AND WERE ABLE TO DODGE IT");
        survived = true;
      }
      if ((timer == 151) && (!survived) && (eventRandom > 101) && (eventRandom < 201)) {
        GameCode.getTextInterface().println("A ROCK APPEARED OUT OF NOWHERE AND YOU WHERE SQUISHED TO DEATH");
        alive = false;
        GameCode.getTextInterface().query(new String[] { "DON'T GIVE UP" });
      }
      if ((timer == 152) && (survived) && (eventRandom < 201)) {
        survived = false;
      }
      if ((timer < 180) && (timer > 120) && (eventRandom > 200) && (MainLoop.getWindow().keyPressed(17))) {
        amountOfTimesPushed += 1;
      }
      if ((amountOfTimesPushed >= 7) && (!survived)) {
        survived = true;
        GameCode.getTextInterface().println("A ROCK APPEARED AND CHASED YOU THROUGH THE CORRIDOR BUT YOU ESCAPED");
      }
      if ((timer == 181) && (!survived) && (eventRandom > 200)) {
        GameCode.getTextInterface().println("A ROCK APPEARED OUT OF NOWHERE YOU TRIED TO RUN BUT COULDEN'T GO FAST ENOUGH AND GOT SQUISHED");
        alive = false;
        GameCode.getTextInterface().query(new String[] { "DON'T GIVE UP" });
      }
      if ((timer == 182) && (survived) && (eventRandom > 200)) {
        survived = false;
        amountOfTimesPushed = 0;
      }
      if (timer == 210) {
        eventRandom = (RNG.nextInt(299) + 1);
        if (eventRandom < 101) {
          GameCode.getTextInterface().println("NOTHING");
          survived = true;
        }
        if ((eventRandom > 100) && (eventRandom < 201)) {
          GameCode.getTextInterface().println("QUICK PRESS CONTROL");
        }
        if (eventRandom > 200) {
          GameCode.getTextInterface().println("QUICK MASH CONTROL");
        }
      }
      if ((timer < 240) && (timer > 210) && (eventRandom > 101) && (eventRandom < 201) && (MainLoop.getWindow().keyPressed(17))) {
        GameCode.getTextInterface().println("A VOID APPEARED AND SHOT A LAZER BUT YOU DID A DODGE ROLL");
        survived = true;
      }
      if ((timer == 241) && (!survived) && (eventRandom > 101) && (eventRandom < 201)) {
        GameCode.getTextInterface().println("A LAZER APPEARED FROM NOWHERE AND YOU WHERE DESTROYED IN LESS THAN A SECOND");
        alive = false;
        GameCode.getTextInterface().query(new String[] { "DON'T GIVE UP" });
      }
      if ((timer == 242) && (survived) && (eventRandom < 201)) {
        survived = false;
      }
      if ((timer < 270) && (timer > 210) && (eventRandom > 200) && (MainLoop.getWindow().keyPressed(17))) {
        amountOfTimesPushed += 1;
      }
      if ((amountOfTimesPushed >= 7) && (!survived)) {
        survived = true;
        GameCode.getTextInterface().println("A LAZER STARTS FALLOWING YOU BUT YOU RUN PAST THE VOID THAT IS SHOTING IT SO IT CAN'T HIT YOU");
      }
      if ((timer == 271) && (!survived) && (eventRandom > 200)) {
        GameCode.getTextInterface().println("A LAZER SHOWS UP AND YOU TRY TO RUN BUT IT VAPORIZES YOU BEFORE YOU CAN GET AWAY");
        alive = false;
        GameCode.getTextInterface().query(new String[] { "DON'T GIVE UP"});
      }
      if ((timer == 272) && (survived) && (eventRandom > 200)) {
        survived = false;
        amountOfTimesPushed = 0;
      }
      
      if (timer == 300) {
        GameCode.getTextInterface().println("...");
      }
      if (timer == 330) {
        GameCode.getTextInterface().println("...");
      }
      if (timer == 360) {
        GameCode.getTextInterface().println("...");
      }
      if (timer == 390) {
        eventRandom = (RNG.nextInt(299) + 1);
        if (eventRandom < 101) {
          GameCode.getTextInterface().println("NOTHING");
          survived = true;
        }
        if ((eventRandom > 100) && (eventRandom < 201)) {
          GameCode.getTextInterface().println("QUICK PRESS CONTROL");
        }
        if (eventRandom > 200) {
          GameCode.getTextInterface().println("QUICK MASH CONTROL");
        }
      }
      if ((timer < 420) && (timer > 390) && (eventRandom > 101) && (eventRandom < 201) && (MainLoop.getWindow().keyPressed(17))) {
        GameCode.getTextInterface().println("A BUNCH OF SHADOW PUNCHES APPEAR LUCKLY YOU WERE ABLE TO BLOCK THEM ALL WITHOUT BEING DAMAGED");
        survived = true;
      }
      if ((timer == 421) && (!survived) && (eventRandom > 101) && (eventRandom < 201)) {
        GameCode.getTextInterface().println("YOU WERE BEAT UP BY A BUNCH OF SHADOW PUNCHES THEN COLAPSED AND DIED OF EXASTION SOME TIME LATER");
        alive = false;
        GameCode.getTextInterface().query(new String[] { "DON'T GIVE UP" });
      }
      if ((timer == 422) && (survived) && (eventRandom < 201)) {
        survived = false;
      }
      if ((timer < 450) && (timer > 390) && (eventRandom > 200) && (MainLoop.getWindow().keyPressed(17))) {
        amountOfTimesPushed += 1;
      }
      if ((amountOfTimesPushed >= 7) && (!survived)) {
        survived = true;
        GameCode.getTextInterface().println("A BUNCH OF SHADOW PUNCHES APPEAR BUT YOU MEET EACH ONE WITH A PUNCH THAT WAS TWICE AS POWERFUL");

        this.playSoundEffect(6.0F, "soundEffects/punch.wav");
      }
      if ((timer == 451) && (!survived) && (eventRandom > 200)) {
        GameCode.getTextInterface().println("A BUNCH OF SHADOW PUNCHES APPEAR AND YOU TRY TO PUNCH BACK BUT THEY WERE MORE POWERFUL");

        this.playSoundEffect(6.0F, "soundEffects/punch.wav");
        alive = false;
        GameCode.getTextInterface().query(new String[] { "DON'T GIVE UP" });
      }
      if ((timer == 452) && (survived) && (eventRandom > 200)) {
        survived = false;
        amountOfTimesPushed = 0;
      }
      if (timer == 480) {
        GameCode.getTextInterface().println("...");
      }
      if (timer == 510) {
        eventRandom = (RNG.nextInt(199) + 101);
        if ((eventRandom > 100) && (eventRandom < 201)) {
          GameCode.getTextInterface().println("QUICK PRESS CONTROL");
        }
        if (eventRandom > 200) {
          GameCode.getTextInterface().println("QUICK MASH CONTROL");
        }
      }
      if ((timer < 540) && (timer > 510) && (eventRandom > 101) && (eventRandom < 201) && (MainLoop.getWindow().keyPressed(17))) {
        GameCode.getTextInterface().println("YOU REACH THE MOBIUS CORE AND ITS LAST DITCH EFFORT IS TO SHOOT OUT A DEADLY NEEDLE BUT YOU DODGE TO THE RIGHT IT IS DEFENCELESS");
        GameCode.getTextInterface().println(" ");
        GameCode.getTextInterface().query(new String[] { "DESTROY IT" });
        survived = true;
      }
      if ((timer == 541) && (!survived) && (eventRandom > 101) && (eventRandom < 201)) {
        GameCode.getTextInterface().println("YOU REACHED THE MOBIUS CORE BUT IT SHOT OUT A DEADLY SPIKE AS A LAST DITCH EFFORT AND YOU WERE IMPALED");
        alive = false;
        GameCode.getTextInterface().query(new String[] { "DON'T GIVE UP" });
      }
      if ((timer == 542) && (survived) && (eventRandom < 201)) {
        survived = false;
      }
      if ((timer < 570) && (timer > 510) && (eventRandom > 200) && (MainLoop.getWindow().keyPressed(17))) {
        amountOfTimesPushed += 1;
      }
      if ((amountOfTimesPushed >= 7) && (!survived)) {
        survived = true;
        GameCode.getTextInterface().println("YOU REACHED THE MOBIUS CORE BUT AS A LAST DITCH EFFORT IT TURNS INTO A SPIKE BALL AND BOUNCES AROUND BUT YOU PREDICTED ITS TREDECTRARY AND DODGED");
        GameCode.getTextInterface().println("IT IS DEFENCELESS NOW");
        GameCode.getTextInterface().println(" ");
        GameCode.getTextInterface().query(new String[] { "DESTROY IT" });
      }
      if ((timer == 571) && (!survived) && (eventRandom > 200)) {
        GameCode.getTextInterface().println("YOU MADE IT ALL THE WAY TO THE MOBIUS CORE BUT AS A LAST DITCH EFFORT IT TURNS INTO A SPIKE BALL AND ROLLS OVER YOU");
        alive = false;
        GameCode.getTextInterface().query(new String[] { "DON'T GIVE UP" });
      }
      if ((timer == 572) && (survived) && (eventRandom > 200)) {
        survived = false;
        amountOfTimesPushed = 0;
      }
      if (GameCode.getTextInterface().selected.equals("DESTROY IT")) {
        GameCode.getTextInterface().selected = "not important";
        GameCode.getTextInterface().println("FOR NEW YORK");
        GameCode.getTextInterface().println("YOU PUNCH THE CORE IT IS SHAKEING");

        this.playSoundEffect(6.0F, "soundEffects/punch.wav");
        GameCode.getTextInterface().println(" ");
        GameCode.getTextInterface().query(new String[] { "AGAIN" });
      }
      if (GameCode.getTextInterface().selected.equals("AGAIN")) {
        GameCode.getTextInterface().selected = "not important";
        GameCode.getTextInterface().println("FOR THOSE WHO FOUGHT WITH ME");
        GameCode.getTextInterface().println("YOU PUNCH THE CORE IT IS BLUDGENED");

        this.playSoundEffect(6.0F, "soundEffects/punch.wav");
        GameCode.getTextInterface().println(" ");
        GameCode.getTextInterface().query(new String[] { "PUNCH" });
      }
      if (GameCode.getTextInterface().selected.equals("PUNCH")) {
        GameCode.getTextInterface().selected = "not important";
        GameCode.getTextInterface().println("FOR MYSELF");
        GameCode.getTextInterface().println("YOU PUNCH THE CORE IT CAN'T TAKE MUCH MORE");

        this.playSoundEffect(6.0F, "soundEffects/punch.wav");
        GameCode.getTextInterface().println(" ");
        GameCode.getTextInterface().query(new String[] { "FINSH IT OFF" });
      }
      if (GameCode.getTextInterface().selected.equals("FINSH IT OFF")) {
        GameCode.getTextInterface().selected = "not important";
        GameCode.getTextInterface().println("AND FINALLY ... FOR AUTOMOBIELS AND THE EISENHOWER HYWAY SYSTEM");

        this.playSoundEffect(6.0F, "soundEffects/punch.wav");
        GameCode.getTextInterface().println("YOU PUNCH AND THE CORE STARTS TO FIZZLE AWAY FOR A SECOND BUT THEN IT BEGINS IMPLODING (AFTER YOU CLICK GET OUTTA HERE BEGIN MASHING CONTROL)");
        GameCode.getTextInterface().println(" ");
        GameCode.getTextInterface().query(new String[] { "GET OUTTA HERE" });
      }
      if (GameCode.getTextInterface().selected.equals("GET OUTTA HERE")) {
        timer = 400000;
        GameCode.getTextInterface().selected = "not important";
        survived = true;
        eventRandom = 420;
        pushCounter2 = 0;
      }
      if ((timer < 400580) && (timer > 400001) && (MainLoop.getWindow().keyPressed(17))) {
        pushCounter2 += 1;
      }
      if ((pushCounter2 >= 67)) {
        survived = true;
        GameCode.getTextInterface().println("YOU ESCAPED THE DARK CORRIDOR AND RETURNED TO FIND THE BARRIER DISABLED SO YOU RAN OUT OF THE CAVE AND AUTMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM IMPLODED");
        GameCode.getTextInterface().println("THE ROADWAY WAS DESTROYED BY ITSELF, BUT MOBIUS WAS NEVER ABLE TO CAST HIS EVIL CURSE AND WITHIN A BIT OF TIME IT WAS REBUILT BUT THAT LEAVES THE BIG QUESTION");
        GameCode.getTextInterface().println(" ");
        thingy.userStats.setAchievement("gaurdian of automobiels and the eisenhower hiway system_1_6");
        this.changeMusic("music/tital theme.wav", DataManager.getVolume());
        GameCode.getTextInterface().query(new String[] { "WHERE ARE THEY NOW" });
      }
      if ((timer == 400581) && (!survived)) {
        GameCode.getTextInterface().println("THE VOID COMEING FROM THE EMPLODING TRICKSTER SUCKS YOU IN AND YOU IMPLODE ALONG WITH HIM");
        GameCode.getTextInterface().query(new String[] { "DON'T GIVE UP" });
      }
      if (GameCode.getTextInterface().selected.equals("WHERE ARE THEY NOW")) {
        GameCode.getTextInterface().selected = "not important";
        GameCode.getTextInterface().println("USELESS RALTZ RETURNED TO HER TRAINERS SIDE AND THEY BEAT ALL THE DELUX TRAINERS YEAH ... NOT SURE HOW THAT HAPPENED");
        GameCode.getTextInterface().println(" ");
        GameCode.getTextInterface().query(new String[] { "NEAT" });
      }
      if (GameCode.getTextInterface().selected.equals("NEAT")) {
        GameCode.getTextInterface().selected = "not important";
        GameCode.getTextInterface().println("FELEPE MOVED TO EARTH AND BECAME AN INTERIOR DESIGNER JUST AS HE ALLWAYS WANTED TOO ");
        GameCode.getTextInterface().println(" ");
        GameCode.getTextInterface().query(new String[] { "COOL" });
      }
      if (GameCode.getTextInterface().selected.equals("COOL")) {
        GameCode.getTextInterface().selected = "not important";
        GameCode.getTextInterface().println("THE BANDITS CHANGED THIER WAYS AND STARTED A ROCK BAND CALLED THE BANDITS IT WAS MILDLY SUCCESFUL");
        GameCode.getTextInterface().println(" ");
        GameCode.getTextInterface().query(new String[] { "WICKED" });
      }
      if (GameCode.getTextInterface().selected.equals("WICKED")) {
        GameCode.getTextInterface().selected = "not important";
        GameCode.getTextInterface().println("THE MECHANIC BECAME A PROFESIONAL RACECAR DRIVER THE AUDIENCE CONSIDERS HIM A NUTJOB BECAUSE HE KEEPS GOING ON ABOUT A 400 STORY TITAN HE DEFEATED");
        GameCode.getTextInterface().println(" ");
        GameCode.getTextInterface().query(new String[] { "TOTES REDIC" });
      }
      if (GameCode.getTextInterface().selected.equals("TOTES REDIC")) {
        GameCode.getTextInterface().selected = "not important";
        GameCode.getTextInterface().println("THE BASEBALL PLAYER CHANGED HIS NAME TO SKIP AND STARTED A BASEBALL TEAM NOT ONLY DID HE HELP DEFEATE AUTOMOBIELS AND THE EISENHOWER HIGHWAY SYSTEM BUT");
        GameCode.getTextInterface().println("HE ALSO STOPPED A GROUP OF ALLIANS FROM INVADING THE PLANET BY DEFEATING THEM IN A BASEBALL GAME");
        GameCode.getTextInterface().println(" ");
        GameCode.getTextInterface().query(new String[] { "THAT DOESEN'T EVEN MAKE SENCE" });
      }
      if (GameCode.getTextInterface().selected.equals("THAT DOESEN'T EVEN MAKE SENCE")) {
        GameCode.getTextInterface().selected = "not important";
        if (MobiusChase.hasButterflys) {
          GameCode.getTextInterface().println("THE CREEPY BUTTERFLYS COUNTINUED TO BREED AND ENDED UP OVERRUNNING PLANET EARTH BUT YOU KNOW ... WHATEVER");
        }
        GameCode.getTextInterface().println(" ");
        GameCode.getTextInterface().println("AND AS FOR YOU ... YOU DECIDED TO GIVE UP FARMING TO BECOME A TRUCK DRIVER AND GET IN ON MORE OF THAT EISENHOWER HIGHWAY SYSTEM ACTION");
        GameCode.getTextInterface().println("AND THAT SHOULD BE EVERYTHING ... BUT ITS NOT I ACCUALLY WANT TO SAY ONE MORE THING");
        GameCode.getTextInterface().println(" ");
        GameCode.getTextInterface().query(new String[] { "AND WHATS THAT" });
      }
      if (GameCode.getTextInterface().selected.equals("AND WHATS THAT")) {
        GameCode.getTextInterface().selected = "not important";

        this.playSoundEffect(6.0F, "soundEffects/thankayousomuch.wav");
        GameCode.getTextInterface().println("THANK YOU SO MUCH FOR PLAYING,");
        GameCode.getTextInterface().println("AND                          I");
        GameCode.getTextInterface().println("MEAN                      THAT");
        GameCode.getTextInterface().println("IT                      REALLY");
        GameCode.getTextInterface().println("DOES                      MEAN");
        GameCode.getTextInterface().println("A                          LOT");
        GameCode.getTextInterface().println("TO ME THAT SOMEBODY LIKED THIS GAME SO MUCH TO GET THIS FAR");
        GameCode.getTextInterface().println("                                LIKE      GOD       AND");
        GameCode.getTextInterface().println("                                  SERIOSLY    IS        THE");
        GameCode.getTextInterface().println("                                   THANK       THANKING  EISNHOWER");
        GameCode.getTextInterface().println("                                    YOU         YOU       HIGHWAY");
        GameCode.getTextInterface().println("                                     AND         FOR       SYSTEM");
        GameCode.getTextInterface().println("                                      SOMEWHERE   AUTOMOBIELS");
        GameCode.getTextInterface().println(" ");
        GameCode.getTextInterface().println("PS YOU SHOULD CHECK OUT THE FUN FACTS THERE MAY OR MAY NOT BE NEW STUFF THERE NOW");
        GameCode.getTextInterface().println(" ");
        try {
        	File fakeFile = new File ("./SavesDir");
            File realFile = new File (fakeFile, "Fun Facts.txt");
            FileWriter fw = new FileWriter (realFile);
            PrintWriter pw = new PrintWriter (fw);
            pw.println("true");
            pw.close();
        }
        catch (IOException localIOException9) {}
        GameCode.getTextInterface().query(new String[] { "THE END!!!!!!!!!!!!!!!!!!" });
      }
    if (GameCode.getTextInterface().selected.equals("THE END!!!!!!!!!!!!!!!!!!!")) {
      DataManager.inzialize();
    }
    if (GameCode.getTextInterface().selected.equals("DON'T GIVE UP")) {
      alive = true;
      timer = 0;
      GameCode.getTextInterface().selected = "not important";
    	}
	}
}
