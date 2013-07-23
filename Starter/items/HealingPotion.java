package items;

import classes.Potion;

public class HealingPotion extends Potion{
	
	private int healAmount;
	
	
	public HealingPotion(String name, String description, int healAmount, int price){
		this.healAmount = healAmount;
		this.setPrice(price);
		this.setDescription(description);
		this.setName(name);
		this.setType("Health");
	}
	
	public int getHealAmount(){
		return this.healAmount;
	}

}