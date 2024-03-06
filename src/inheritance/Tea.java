package inheritance;

public class Tea extends Drinks{

	String condition;
	
	Tea(String c, String st){
		super(st);
		this.condition = c;
	}
	
	public String teaDetails() {
		return condition + "\t" + super.status;
		//return this.condition + "\t" + super.status;
	}
	
}
