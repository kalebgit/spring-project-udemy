package game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("SuperContraGmaeQualifier")
public class SupraContraGame implements GameConsole{

	@Override
	public void up() {
		// TODO Auto-generated method stub
		System.out.println("up");
	}

	@Override
	public void down() {
		// TODO Auto-generated method stub

		System.out.println("Sit down");
	}

	@Override
	public void right() {
		// TODO Auto-generated method stub

		System.out.println("Go back ");
	}

	@Override
	public void left() {
		// TODO Auto-generated method stub

		System.out.println("Shoot a bullet");
	}

}
