package Classes;
/*
 * Help - returns a list of commands available to users
 * Help [command] returns a description of how to use [command]
 * 
 */
public class Help extends Command {
	CommandList clist = new CommandList();
	public Help(){
		this.setName("Help");
		this.setInfo("Lists available commands and how to use a command");
	}
	@Override
	boolean validate(String[] tokens) {
		// TODO Auto-generated method stub
		return false;
	}
	//Call help without any arguments
	boolean validate(){
		printCommands();
		return true;
	}
	public void printCommands(){
		for(Command item : clist.list){
			System.out.println(item.getName());
		}
		
	}
}