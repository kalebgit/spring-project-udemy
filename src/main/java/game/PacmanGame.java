package game;

import org.springframework.stereotype.Component;

@Component("PacmanGame")
public class PacmanGame implements GameConsole{

	@Override
	public void up() {
		// TODO Auto-generated method stub
		System.out.println("up");
	}

	@Override
	public void down() {
		// TODO Auto-generated method stub
		System.out.println("down");
	}

	@Override
	public void right() {
		// TODO Auto-generated method stub
		System.out.println("right");
	}

	@Override
	public void left() {
		// TODO Auto-generated method stub
		System.out.println("left");
	}

}
