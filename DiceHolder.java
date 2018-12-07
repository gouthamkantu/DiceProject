import java.util.ArrayList;
public class DiceHolder{


	private ArrayList <Die> container;

	public DiceHolder(){

	container = new ArrayList <Die> ();

	}

	public int addDie (Die die){

		while(container.size() < 5){

			container.add(die);
			return 1;

			}

			container.add(die);
			return -1;


	}

	public void shake(){

		for (int i = 0; i < container.size(); i++){

			(container.get(i)).roll();
		}
	}

	public String toString(){

		String s = "";

		for (int i = 0; i < container.size(); i++){

			s+="Die "+(i+1)+": "+container.get(i).getValue()+" ";
		}

		return s;
	}
}