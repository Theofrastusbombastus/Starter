package Classes;
//import java.lang.String;
public abstract class Command {
	private String description;
	abstract boolean validate(String[] tokens);
	void setInfo(String info){
		description = info;
	}
}
