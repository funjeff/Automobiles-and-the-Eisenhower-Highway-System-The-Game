package main;


public abstract class GameAPI { public GameAPI() {}
  
  public static boolean keyCheck(int keyCode) {
    return MainLoop.getWindow().keyCheck(keyCode);
  }
  
  public static boolean keyPressed(int keyCode) {
    return MainLoop.getWindow().keyPressed(keyCode);
  }
  
  public static boolean keyReleased(int keyCode) {
    return MainLoop.getWindow().keyReleased(keyCode);
  }
  
  public static int[] keysPressed() {
	  return MainLoop.getWindow().KeysPressed(); 
	  }
  
 
}
