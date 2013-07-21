package Classes;
//import java.lang.String;
public abstract class Command {
	private String description,name;
	abstract boolean validate(String[] tokens);
	
	
	public void setDescription(String info){
		this.description = info;
	}
	public void setName(String info){
		this.name = info;
	}
	public String getDescription(){
		return this.description;
	}
	public String getName(){
		return this.name;
	}
	
	
}
