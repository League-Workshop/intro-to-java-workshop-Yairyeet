package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
		Robot ya=new Robot();
		ya.setSpeed(100);
		ya.penDown();
		ya.move(200);
		ya.turn(-90);
		ya.move(200);
		ya.turn(-90);
		ya.move(200);
		ya.turn(-90);
		ya.move(200);
		for(int i=0; i<4; i++) {
			ya.move(200);
			ya.turn(-90);
		}
	}
}
