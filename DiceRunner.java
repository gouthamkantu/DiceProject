public class DiceRunner{

	public static void main (String[]args){

	//Test1

	Die a = new Die ();
	Die b = new Die();

	int count = 0;

	while ((a.getValue()!=1)||(b.getValue()!=1)){

		a.roll();
		b.roll();

		System.out.println(count);
		System.out.println(a);
		System.out.println(b);

		count++;
	}


	//Test2

	int i = 1;

	DiceHolder holder = new DiceHolder();

		while (i==1){
			i = holder.addDie(new Die((int)(Math.random()*100)+2));

			System.out.println(holder);

		}

		holder.shake();
		System.out.println(holder);




	}
	}