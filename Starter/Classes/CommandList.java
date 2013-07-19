package Classes;

import java.util.Vector;

public class CommandList {
	public Vector<Command> list = new Vector<Command>();
	public CommandList(){
		Help h = new Help();
		list.add(h);
	}
}
