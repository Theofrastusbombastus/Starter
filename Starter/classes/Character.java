package classes;

public abstract class Character {
	private String description,name, type;
	
	public void setDescription(String info){
		this.description = info;
	}
	public void setName(String info){
		this.name = info;
	}
	public void setType(String type){
		this.type = type;
	}
	
	public String getDescription(){
		return this.description;
	}
	public String getName(){
		return this.name;
	}
	public String getType(){
		return this.type;
	}
	
}
