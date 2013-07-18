package Classes;
//import java.lang.String;
public abstract class Command {
	private String description,name;
	abstract boolean validate(String[] tokens);
	void setInfo(String info){
		description = info;
	}
	String getInfo(){
		return description;
	}
	void setName(String rename){
		name = rename;
	}
	String getName(){
		return name;
	}
}
