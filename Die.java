public class Die{

	private int sides;
	private int value;

	public Die(int value){
		this.value= value;
		this.sides = 6;
		}

	public int getValue(){
		return value;
		}

	public void roll(){
		value =+ (int)(Math.random()+1)*6;
		}

	public String toString(){
		return "Number of sides: "+ sides + ", Value: "+ value;
		}

}