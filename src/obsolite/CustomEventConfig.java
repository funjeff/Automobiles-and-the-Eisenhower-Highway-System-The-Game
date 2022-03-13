package obsolite;

import java.awt.event.KeyEvent;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import location.Location;
import main.GameCode;
import main.MainLoop;
import resources.DataManager;

public class CustomEventConfig extends Location {
	private static int iBasis; // if problems change this to a staic across the whole project
	private static int numberOfChoices = 420;
	private static int numberOfBranches = 420;
	private static int amountOfRemainingPercentage = 100;
    FileWriter mm;
    PrintWriter em;
	public CustomEventConfig() {
		super(false);
		
	}
	@Override
	public void runEventCode () {
		    if (this.checkSelected("ABOUT CUSTOM EVENTS")) {
		      this.setSelected("unimportant");
		      this.print("CUSTOM EVENTS ARE COOL BECASUE THEY LET YOU HAVE INPUT INTO WHAT HAPPENS IN THE GAME IF YOU MAKE A CUSTOM EVENT IT HAS A POSSIBILTY OF");
		      this.print("APPEARING IN THE GAME IM A LAZY DEVELOPER SO WHEN YOUR TYPEING IN YOUR INPUT THERE IS NO BACKSPACE HOWEVER IF YOU REALLY DO NEED TO EDIT");
		      this.print("ONE OF YOUR RESPONCES YOU CAN GO INTO THE GAME FILES AND FIND THAT EVENT AND CHANGE IT MANUALY ALSO USING THAT METHOD YOU CAN SHARE YOUR");
		      this.print("CUSTOM EVENTS WITH YOUR FREINDS (BY COPYING YOUR CUSTOM EVENTS TO YOUR FREINDS FOLDER BEING CARFUL TO PRESURVE THE SEQUENCIAL ORDER OF THE EVENTS");
		      this.print("YOU CAN ALSO TURN ON CUSTOM EVENT ONLY MODE TO MAKE YOUR OWN SORT OF TEXT ADVENTURE GAME IF YOU WANT TO DELETE A CUSTOM EVENT DON'T DELETE THE FILE");
		      this.print("IF YOU DO THAT ALL CUSTOM EVENTS WITH A HIGHER NUMBER THAN THAT ONE WONT WORK INSTEAD GO INTO THE FILE OF THE EVENT YOU WANT TO DELETE AND DELETE ALL");
		      this.print("THE TEXT THAT IS THERE AND WRIGHT A 0 ON THE SECOND LINE ALRIGHT HAVE FUN WITH CUSTOM EVENTS!!!!!!");
		      this.setSelected("unimportant");
		      this.print(" ");
		      this.query(new String[] { "START GAME", "RULES", "OPTIONS", "ADVANCED CALCULUS" });
		    }
		    if (this.checkSelected("ENABLE/DISABLE CUSTOM EVENTS")) {
		      this.setSelected("unimportant");
		      this.print(" ");
		      this.query(new String[] { "TURN CUSTOM EVENTS ON/OFF", "TURN ON/OFF CUSTOM EVENT ONLY MODE" });
		    }
		    if (this.checkSelected("TURN CUSTOM EVENTS ON/OFF")) {
		      if (DataManager.customEventsEnabled()) {
		        this.setSelected("uniportant");
		        DataManager.setCustomEventsEnabled(false);
		        this.print(" ");
		        this.print("CUSTOM EVENTS WERE TURNED OFF");
		        this.print(" ");
		        this.query(new String[] { "START GAME", "RULES", "OPTIONS", "ADVANCED CALCULUS" });
		      } else {
		        this.setSelected("unimportant");
		        DataManager.setCustomEventsEnabled(true);
		        this.print(" ");
		        this.print("CUSTOM EVENTS WERE TURNED ON");
		        this.print(" ");
		        this.query(new String[] { "START GAME", "RULES", "OPTIONS", "ADVANCED CALCULUS" });
		      }
		    }
		    if (this.checkSelected("TURN ON/OFF CUSTOM EVENT ONLY MODE")) {
		      if (DataManager.regularEventsEnabled()) {
		        this.setSelected("unimportant");
		        DataManager.setRegularEventsEnabled(false);
		        this.print(" ");
		        this.print("YOU NOW WILL ONLY RUN INTO CUSTOM EVENTS (YOU WILL STILL HAVE TO STOP AT GAS STATIONS AND HOTELS)");
		        this.print(" ");
		        this.query(new String[] { "START GAME", "RULES", "OPTIONS", "ADVANCED CALCULUS" });
		      } else {
		        this.setSelected("unimportant");
		        DataManager.setRegularEventsEnabled(true);
		        this.print(" ");
		        this.print("REGULAR EVENTS WERE TURRNED BACK ON");
		        this.print(" ");
		        this.query(new String[] { "START GAME", "RULES", "OPTIONS", "ADVANCED CALCULUS" });
		      }
		    }
		    if (this.checkSelected("NEW CUSTOM EVENTS")) {
		      boolean dontType = false;
		      if (DataManager.justStarted()) {
		        while (DataManager.noError()) {
		        DataManager.setFileNumber(DataManager.fileNumber() + 1);
		          try {
		            FileReader fr = new FileReader("./custom Events/Custom Event " + Integer.toString(DataManager.fileNumber()) + ".txt");
		            fr.close();
		          } catch (IOException e) {
		            DataManager.setnoError(false);
		          }
		        }
		        try {
		        	mm = new FileWriter("./custom Events/Custom Event " + Integer.toString(DataManager.fileNumber()) + ".txt");
		        	em = new PrintWriter(mm);
		        }
		        catch (IOException localIOException2) {}
		        this.print(" ");
		        this.print(" ");
		        this.print("PLEASE TYPE IN THE MESSAGE YOU WANT THE GAME TO DISPLAY (PRESS SHIFT TO START OVER)");
		        DataManager.setJustStarted(false);
		        this.print(" ");
		      }
		      int charictarNumber = 1;
		      int i = MainLoop.getWindow().KeysPressed()[0];
		      if ((i == 10) && (DataManager.isSkipedEnter()) && (DataManager.getCode() != "")) {
		        em.println(DataManager.getCode2() + DataManager.getCode());
		        DataManager.setCode("");
		        DataManager.setCode2("");
		        DataManager.setJustStarted(true);
		        this.setSelected("next thing");
		      }
		      this.renderAtAPlace(0, 464, new String[] { DataManager.getCode() }, DataManager.getSprites().yellowfont);
		      if (DataManager.getCode().length() > 79) {
		        DataManager.setCode2(DataManager.getCode2() + DataManager.getCode());
		        DataManager.setCode("");
		      }
		      
		      if ((i == 10) || (MainLoop.getWindow().keyPressed(16)) || (MainLoop.getWindow().keyPressed(8))) {
		        dontType = true;
		      }
		      if (MainLoop.getWindow().keyPressed(8) && (DataManager.getCode().length() > 1)) {
		    	  DataManager.setCode(DataManager.getCode().substring(0, DataManager.getCode().length() - 1));
		      }
		      if (MainLoop.getWindow().keyPressed(16)) {
		        GameCode.getTextInterface().println("");
		        DataManager.setCode2(DataManager.getCode2() + DataManager.getCode());
		        DataManager.setCode("");
		      }
		      if (MainLoop.getWindow().keyReleased(iBasis)) {
		        iBasis = 0;
		      }
		      if ((iBasis != i) && (i != 0)) {
		        iBasis = i;
		        char a = (char)i;
		        String typedCharictar = Character.toString(a);
		        while (MainLoop.getWindow().KeysPressed()[charictarNumber] != 0) {
		          i = MainLoop.getWindow().KeysPressed()[charictarNumber];
		          a = (char)i;
		          typedCharictar = typedCharictar + a;
		          charictarNumber++;
		        }
		        if (dontType) {
		          DataManager.setSkipedEnter(true);
		        }
		        if (!dontType) {
		          DataManager.setCode(DataManager.getCode() + typedCharictar);
		        }
		      }
		    }
		    if (GameCode.getTextInterface().selected.equals("next thing")) {
		      boolean dontType = false;
		      if (DataManager.justStarted()) {
		        GameCode.getTextInterface().println(" ");
		        GameCode.getTextInterface().println("HOW OFFEN DOES THIS EVENT OCCUR (THE NUMBER YOU TYPE IS THE CHANCE OUT OF 10000 THAT YOU WILL GET THIS EVENT EVERY MILE)");
		        GameCode.getTextInterface().println("(TO GIVE YOU SOME REFRENCE THE HIGHEST PROBABILITY EVENT IN THE GAME IS A TOLL BOOTH AT 30 AND THE LOWEST IS POTHOLE AT 2)");
		        GameCode.getTextInterface().println(" ");
		        DataManager.setJustStarted(false);
		        GameCode.getTextInterface().println(" ");
		      }
		      int charictarNumber = 1;
		      int i = MainLoop.getWindow().KeysPressed()[0];
		      if ((i == 10) && (DataManager.isSkipedEnter()) && (DataManager.getCode() != "")) {
		        GameCode.getTextInterface().println(" ");
		        em.println(DataManager.getCode2() + DataManager.getCode());
		        DataManager.setCode("");
		        DataManager.setCode2("");
		        DataManager.setSkipedEnter(false);
		        DataManager.setJustStarted(true);
		        GameCode.getTextInterface().println(" ");
		        GameCode.getTextInterface().selected = "choices";
		      }
		      if ((i == 10) || ( MainLoop.getWindow().keyPressed(16)) || ( MainLoop.getWindow().keyPressed(8))) {
		        dontType = true;
		      }
		      if (( MainLoop.getWindow().keyPressed(8)) && (DataManager.getCode().length() > 1)) {
		        DataManager.setCode(DataManager.getCode().substring(0, DataManager.getCode().length() - 1));
		      }
		      if ( MainLoop.getWindow().keyPressed(16)) {
		        GameCode.getTextInterface().println("");
		        DataManager.setCode("");
		      }
		      GameCode.getTextInterface().renderAtAPlace(0, 464, new String[] { DataManager.getCode()}, DataManager.getSprites().yellowfont);
		      if (DataManager.getCode().length() > 79) {
		        DataManager.setCode2(DataManager.getCode2() + DataManager.getCode());
		        DataManager.setCode("");
		      }
		      
		      if (i == 10) {
		        dontType = true;
		      }
		      if (MainLoop.getWindow().keyReleased(iBasis)) {
		        iBasis = 0;
		      }
		      if ((iBasis != i) && (i != 0)) {
		        iBasis = i;
		        char a = (char)i;
		        if (((KeyEvent.getExtendedKeyCodeForChar(a) > 47) && (KeyEvent.getExtendedKeyCodeForChar(a) < 58)) || (KeyEvent.getExtendedKeyCodeForChar(a) == 10) || (KeyEvent.getExtendedKeyCodeForChar(a) == 46)) {
		          String typedCharictar = Character.toString(a);
		          while (MainLoop.getWindow().KeysPressed()[charictarNumber] != 0) {
		            i = MainLoop.getWindow().KeysPressed()[charictarNumber];
		            a = (char)i;
		            typedCharictar = typedCharictar + a;
		            charictarNumber++;
		          }
		          if (dontType) {
		        	  DataManager.setSkipedEnter(true);
		          }
		          if (!dontType) {
		        	  DataManager.setCode(DataManager.getCode() + typedCharictar);
		          }
		        }
		      }
		    }
		    if (GameCode.getTextInterface().selected.equals("choices")) {
		      GameCode.getTextInterface().selected = "unimportant";
		      GameCode.getTextInterface().println("HOW MANY CHOICES ARE IN THIS EVENT");
		      GameCode.getTextInterface().query(new String[] { "1 CHOICE", "2 CHOICES", "3 CHOICES", "4 CHOICES", "5 CHOICES" });
		    }
		    if (GameCode.getTextInterface().selected.equals("1 CHOICE")) {
		      em.println("1");
		      numberOfChoices = 1;
		      GameCode.getTextInterface().selected = "what a neat thing";
		    }
		    if (GameCode.getTextInterface().selected.equals("2 CHOICES")) {
		      em.println("2");
		      numberOfChoices = 2;
		      GameCode.getTextInterface().selected = "what a neat thing";
		    }
		    if (GameCode.getTextInterface().selected.equals("3 CHOICES")) {
		      em.println("3");
		      numberOfChoices = 3;
		      GameCode.getTextInterface().selected = "what a neat thing";
		    }
		    if (GameCode.getTextInterface().selected.equals("4 CHOICES")) {
		      em.println("4");
		      numberOfChoices = 4;
		      GameCode.getTextInterface().selected = "what a neat thing";
		    }
		    if (GameCode.getTextInterface().selected.equals("5 CHOICES")) {
		      em.println("5");
		      numberOfChoices = 5;
		      GameCode.getTextInterface().selected = "what a neat thing";
		    }
		    if (GameCode.getTextInterface().selected.equals("what a neat thing")) {
		      boolean dontType = false;
		      if (DataManager.justStarted()) {
		        em.println("option");
		        GameCode.getTextInterface().println(" ");
		        GameCode.getTextInterface().println(" ");
		        GameCode.getTextInterface().println("PLEASE TYPE IN THE TEXT OF THE OPTION YOU ARE CONFIGURING");
		        GameCode.getTextInterface().println(" ");
		        DataManager.setJustStarted(false);
		        GameCode.getTextInterface().println(" ");
		      }
		      int charictarNumber = 1;
		      int i = MainLoop.getWindow().KeysPressed()[0];
		      if ((i == 10) && (DataManager.isSkipedEnter()) && (DataManager.getCode() != "")) {
		        em.println(DataManager.getCode2() + DataManager.getCode());
		        DataManager.setCode("");
		        DataManager.setCode2("");
		        DataManager.setJustStarted(true);
		        GameCode.getTextInterface().selected = "possible brances";
		      }
		      if ((i == 10) || (MainLoop.getWindow().keyPressed(16)) || (MainLoop.getWindow().keyPressed(8))) {
		        dontType = true;
		      }
		      if ((MainLoop.getWindow().keyPressed(8)) && (DataManager.getCode().length() > 1)) {
		    	  DataManager.setCode(DataManager.getCode().substring(0, DataManager.getCode().length() - 1));
		      }
		      GameCode.getTextInterface().renderAtAPlace(0, 464, new String[] { DataManager.getCode() }, DataManager.getSprites().yellowfont);
		      if (DataManager.getCode().length() > 79) {
		    	  DataManager.setCode2(DataManager.getCode2() + DataManager.getCode());
		    	  DataManager.setCode("");
		      }
		      if (MainLoop.getWindow().keyPressed(16)) {
		        GameCode.getTextInterface().println("");
		        DataManager.setCode("");
		      }
		      if (MainLoop.getWindow().keyReleased(iBasis)) {
		        iBasis = 0;
		      }
		      if ((iBasis != i) && (i != 0)) {
		        iBasis = i;
		        char a = (char)i;
		        String typedCharictar = Character.toString(a);
		        while (MainLoop.getWindow().KeysPressed()[charictarNumber] != 0) {
		          i = MainLoop.getWindow().KeysPressed()[charictarNumber];
		          a = (char)i;
		          typedCharictar = typedCharictar + a;
		          charictarNumber++;
		        }
		        if (dontType) {
		        	DataManager.setSkipedEnter(true);
		        }
		        if (!dontType) {
		        	DataManager.setCode(DataManager.getCode() + typedCharictar);
		        }
		      }
		    }
		    
		    if (GameCode.getTextInterface().selected.equals("possible brances")) {
		      GameCode.getTextInterface().selected = "unimportant";
		      GameCode.getTextInterface().println("HOW MANY BRANCHES ARE THERE FOR THIS CHOICE");
		      GameCode.getTextInterface().query(new String[] { "1 BRANCH", "2 BRANCHES", "3 BRANCHES", "4 BRANCHES", "5 BRANCHES" });
		    }
		    if (GameCode.getTextInterface().selected.equals("1 BRANCH")) {
		      em.println("1");
		      numberOfBranches = 1;
		      GameCode.getTextInterface().selected = "ehehe sweet";
		    }
		    if (GameCode.getTextInterface().selected.equals("2 BRANCHES")) {
		      em.println("2");
		      numberOfBranches = 2;
		      GameCode.getTextInterface().selected = "ehehe sweet";
		    }
		    if (GameCode.getTextInterface().selected.equals("3 BRANCHES")) {
		      em.println("3");
		      numberOfBranches = 3;
		      GameCode.getTextInterface().selected = "ehehe sweet";
		    }
		    if (GameCode.getTextInterface().selected.equals("4 BRANCHES")) {
		      em.println("4");
		      numberOfBranches = 4;
		      GameCode.getTextInterface().selected = "ehehe sweet";
		    }
		    if (GameCode.getTextInterface().selected.equals("5 BRANCHES")) {
		      em.println("5");
		      numberOfBranches = 5;
		      GameCode.getTextInterface().selected = "ehehe sweet";
		    }
		    if (GameCode.getTextInterface().selected.equals("ehehe sweet")) {
		      boolean dontType = false;
		      if (DataManager.justStarted()) {
		        GameCode.getTextInterface().println(" ");
		        GameCode.getTextInterface().println(" ");
		        GameCode.getTextInterface().println("PLEASE TYPE IN THE TEXT THAT DISPLAYS WHEN THIS BRANCH POPS UP");
		        GameCode.getTextInterface().println(" ");
		        DataManager.setJustStarted(false);
		        GameCode.getTextInterface().println(" ");
		      }
		      int charictarNumber = 1;
		      int i = MainLoop.getWindow().KeysPressed()[0];
		      if ((i == 10) && (DataManager.isSkipedEnter()) && (DataManager.getCode() != "")) {
		        em.println("branch");
		        em.println(DataManager.getCode2() + DataManager.getCode());
		        DataManager.setCode("");
		        DataManager.setCode2("");
		        DataManager.setJustStarted(true);
		        if (numberOfBranches > 1) {
		          GameCode.getTextInterface().selected = "probability";
		        } else {
		          em.println(Integer.toString(amountOfRemainingPercentage));
		          GameCode.getTextInterface().selected = "consequence";
		          amountOfRemainingPercentage = 100;
		        }
		      }
		      if (MainLoop.getWindow().keyReleased(iBasis)) {
		        iBasis = 0;
		      }
		      if ((i == 10) || (MainLoop.getWindow().keyPressed(16)) || (MainLoop.getWindow().keyPressed(8))) {
		        dontType = true;
		      }
		      if ((MainLoop.getWindow().keyPressed(8)) && (DataManager.getCode().length() > 1)) {
		    	  DataManager.setCode(DataManager.getCode().substring(0, DataManager.getCode().length() - 1));
		      }
		      if (MainLoop.getWindow().keyPressed(16)) {
		        GameCode.getTextInterface().println("");
		        DataManager.setCode("");
		      }
		      GameCode.getTextInterface().renderAtAPlace(0, 464, new String[] { DataManager.getCode() }, DataManager.getSprites().yellowfont);
		      if (DataManager.getCode().length() > 79) {
		    	  DataManager.setCode2(DataManager.getCode2() + DataManager.getCode());
		    	  DataManager.setCode("");
		      }
		      if ((iBasis != i) && (i != 0)) {
		        iBasis = i;
		        char a = (char)i;
		        String typedCharictar = Character.toString(a);
		        while (MainLoop.getWindow().KeysPressed()[charictarNumber] != 0) {
		          i = MainLoop.getWindow().KeysPressed()[charictarNumber];
		          a = (char)i;
		          typedCharictar = typedCharictar + a;
		          charictarNumber++;
		        }
		        if (dontType) {
		        	DataManager.setSkipedEnter(true);
		        }
		        if (!dontType) {
		        	DataManager.setCode(DataManager.getCode() + typedCharictar);
		        }
		      }
		    }
		    
		    if (GameCode.getTextInterface().selected.equals("probability")) {
		      boolean dontType = false;
		      if (DataManager.justStarted()) {
		        GameCode.getTextInterface().println(" ");
		        GameCode.getTextInterface().println("HOW OFTEN (IN A PERCENTAGE) IS THIS BRANCH THE ONE THAT POPS UP");
		        GameCode.getTextInterface().println(" ");
		        GameCode.getTextInterface().println(" ");
		        DataManager.setJustStarted(false);
		        GameCode.getTextInterface().println(" ");
		      }
		      int charictarNumber = 1;
		      int i = MainLoop.getWindow().KeysPressed()[0];
		      if ((i == 10) && (DataManager.isSkipedEnter()) && (DataManager.getCode() != "")) {
		        GameCode.getTextInterface().println(" ");
		        if (Integer.parseInt(DataManager.getCode()) > amountOfRemainingPercentage) {
		          GameCode.getTextInterface().println("THE ADDITION OF THE PERCENT CHANCES IS GREATER THAN 100 PLEASE TRY AGAIN");
		          DataManager.setJustStarted(true);
		          DataManager.setSkipedEnter(false);
		          DataManager.setCode("");
		        } else {
		          em.println(DataManager.getCode());
		          amountOfRemainingPercentage -= Integer.parseInt(DataManager.getCode());
		          DataManager.setCode("");
		          DataManager.setSkipedEnter(false);
		          DataManager.setSkipedEnter(true);
		          GameCode.getTextInterface().selected = "consequence";
		        }
		      }
		      GameCode.getTextInterface().renderAtAPlace(0, 464, new String[] { DataManager.getCode() }, DataManager.getSprites().yellowfont);
		      if (DataManager.getCode().length() > 79) {
		    	  DataManager.setCode("");
		      }
		      if ((i == 10) || (MainLoop.getWindow().keyPressed(16)) || (MainLoop.getWindow().keyPressed(8))) {
		        dontType = true;
		      }
		      if ((MainLoop.getWindow().keyPressed(8)) && (DataManager.getCode().length() > 1)) {
		    	  DataManager.setCode(DataManager.getCode().substring(0, DataManager.getCode().length() - 1));
		      }
		      if (MainLoop.getWindow().keyPressed(16)) {
		        GameCode.getTextInterface().println("");
		        DataManager.setCode("");
		      }
		      if (i == 10) {
		        dontType = true;
		      }
		      if (MainLoop.getWindow().keyReleased(iBasis)) {
		        iBasis = 0;
		      }
		      if ((iBasis != i) && (i != 0)) {
		        iBasis = i;
		        char a = (char)i;
		        if (((KeyEvent.getExtendedKeyCodeForChar(a) > 47) && (KeyEvent.getExtendedKeyCodeForChar(a) < 58)) || (KeyEvent.getExtendedKeyCodeForChar(a) == 10) || (KeyEvent.getExtendedKeyCodeForChar(a) == 46)) {
		          String typedCharictar = Character.toString(a);
		          while (MainLoop.getWindow().KeysPressed()[charictarNumber] != 0) {
		            i = MainLoop.getWindow().KeysPressed()[charictarNumber];
		            a = (char)i;
		            typedCharictar = typedCharictar + a;
		            charictarNumber++;
		          }
		          if (dontType) {
		        	  DataManager.setSkipedEnter(true);
		          }
		          if (!dontType) {
		            GameCode.getTextInterface().print(typedCharictar);
		            DataManager.setCode(DataManager.getCode() + typedCharictar);
		          }
		        }
		      }
		    }
		    if (GameCode.getTextInterface().selected.equals("consequence")) {
		      GameCode.getTextInterface().selected = "unimportant";
		      GameCode.getTextInterface().println("WHICH RESOURCE DOES THIS OUTCOME EFFECT (YOU CAN MAKE IT EFFECT MORE RESORCES AFTERWARD)");
		      GameCode.getTextInterface().query(new String[] { "PLAYER CASH", "PLAYER GRAIN AMOUNT", "PLAYER GAS AMOUNT", "OTHER EFFECTS" });
		    }
		    if (GameCode.getTextInterface().selected.equals("PLAYER CASH")) {
		      em.println("cash");
		      GameCode.getTextInterface().selected = "positive or negitive";
		    }
		    if (GameCode.getTextInterface().selected.equals("PLAYER GRAIN AMOUNT")) {
		      em.println("grain");
		      GameCode.getTextInterface().println("NOTE NO NON-CUTOM EVENTS GIVE POSITIVE AMOUNTS OF GRAIN");
		      GameCode.getTextInterface().selected = "positive or negitive";
		    }
		    if (GameCode.getTextInterface().selected.equals("PLAYER GAS AMOUNT")) {
		      em.println("gas");
		      GameCode.getTextInterface().selected = "positive or negitive";
		    }
		    if (GameCode.getTextInterface().selected.equals("OTHER EFFECTS")) {
		      GameCode.getTextInterface().println("WHAT EFFECT");
		      GameCode.getTextInterface().selected = "unimportant";
		      GameCode.getTextInterface().query(new String[] { "GOOD KARMA", "BAD KARMA", "DEATH", "MARSH-AN TECH", "AMULET COIN", "ENERGIZED", "NO SLEEP", "CRIMINAL", "COMUNIST", "POISONED", "CURE POISON", "CLEAR CRIMINAL RECORD", "GO BACK TO THE OTHER OPTIONS" });
		    }
		    if (GameCode.getTextInterface().selected.equals("GOOD KARMA")) {
		      em.println("good karma");
		      GameCode.getTextInterface().selected = "more consequences!";
		    }
		    if (GameCode.getTextInterface().selected.equals("BAD KARMA")) {
		      em.println("bad karma");
		      GameCode.getTextInterface().selected = "more consequences!";
		    }
		    if (GameCode.getTextInterface().selected.equals("DEATH")) {
		      em.println("death");
		      GameCode.getTextInterface().selected = "more consequences!";
		    }
		    if (GameCode.getTextInterface().selected.equals("MARSH-AN TECH")) {
		      em.println("marsh-an tech");
		      GameCode.getTextInterface().selected = "more consequences!";
		    }
		    if (GameCode.getTextInterface().selected.equals("AMULET COIN")) {
		      em.println("amulet coin");
		      GameCode.getTextInterface().selected = "more consequences!";
		    }
		    if (GameCode.getTextInterface().selected.equals("ENERGIZED")) {
		      em.println("energized");
		      GameCode.getTextInterface().selected = "more consequences!";
		    }
		    if (GameCode.getTextInterface().selected.equals("NO SLEEP")) {
		      em.println("NO SLEEP");
		      GameCode.getTextInterface().selected = "more consequences!";
		    }
		    if (GameCode.getTextInterface().selected.equals("CRIMINAL")) {
		      em.println("criminal");
		      GameCode.getTextInterface().selected = "more consequences!";
		    }
		    if (GameCode.getTextInterface().selected.equals("COMUNIST")) {
		      em.println("comunist");
		      GameCode.getTextInterface().selected = "more consequences!";
		    }
		    if (GameCode.getTextInterface().selected.equals("POISONED")) {
		      em.println("poisoned");
		      GameCode.getTextInterface().selected = "more consequences!";
		    }
		    if (GameCode.getTextInterface().selected.equals("CURE POISON")) {
		      em.println("cure poison");
		      GameCode.getTextInterface().selected = "more consequences!";
		    }
		    if (GameCode.getTextInterface().selected.equals("CLEAR CRIMINAL RECORD")) {
		      em.println("clear record");
		      GameCode.getTextInterface().selected = "more consequences!";
		    }
		    if (GameCode.getTextInterface().selected.equals("GO BACK TO THE OTHER OPTIONS")) {
		      GameCode.getTextInterface().selected = "consequence";
		    }
		    if (GameCode.getTextInterface().selected.equals("positive or negitive")) {
		      GameCode.getTextInterface().selected = "unimportant";
		      GameCode.getTextInterface().println("DOES IT MAKE A POSITIVE OR NEGITIVE EFFECT");
		      GameCode.getTextInterface().query(new String[] { "POSITIVE EFFECT", "NEGITIVE EFFECT" });
		    }
		    if (GameCode.getTextInterface().selected.equals("POSITIVE EFFECT")) {
		      em.println("positive");
		      GameCode.getTextInterface().selected = "choose amount";
		    }
		    if (GameCode.getTextInterface().selected.equals("NEGITIVE EFFECT")) {
		      em.println("negitive");
		      GameCode.getTextInterface().selected = "choose amount";
		    }
		    if (GameCode.getTextInterface().selected.equals("choose amount")) {
		      boolean dontType = false;
		      if (DataManager.justStarted()) {
		        GameCode.getTextInterface().println(" ");
		        GameCode.getTextInterface().println("PLEASE ENTER THE AMOUNT OF RESOURCE");
		        GameCode.getTextInterface().println(" ");
		        GameCode.getTextInterface().println(" ");
		        DataManager.setJustStarted(false);
		        GameCode.getTextInterface().println(" ");
		      }
		      int charictarNumber = 1;
		      int i = MainLoop.getWindow().KeysPressed()[0];
		      if ((i == 10) && (DataManager.isSkipedEnter()) && (DataManager.getCode() != "")) {
		        GameCode.getTextInterface().println(" ");
		        em.println(DataManager.getCode2() + DataManager.getCode());
		        DataManager.setCode("");
		        DataManager.setCode2("");
		        DataManager.setSkipedEnter(false);
		        DataManager.setJustStarted(true);
		        GameCode.getTextInterface().selected = "more consequences!";
		      }
		      if ((i == 10) || ((MainLoop.getWindow().keyPressed(16)) || (MainLoop.getWindow().keyPressed(8)))) {
		        dontType = true;
		      }
		      if ((MainLoop.getWindow().keyPressed(8)) && (DataManager.getCode().length() > 1)) {
		    	  DataManager.setCode(DataManager.getCode().substring(0, DataManager.getCode().length() - 1));
		      }
		      GameCode.getTextInterface().renderAtAPlace(0, 464, new String[] { DataManager.getCode() }, DataManager.getSprites().yellowfont);
		      if (DataManager.getCode().length() > 79) {
		        DataManager.setCode2(DataManager.getCode2() + DataManager.getCode());
		        DataManager.setCode("");
		      }
		      if (MainLoop.getWindow().keyPressed(16)) {
		        GameCode.getTextInterface().println("");
		        DataManager.setCode("");
		      }
		      if (i == 10) {
		        dontType = true;
		      }
		      if (MainLoop.getWindow().keyReleased(iBasis)) {
		        iBasis = 0;
		      }
		      if ((iBasis != i) && (i != 0)) {
		        iBasis = i;
		        char a = (char)i;
		        if (((KeyEvent.getExtendedKeyCodeForChar(a) > 47) && (KeyEvent.getExtendedKeyCodeForChar(a) < 58)) || (KeyEvent.getExtendedKeyCodeForChar(a) == 10) || (KeyEvent.getExtendedKeyCodeForChar(a) == 46)) {
		          String typedCharictar = Character.toString(a);
		          while (MainLoop.getWindow().KeysPressed()[charictarNumber] != 0) {
		            i = MainLoop.getWindow().KeysPressed()[charictarNumber];
		            a = (char)i;
		            typedCharictar = typedCharictar + a;
		            charictarNumber++;
		          }
		          if (dontType) {
		        	  DataManager.setSkipedEnter(true);
		          }
		          if (!dontType) {
		        	  DataManager.setCode(DataManager.getCode() + typedCharictar);
		          }
		        }
		      }
		    }
		    if (GameCode.getTextInterface().selected.equals("more consequences!")) {
		      GameCode.getTextInterface().println("ARE THERE ANY MORE CONSEQUENCES FOR THIS BRANCH");
		      GameCode.getTextInterface().selected = "unimportant";
		      GameCode.getTextInterface().query(new String[] { "MORE CONSEQUENCES", "NO MORE CONSEQUENCES" });
		    }
		    if (GameCode.getTextInterface().selected.equals("MORE CONSEQUENCES")) {
		      GameCode.getTextInterface().selected = "consequence";
		      em.println("AND");
		    }
		    if (GameCode.getTextInterface().selected.equals("NO MORE CONSEQUENCES")) {
		      numberOfBranches -= 1;
		      if (numberOfBranches == 0) {
		        numberOfChoices -= 1;
		        if (numberOfChoices == 0) {
		          GameCode.getTextInterface().println("CONGRADULATIONS YOU EVENT IS FULLY CONFIGURED IT SHOULD BE WORKING CORRECTLY NOW");
		          GameCode.getTextInterface().selected = "unimportant";
		          em.close();
		          //link back to game start event here
		          GameCode.getTextInterface().query(new String[] { "START GAME", "RULES", "OPTIONS", "ADVANCED CALCULUS" });
		        } else {
		          GameCode.getTextInterface().println("THIS CHOICE IS NOW FULLY CONFIGURED WE WILL NOW MOVE ONTO YOUR NEXT CHOICE");
		          GameCode.getTextInterface().selected = "what a neat thing";
		        }
		      } else {
		        GameCode.getTextInterface().println("THIS BRANCH IS NOW FULLY CONFIGURED WE WILL NOW MOVE ONTO THE NEXT BRANCH");
		        GameCode.getTextInterface().selected = "ehehe sweet";
		      }
		    }
	}

}
