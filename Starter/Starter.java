import java.util.Vector;

import classes.Parser;


public class Starter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parser parser = new Parser();
		Vector<String> temp = new Vector<String>();
		temp = parser.parse("Hello Chudi how are you");
		System.out.println(temp);
	}

}


/*
	Dialogue-
	Text
	Option1...
	OptionN
	
	Dialogue object
	String text
	Vector<Options> options
	
	Option object
	string text
	function action
	
	Dialogue a
	text = "Hello traveler"
	options = [a,b,c]
	
	Option a.text = "Hello sir"
	a.action = callDialogue2(NPC NAME)

*/
