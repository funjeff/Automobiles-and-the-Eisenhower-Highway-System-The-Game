package main;

import javax.sound.sampled.Clip;
import resources.Sprite;

public class TextInterface extends GameAPI
{
  public int width;
  public int height;
  public int line;
  public int charPos;
  public int topChoice;
  public int bottomChoice;
  public int selectorPos;
  public Sprite font;
  public Sprite selector;
  public String[] text;
  public String selected;
  int amountBackshifted;
  public boolean renderThisBadBoy;
  public Sprite image;
  private int imagePosition;
  public TextInterface(int width, int height, Sprite selector)
  {
    this.width = width;
    this.height = height;
    this.font = sprites.font;
    this.selector = selector;
    text = new String[height];
    for (int i = 0; i < text.length; i++) {
      text[i] = "";
    }
    line = 0;
    charPos = 0;
    topChoice = 0;
    bottomChoice = 0;
    selectorPos = -1;
    imagePosition = 512;
    selected = "unimportant";
    amountBackshifted = 0;
    renderThisBadBoy = false;
    image = new Sprite ("Illistrations/Raltz.png");
  }
  
  public void frameEvent() { if (selectorPos != -1) {
      if (keyPressed(87)) {
        selectorPos -= 1;
      }
      if (keyPressed(83)) {
        selectorPos += 1;
      }
      if (selectorPos >= topChoice) {
        selectorPos = topChoice;
      }
      if (selectorPos < bottomChoice) {
        selectorPos = bottomChoice;
      }
      if (keyPressed(10)) {
        queryEvent(text[selectorPos].substring(1));
        selectorPos = -1;
      }
    }
  if (renderThisBadBoy) {
	    renderImage (image, false);
	    }
    render();
  }
  
  public void queryEvent(String selected) {
    this.selected = selected;
    GameCode.clip2.stop();
    GameCode.stuff.playSoundEffect(6.0F, "soundEffects/Click.wav");
  }
  
  public void append(String str) { int tmp8_5 = line; String[] tmp8_1 = text;tmp8_1[tmp8_5] = (tmp8_1[tmp8_5] + str);
    if (text[line].length() > width) {
      text[line] = text[line].substring(0, width);
    }
    charPos += str.length();
    if (charPos >= width)
      charPos = (width - 1);
  }
  
  public void print(String str) {
    int workingChar = 0;
    int textLength = str.length();
    while (workingChar < textLength)
      if (textLength - workingChar > width - charPos) {
        int previousChar = workingChar;
        for (int i = width - charPos; i > workingChar; i--) {
          if (str.charAt(i) == ' ') {
            workingChar = i + 1;
            break;
          }
        }
        if (previousChar == workingChar) {
          int positionPrevious = charPos;
          append(str.substring(workingChar, width - charPos));
          workingChar += width - positionPrevious;
          println();
        } else {
          append(str.substring(previousChar, workingChar));
          println();
        }
      } else {
        append(str.substring(workingChar, textLength));
        workingChar = textLength;
      }
  }
  
  public void println(String str) {
    print(str);
    println();
  }
  
  public void println() { if (line >= height - 1) {
      backshift(1);
    } else {
      line += 1;
    }
    charPos = 0;
  }
  
  public void query(String[] options) { if (line != 40) {
      selectorPos = line;
      bottomChoice = line;
      topChoice = (line + options.length - 1);
    } else {
      selectorPos = (line + 4);
      bottomChoice = line;
      topChoice = (line + options.length - 1);
    }
    for (int i = 0; i < options.length; i++) {
      println(" " + options[i]);
      if (line >= height - 1) {
        amountBackshifted += 1;
      }
    }
    if (line == 40) {
      line = (40 - amountBackshifted);
      selectorPos = line;
      bottomChoice = line;
      topChoice = (line + options.length - 1);
      line = 40;
      amountBackshifted = 0;
    }
  }
  
  public void render() {
    for (int i = 0; i < text.length; i++) {
      for (int j = 0; j < text[i].length(); j++) {
        font.setFrame(text[i].charAt(j));
        font.draw(j * 8, i * 12 + 1);
      }
    }
    if (selectorPos != -1)
      selector.draw(0, selectorPos * 12 + 1);
  }
  
  public void renderAtAPlace(int x, int y, String[] message, Sprite color) {
    for (int i = 0; i < message.length; i++)
      for (int j = 0; j < message[i].length(); j++) {
        color.setFrame(message[i].charAt(j));
        color.draw(j * 8 + x, i * 10 + 1 + y);
      }
  }
  
  public void backshift(int lines) {
	  if (renderThisBadBoy) {
	  imagePosition = imagePosition - (10 * lines);
	  }
    for (int i = lines; i < height; i++) {
      text[(i - lines)] = text[i];
    }
    for (int i = 0; i < lines; i++) {
      text[(height - i - 1)] = "";
    }
  }
  public void renderImage (Sprite image, boolean firstRun) {
	 this.image = image;
	 renderThisBadBoy = true;
	 if (firstRun) {
		 if (this.renderThisBadBoy) {
			 imagePosition = 400;
		 }
		 this.backshift(10);
	 }
	 image.draw(200, imagePosition);
	 if (imagePosition <= -320) {
		 renderThisBadBoy = false;
		 imagePosition = 400;
	 }
  }
}
