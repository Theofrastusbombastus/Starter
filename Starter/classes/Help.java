package classes;

import java.util.Vector;

/*
 * Help - returns a list of commands available to users
 * Help [command] returns a description of how to use [command]
 * 
 */
public class Help extends Command {
	CommandList clist = new CommandList();
	public Help(){
		this.setName("Help");
		this.setDescription("Lists available commands and how to use a command");
	}
	@Override
	boolean validate(Vector<String> tokens) {
		// TODO Auto-generated method stub
		return false;
	}
	//Call help without any arguments
	boolean validate(){
		printCommands();
		return true;
	}
	public void printCommands(){
		for(Command e : clist.list){
			System.out.println(e.getName());
		}
		
	}
}