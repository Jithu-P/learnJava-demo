package generics;

public class MyGenericClass <T, T2>{

	T x;
	T2 y;
	
	MyGenericClass(T x, T2 y){
		this.x = x;
		this.y = y;
	}
	
	
	/*public T getValue() {
		return x;
	}
	*/
	
	public T2 getValue() {
		return y;
	}
	
}
