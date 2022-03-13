package obsolite;

import location.Location;
import main.GameCode;

public class GasStation extends Location {
	/** 
	 * uses the original constructer
	 */
	public GasStation () {
		super(true);
	}
	@Override
	public void eventStart() {
	        GameCode.getTextInterface().println("WHERE DO YOU WANT TO STOP");
	        GameCode.getTextInterface().println(" ");
	        if (!GameCode.getDataManager().isHomelessFed()) {
	        	GameCode.getTextInterface().query(new String[] { "GAS STATION", "HOTEL", "GRAIN DROP OFF", "RADIO SHACK","CLINIC" });
	        } else {
	        	GameCode.getTextInterface().query(new String[] { "GAS STATION", "HOTEL", "GRAIN DROP OFF", "RADIO SHACK","CLINIC","STRANGE MAN" });
	        }
	}
	 
	public void runEventCode () {
	      if (GameCode.getTextInterface().selected.equals("GAS STATION"))
	      {
	          if (GameCode.getDataManager().gas >= 30.0D) {
	            GameCode.getTextInterface().println("YOU STOPED FOR SOME GAS BUT YOU DIDENT NEED ANY!");
	            GameCode.getTextInterface().query(new String[] { "GET BACK ON THE ROAD" });
	          }
	          if (GameCode.getDataManager().gas < 30.0D) {
	            double amountBought = Math.ceil(30.0D - GameCode.getDataManager().gas);
	            int amountPaid = (int)Math.round(amountBought * 2.66D);
	            if (amountPaid < GameCode.getDataManager().money) {
	              GameCode.getTextInterface().println("YOU DECIDED TO STOP AT A GAS STATION YOU BOUGHT " + Double.toString(amountBought) + " GALLONS OF GAS AND PAID " + Double.toString(amountPaid) + "DOLLARS");
	              GameCode.getDataManager().gas = 30.0D;
	              GameCode.getDataManager().money -= amountPaid;
	              GameCode.getTextInterface().println(" ");
	              GameCode.getTextInterface().query(new String[] { "GET BACK ON THE ROAD" });
	            } else {
	            	if (GameCode.getDataManager().money != 0) {
	            	} else {
	            		 GameCode.getTextInterface().println("YOU STOPPED AT A GAS STAION BUT YOU COULDEN'T AFFORD ANY GAS SO YOU JUST LEFT");
	 	                GameCode.getTextInterface().println(" ");
	 	                GameCode.getTextInterface().query(new String[] { "GET BACK ON THE ROAD" });
	            	}
	              amountBought = Math.ceil(GameCode.getDataManager().money / 2.66D);
	                GameCode.getTextInterface().println("YOU STOPPED AT A GAS STATION YOU COULDEN'T AFFORD A FULL TANK BUT YOU BOUGHT ALL YOU COULD WITH THE CASH YOU HAVE");
	                GameCode.getDataManager().money = 0;
	                GameCode.getDataManager().gas += amountBought;
	                GameCode.getTextInterface().query(new String[] { "GET BACK ON THE ROAD" });
	              }
	            }
	          }
	      if (GameCode.getTextInterface().selected.equals("HOTEL")) {
	        if (80 < GameCode.getDataManager().money) {
	          GameCode.getTextInterface().println("YOU DECIDED TO STOP AT A HOTEL YOU RESTED AND PAID 80 DOLLARS");
	          GameCode.getDataManager().tiredness = 0;
	          GameCode.getDataManager().money -= 80;
	          GameCode.getTextInterface().query(new String[] { "GET BACK ON THE ROAD" });
	        } else {
	          GameCode.getTextInterface().println("YOU STOPPED AT A HOTEL BUT YOU COULDEN'T AFFORD TO STAY SO YOU JUST LEFT");
	          GameCode.getTextInterface().println(" ");
	          GameCode.getTextInterface().query(new String[] { "GET BACK ON THE ROAD" });
	        }
	        
	        GameCode.getTextInterface().selected = "unimportant";
	      }
	       
	          if (this.checkSelected("GRAIN DROP OFF")) {
	            GameCode.getTextInterface().println("YOU RUN INTO A MAN WILLING TO BUY GRAIN HE IS WILLING TO PAY 15 PER 1 PERCENT OF GRAIN NOT AS MUCH AS IN NEW YORK BUT IT COULD HELP FOR THE WAY THERE");
	            GameCode.getTextInterface().println("HOW MUCH DO YOU WANT TO SELL");
	            GameCode.getTextInterface().println(" ");
	            GameCode.getTextInterface().println(" ");
	            GameCode.getTextInterface().query(new String[] { "NONE", "5 PERCENT", "10 PERCENT", "30 PERCENT" });
	          }
	          if (this.checkSelected("CLINIC")) {
	            GameCode.getTextInterface().println("YOU ENCOUNTER A TRAVALING DOCTOR HE DOES AN EXAMINATION ON YOU");
	            if (GameCode.getDataManager().isPoisoned()) {
	              GameCode.getTextInterface().print("HE NOTICES THAT YOU HAVE BEEN POISONED AND GIVES YOU THE ANTIDOTE IMMEDIATELY ");
	              GameCode.getTextInterface().println("POISON HAS BEEN CURED");
	              GameCode.getTextInterface().println(" ");
	              GameCode.getTextInterface().query(new String[] { "GET BACK ON THE ROAD" });
	              GameCode.getDataManager().setPoisoned(false);
	            } else {
	              GameCode.getTextInterface().println("BUT HE DOESEN'T FIND ANYTHING PARTICUALARLY WRONG");
	              GameCode.getTextInterface().println(" ");
	              GameCode.getTextInterface().query(new String[] { "GET BACK ON THE ROAD" });
	            }
	          }
	          if (this.checkSelected("STRANGE MAN")) {
	            GameCode.getTextInterface().println("A MAN WALKS UP TO YOU HE EXPLAINS THAT HE WAS ONE OF THE HOMELESS YOU HELPED EARLIER");
	            GameCode.getTextInterface().println("HE TELLS YOU HE HAS BECOME SUCESSFUL AND GIVES YOU SOME CASH AS THANKS");
	            GameCode.getDataManager().money += 380;
	            GameCode.getTextInterface().println("GET 580 MONEY");
	            GameCode.getDataManager().setHomelessFed(false);
	            GameCode.getTextInterface().println(" ");
	            GameCode.getTextInterface().query(new String[] { "GET BACK ON THE ROAD" });
	          }
	    
	          if (this.checkSelected("RADIO SHACK")) {
	        	 GameCode.getTextInterface().println("YOU STRIKE UP A FRENDLY CONVERSATION WITH A MECHANIC YOU MEET IN THE BUILDING HE OFFERS TO FIX YOUR RADIO");
	        	 GameCode.getTextInterface().println(" ");
	        	 if (!GameCode.getDataManager().workingRadio) {
	             this.playSoundEffect(6.0F, "soundEffects/wrench turning.wav");
	        	 GameCode.getTextInterface().println("THANK GOD FOR FREINDLY MECHANICS AND THE EISENHOWER HIGHWAY SYSTEM");
	        	 GameCode.getTextInterface().println(" ");
	        	 GameCode.getTextInterface().println("GAIN RADIO");
	        	 GameCode.getTextInterface().println(" ");
	        	 GameCode.getDataManager().workingRadio = true;
	             GameCode.getTextInterface().query(new String[] { "GET BACK ON THE ROAD" });
	        	 } else {
	        		this.print("BUT IT ALREADY WORKS FINE");
	        		 GameCode.getTextInterface().query(new String[] { "GET BACK ON THE ROAD" });
	          }
	        }
	      if (GameCode.getTextInterface().selected.equals("NONE")) {
	        GameCode.getTextInterface().println("THE MAN LEAVES OBVIOSLY DISAPOINTED");
	        GameCode.getTextInterface().println(" ");
	        GameCode.getTextInterface().query(new String[] { "GET BACK ON THE ROAD" });
	        GameCode.getTextInterface().selected = "unimportant";
	      }
	      if (GameCode.getTextInterface().selected.equals("5 PERCENT")) {
	        GameCode.getTextInterface().println("THE MAN GIVES YOU 75 DOLLARS AND YOU GIVE HIM 5 GRAIN");
	        GameCode.getTextInterface().println(" ");
	        GameCode.getTextInterface().println("GAIN 75 DOLLARS LOSE 5 PERCENT GRAIN ");
	        GameCode.getTextInterface().println(" ");
	        GameCode.getDataManager().grain -= 5;
	        GameCode.getDataManager().money += 75;
	        GameCode.getTextInterface().query(new String[] { "GET BACK ON THE ROAD" });
	        GameCode.getTextInterface().selected = "unimportant";
	      }
	      if (GameCode.getTextInterface().selected.equals("10 PERCENT")) {
	        GameCode.getTextInterface().println("THE MAN GIVES YOU 150 DOLLARS AND YOU GIVE HIM 10 GRAIN");
	        GameCode.getTextInterface().println(" ");
	        GameCode.getTextInterface().println("GAIN 150 DOLLARS LOSE 10 PERCENT GRAIN ");
	        GameCode.getTextInterface().println(" ");
	        GameCode.getDataManager().grain -= 10;
	        GameCode.getDataManager().money += 150;
	        GameCode.getTextInterface().query(new String[] { "GET BACK ON THE ROAD" });
	        GameCode.getTextInterface().selected = "unimportant";
	      }
	      if (GameCode.getTextInterface().selected.equals("30 PERCENT")) {
	        GameCode.getTextInterface().println("THE MAN GIVES YOU 450 DOLLARS AND YOU GIVE HIM 30 GRAIN");
	        GameCode.getTextInterface().println(" ");
	        GameCode.getTextInterface().println("GAIN 450 DOLLARS LOSE 30 PERCENT GRAIN ");
	        GameCode.getTextInterface().println(" ");
	        GameCode.getDataManager().grain -= 30;
	        GameCode.getDataManager().money += 450;
	        GameCode.getTextInterface().query(new String[] { "GET BACK ON THE ROAD" });
	        GameCode.getTextInterface().selected = "unimportant";
	      }
	      
	     
	      if (GameCode.getTextInterface().selected.equals("GET BACK ON THE ROAD")) {
	        GameCode.setCurrentEvent(GameCode.getDataManager().getComunityDrive());
	      }
	    }
	}
