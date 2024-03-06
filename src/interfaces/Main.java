package interfaces;

public class Main {

	public static void main(String[] args) {

		Mouse mouse = new Mouse();
		mouse.flee();
		
		Eagle eagle = new Eagle();
		eagle.hunt();
		
		Snake snake = new Snake();
		snake.flee();
		snake.hunt();
		
		System.out.println(mouse.speed);
		System.out.println(eagle.speed);
		
		//System.out.println(snake.speed); - speed is ambiguous for snake as it implements both interfaces
		
		
		
	}

}
