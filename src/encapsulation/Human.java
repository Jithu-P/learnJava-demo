package encapsulation;

public class Human {

	private String name;
	private int age;
	
	/*
	NOTE: If name of attribute (variable) is different from that of the parameters being passed, we can
	omit the 'this' keyword.
	*/
	
	Human(String n, int a){
		this.setName(n);
		//setName(n);
		this.setAge(a);
		//setAge(a);
	}
	
	public String getName() {
		return this.name;
		//return name;
	}
	
	public int getAge() {
		return this.age;
		//return age;
	}
	
	
	public void setName(String nm) {
		this.name = nm;
		//name = nm;
	}
	
	public void setAge(int ag) {
		this.age = ag;
		//age = ag;
	}
	
}
