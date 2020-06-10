package main;

import com.codedisaster.steamworks.SteamAPI;
import com.codedisaster.steamworks.SteamException;
import com.codedisaster.steamworks.SteamID;
import com.codedisaster.steamworks.SteamLeaderboardHandle;
import com.codedisaster.steamworks.SteamResult;
import com.codedisaster.steamworks.SteamUserStats;
import java.io.PrintStream;

public class thingy implements com.codedisaster.steamworks.SteamUserStatsCallback
{
  public static SteamUserStats userStats;
  
  public thingy()
  {
    System.out.println("please");
    try {
      if (SteamAPI.init()) {
        userStats = new SteamUserStats(this);
        RequestStats();
      }
    } catch (SteamException e) {
      System.out.println("lolz");
      e.printStackTrace();
    }
  }
  
  public boolean RequestStats() { if (!SteamAPI.isSteamRunning()) {
      return false;
    }
    return userStats.requestCurrentStats();
  }
  
  public boolean SetAchivement(String ID)
  {
    userStats.setAchievement(ID);
    return userStats.storeStats();
  }
  
  public void onGlobalStatsReceived(long arg0, SteamResult arg1) {}
  
  public void onLeaderboardFindResult(SteamLeaderboardHandle arg0, boolean arg1) {}
  
  public void onLeaderboardScoreUploaded(boolean arg0, SteamLeaderboardHandle arg1, int arg2, boolean arg3, int arg4, int arg5) {}
  
  public void onLeaderboardScoresDownloaded(SteamLeaderboardHandle arg0, com.codedisaster.steamworks.SteamLeaderboardEntriesHandle arg1, int arg2) {}
  
  public void onUserAchievementStored(long arg0, boolean arg1, String arg2, int arg3, int arg4) {}
  
  public void onUserStatsReceived(long arg0, SteamID arg1, SteamResult arg2) {}
  
  public void onUserStatsStored(long arg0, SteamResult arg1) {}
  
  public void onUserStatsUnloaded(SteamID arg0) {}
}
