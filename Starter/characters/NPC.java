package characters;
import classes.Character;
import classes.Inventory;
import classes.Item;

public class NPC extends Character{
	public Inventory inventory;
	public NPC(String description, String name){
		this.setDescription(description);
		this.setName(name);
		this.setType("NPC");
		this.inventory = new Inventory();
	}
	public void printShop(){
		for(Item e : this.inventory.getItemList()){
			System.out.println(e.getName() + "\t" + e.getPrice());
		}
	}
}
