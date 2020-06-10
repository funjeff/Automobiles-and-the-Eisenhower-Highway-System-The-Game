package main;

import resources.SpriteContainer;

public abstract class GameAPI { public GameAPI() {}
  protected static SpriteContainer sprites = MainLoop.getSprites ();;
  
  public boolean keyCheck(int keyCode) {
    return MainLoop.getWindow().keyCheck(keyCode);
  }
  
  public boolean keyPressed(int keyCode) {
    return MainLoop.getWindow().keyPressed(keyCode);
  }
  
  public boolean keyReleased(int keyCode) {
    return MainLoop.getWindow().keyReleased(keyCode);
  }
  
  public int[] keysPressed() {
	  return MainLoop.getWindow().KeysPressed(); 
	  }
  
  public SpriteContainer getSprites()
  {
    return MainLoop.getSprites();
  }
}
