package Classes;
/*
 * Help - returns a list of commands available to users
 * Help [command] returns a description of how to use [command]
 * 
 */
public class Help extends Command {
	
	
	@Override
	boolean validate(String[] tokens) {
		// TODO Auto-generated method stub
		return false;
	}
	boolean validate(){
		printCommands();
		return true;
	}
	public void printCommands(){
		
		
	}
}
