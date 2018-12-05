import java.util.ArrayList;
public class DiceHolder{

	Die die = new Die ();
	private ArrayList <String> container = new ArrayList <> ();

	public DiceHolder(){


	}

	public int addDie (Die die){

		while(container.size() <= 5){

			container.add(die);
			return 1;

			}

			return -1;


	}

	public void shake(){

		for (int i = 0; i < container.size(); i++){

			die.roll(container.get(i));
			container.set(i, die);
		}
	}

	public String toString(){

		for (int i = 0; i < container.size(); i++){

			return container.get(i);
		}

	}
}