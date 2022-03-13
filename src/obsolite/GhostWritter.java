package obsolite;

import location.Location;
import main.GameCode;

public class GhostWritter extends Location {
	public GhostWritter () {
		super(false);
	}
	@Override
	public void eventStart() {
	      GameCode.getTextInterface().println("YOU SEE A TWO MEN FIGHTING YOU GO UP AND ASK WHAT ITS ABOUT APPARENTLY ONE OF THEM IS ANGRY THAT THE OTHER ISENT DOING A GREAT JOB");
          GameCode.getTextInterface().println("GHOST WRITING THE OTHER MAN IS COMPLAING THAT HIS LIFE DOESEN'T HAVE ANYTHING INTRISTING TO WRITE ABOUT HE EVENTUALLLY ASKS YOU");
          GameCode.getTextInterface().println("TO BACK HIM UP BY GIVEING HIM SOMETHING INTRISTING EVENTUALLY YOU START TELLING THEM ABOUT ALL THE STUFF THAT HAPPENED ON THE TRIP TO NEW YORK");
          GameCode.getTextInterface().println("THEY ARE SO FACINATED THEY WANT TO PUT YOUR ADVENTURE IN HIS BOOK HE OFFERS YOU 900 DOLLARS AND YOU TAKE IT");
          GameCode.getTextInterface().println(" ");
          GameCode.getTextInterface().println("GAIN 900 DOLLARS");
          GameCode.getDataManager().setCalamityCount(0);
          GameCode.getDataManager().money += 900;
          GameCode.getTextInterface().println(" ");
          GameCode.getTextInterface().query(new String[] { "GET BACK ON THE ROAD" });
	}
	 @Override
	public void runEventCode () {
		if (this.checkSelected("GET BACK ON THE ROAD")) {
			GameCode.setCurrentEvent(GameCode.getDataManager().getComunityDrive());
		}
	}
	 @Override
	 public int getProbablity() {
		if (GameCode.getDataManager().getCalamityCount() >= 4) {
			return 20;
		} else {
			return 0;
		}
	 }
}
