package game;

import org.springframework.stereotype.Component;

@Component("MarioGame")
public class MarioGame implements GameConsole{

	@Override
	public void up() {
		// TODO Auto-generated method stub
		System.out.println("jump");
	}

	@Override
	public void down() {
		// TODO Auto-generated method stub
		System.out.println("crouch");
		
	}

	@Override
	public void right() {
		// TODO Auto-generated method stub
		System.out.println("run");
		
	}

	@Override
	public void left() {
		// TODO Auto-generated method stub
		System.out.println("slide");
		
	}

}
