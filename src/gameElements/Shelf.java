package gameElements;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Random;
import java.awt.Point;


import items.Item;
import json.JSONArray;
import json.JSONException;
import json.JSONObject;
import main.Actor;
import resources.PixelParser;
import resources.Sprite;

public class Shelf extends Actor{
	
	
	ArrayList <ArrayList <Item>> shelfItems;
	
	ArrayList <Sprite> layers;
	
	
	/*params are
	min items
	max items
	shelf folder name
	shelf contents file
	*/
	public Shelf (String params) {
	
		String [] parsedParams = params.split(":");
		
		int minItems = Integer.parseInt(parsedParams[0]);
		int maxItems = Integer.parseInt(parsedParams[1]);
		
		String folder = parsedParams[2];
		String itemList = parsedParams[3];
		
		//pulls the base image
		layers.add(new Sprite(folder + "image.png"));
		
		
		ArrayList <Sprite> itemMasks = new ArrayList <Sprite>();
		
		itemMasks.add(new Sprite (folder + "objs.png"));
		
		//pulls all of the optional layer info from the layer folder
		File layerDir = new File (folder + "layers/");
		
		String [] file = layerDir.list();
		
		for (int i = 0; i < file.length; i++) {
			layers.add(new Sprite (file[i]));
		}
		
		
		//pulls all info about where to spawn items on shelves
		File maskDir = new File (folder + "objs/");
				
		String [] masks = maskDir.list();
			
		for (int i = 0; i < masks.length; i++) {
			
			//gets the digit num from the file name
			String completeDigits = Character.toString(masks[i].charAt(5));
			
			int digitNum = 6;
			while(Character.isDigit(masks[i].charAt(digitNum))) {
				completeDigits = completeDigits + masks[i].charAt(digitNum);
				digitNum = digitNum + 1;
			}
			
			
			int count = 1;
			
			int num = Integer.parseInt(completeDigits);
			
			//adds in empty things for shelves that dont have items on them
			while (count != num) {
				count = count + 1;
				itemMasks.add(null);
			}
			
			itemMasks.add(new Sprite (masks[i]));
			count = count + 1;
		}
		
		//sets up the shelf items
		shelfItems = new ArrayList <ArrayList <Item>>();
		
		shelfItems.add(new ArrayList <Item>());
		for (int i = 0; i < itemMasks.size(); i++) {
			if (itemMasks.get(i) == null) {
				shelfItems.add(null);
			} else {
				shelfItems.add(new ArrayList <Item>());
			}
		}
		/*
		 * just to recap real quick what we have now is images for each layer of the shelf
		 * and images to deterermine where items should spawn on those shelves
		 * its also orginazied so we know what items are on what shelves
		 * or to be more precice whate order the items and shelf layers should be drawn
		 */
		
		ArrayList <ItemWeight> itemChoices = new ArrayList <ItemWeight>();
		
		try {
			JSONObject itemInfo = new JSONObject(itemList);
			
			JSONArray arr = itemInfo.getJSONArray("items");
			
			int runningTotal = 0;
			
			for (int i = 0; i < arr.getContents().size(); i++) {
				
				JSONObject itemType = (JSONObject)arr.get(i);
				
				String itemParameters = itemType.getString("parameters");
				
				Item itemChoice = null;
				
				
				//mostly stolen from interior.java
				try {
					Class<?> cls = Class.forName("items." + itemType.getString("type"));
					
					if (itemParameters != null) {
						Class <?> string = Class.forName("java.lang.String");
						
						itemChoice = (Item)cls.getConstructor(string).newInstance(params);
					} else {
						itemChoice = (Item)cls.getConstructor().newInstance();
					}
				} catch (ClassNotFoundException  | InstantiationException | IllegalAccessException | IllegalArgumentException
						| InvocationTargetException | NoSuchMethodException | SecurityException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				int prob = itemType.getInt("chance");
				
				itemChoices.add(new ItemWeight(itemChoice,runningTotal + prob));
				runningTotal = runningTotal + prob;
			}
			
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		Random r = new Random ();
		
		int itemNum = r.nextInt(maxItems - minItems) + minItems; //determines how many items to spawn
		
		int spawnedItemCount = 0;
		
		while (spawnedItemCount < itemNum) {
			
			int itemXPos = r.nextInt(layers.get(0).getWidth());
			int itemYPos = r.nextInt(layers.get(0).getHeight());
			
			
			boolean addedItem = false;
			for (int i = 0; i < itemMasks.size(); i++) {
				if (itemMasks.get(i) == null) {
					continue;
				}
				//not sure if this works for the hashmap becasue I am making a new Point
				if (!PixelParser.parse(itemMasks.get(i)).get(0).getPixelMap().get(new Point (itemXPos,itemYPos)).isTransparent()) {
					Item onShelf = pullItem(itemChoices);
					
					onShelf.setX(this.getX() + itemXPos);
					onShelf.setY(this.getY() + itemYPos);
					
					shelfItems.get(i).add(onShelf);
					addedItem = true;
					break;
				}
			}
			
			if (addedItem) {
				spawnedItemCount = spawnedItemCount + 1;
			}
		}
		
	}
	
	

	public Item pullItem(ArrayList <ItemWeight> choices) {
		Random r = new Random ();
		
		int choice = r.nextInt(100) + 1;
		
		int curOption = 0;
		
		int runningTotal = 0;
		
		while (runningTotal < choice) {
			runningTotal = runningTotal + choices.get(curOption).getWeight();
			curOption = curOption + 1;
		}
		
		return choices.get(curOption).getItem();
		
	}
	
	
	@Override
	public void draw () {
		
		for (int i = 0; i < layers.size(); i++) {
			layers.get(i).draw(this.getX(), this.getY());
			if (shelfItems.get(i) != null) {
				for (int j = 0; j < shelfItems.get(i).size(); j++) {
					shelfItems.get(i).get(j).draw();
				}
			}
		}
		
	}
	
	public class ItemWeight {
		
		Item item;
		int weight;
		
		public ItemWeight (Item item, int weight) {
			this.item = item;
			this.weight = weight;
		}
		public Item getItem () {
			return item;
		}
		public int getWeight() {
			return weight;
		}
	}
}
