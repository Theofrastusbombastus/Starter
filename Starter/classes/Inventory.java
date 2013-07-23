package classes;

import java.util.Vector;

public class Inventory {
	private Vector<Item> itemList;
	
	
	public Inventory(){
		itemList = new Vector<Item>(35);
	}
	public boolean addItem(Item item){
		if(this.itemList.size() > 34){
			//Inventory full
			System.out.println("Inventory is full! Discard some items!");
			return false;
		}
		else{
			this.itemList.add(item);
			return true;
		}
	}
	public boolean removeItem(Item item){
		if(!this.itemList.remove(item)){
			System.out.println("Item not found!");
			return false;
		}
		else{
			System.out.println(item.getName() + " has been removed from your inventory");
			return true;
		}
	}
	public void checkInventory(){
		for(Item e: itemList){
			System.out.println(e.getName());
		}
	}
	public Vector<Item> getItemList(){
		return this.itemList;
	}
}
