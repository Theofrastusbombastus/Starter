package classes;

public abstract class Item {
	private String description, name;
	private int price;
	
	
	public void setDescription(String info){
		this.description = info;
	}
	public void setName(String info){
		this.name = info;
	}
	public void setPrice(int price){
		this.price = price;
	}
	
	
	public String getDescription(){
		return this.description;
	}
	public String getName(){
		return this.name;
	}
	public int getPrice(){
		return this.price;
	}
	
	
}
