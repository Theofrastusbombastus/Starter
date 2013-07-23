package classes;


public abstract class Potion extends Item{
	String typeOfPotion;
	public void setType(String type){
		this.typeOfPotion = type;
	}
	public String getType(){
		return this.typeOfPotion;
	}
}
