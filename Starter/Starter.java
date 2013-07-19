import java.util.Vector;
import Classes.Parser;


public class Starter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parser parser = new Parser();
		Vector<String> temp = new Vector<String>();
		temp = parser.parse("Hello Chudi how are you");
		System.out.println(temp);
	}

}
