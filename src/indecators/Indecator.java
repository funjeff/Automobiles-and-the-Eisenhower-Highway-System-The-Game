package indecators;

import main.GameCode;
import resources.Sprite;

public class Indecator {
	int x;
	int y;
	public Sprite indicatorSprite;
	public int value;
	public Sprite font;
	public Indecator (int x, int y) {
		this.setX(x);
		this.setY(y);
	}
	public void displayIndecator () {
		if (indicatorSprite != null) {
			indicatorSprite.draw(x, y);
		}
		GameCode.getTextInterface().renderAtAPlace(x + 16, y, new String [] {Integer.toString(value)},this.getFont());
	}
	public void setX (int x) {
		this.x = x;
	}
	public void setY (int y) {
		this.y = y;
	}
	public int getX () {
		return x;
	}
	public int getY () {
		return y;
	}
	public void setSprite (Sprite sprite) {
		indicatorSprite = sprite;
	}
	public void setValue (int value) {
		this.value = value;
	}
	public void setFont (Sprite newFont) {
		font = newFont;
	}
	public Sprite getFont () {
		return font;
	}
}
