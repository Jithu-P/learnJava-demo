package inheritance;

public class Juice extends Drinks{

	String color;
	String taste;
	
	Juice(String c, String t, String st){
		super(st);
		this.color = c;
		this.taste = t;
	}
	
	@Override
	public String drinksDetails() {
		return this.color + "\t" + this.taste + "\t" + super.status;
	}
	
}
