package Classes;
import java.util.Vector;

public class Parser {
	public Vector<String> parse(String command){
	boolean spaces = true;
	Vector<String> tokens = new Vector<String>();
		while(spaces){
			int pos = command.indexOf(" ");
			if(pos > 0){
				tokens.add(command.substring(0,pos));
				command = command.substring(pos+1);
			}
			else{
				spaces = false;
			}
		}
		tokens.add(command);
		return tokens;
	}
}
