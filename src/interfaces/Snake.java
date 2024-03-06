package interfaces;

public class Snake implements Prey, Predator{

	@Override
	public void hunt() {

		System.out.println("The snake is hunting");
		
	}

	@Override
	public void flee() {

		System.out.println("The snake is fleeing");
		
	}

}
