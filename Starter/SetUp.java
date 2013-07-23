import java.util.Vector;

import characters.NPC;
import classes.Character;
import classes.Item;


public class SetUp {
	public Vector<Character> characterList;
	public Vector<Item> itemList;
	public SetUp(){
		this.setUpNPCs();
		this.setUpInventories();
		this.setUpItems();
	}
	private void setUpNPCs(){
		NPC e = new NPC("A nice shopkeeper who is also black","BlackSteve");
		characterList.add(e);
		e = new NPC("A grumpy old man","GrumpyBill");
		characterList.add(e);
	}
	private void setUpInventories(){
		
	}
	private void setUpItems(){
			
	}
}
