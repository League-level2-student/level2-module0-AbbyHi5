package arrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
	public static void main(String[] args) {
		Robot[] robs = new Robot[5];
		Random ran= new Random();
		Random r = new Random();
		Random g = new Random();
		Random b = new Random();
		//2. create an array of 5 robots.
		
		//3. use a for loop to initialize the robots.
		for (int i = 0; i < robs.length; i++) {
			robs[i] = new Robot("mini");
		}
			//4. make each robot start at the bottom of the screen, side by side, facing up
		
		robs[0].setX(50);
		robs[1].setX(250);
		robs[2].setX(450);
		robs[3].setX(650);
		robs[4].setX(850);
		
		robs[0].setY(550);
		robs[1].setY(550);
		robs[2].setY(550);
		robs[3].setY(550);
		robs[4].setY(550);
		
		robs[0].setSpeed(11);
		robs[1].setSpeed(11);
		robs[2].setSpeed(11);
		robs[3].setSpeed(11);
		robs[4].setSpeed(11);

		//5. use another for loop to iterate through the array and make each robot move 
		//   a random amount less than 50.
		outerloop:
		while (0==0) {
			
			for (int i = 0; i < robs.length; i++) {
				int speed = ran.nextInt(50) + 1;
				robs[i].move(speed);
				for (int j = 0; j < robs.length; j++) {
					int y = robs[j].getY();
					if(y < 15) {
						System.out.println("Robot " + (j + 1) + " wins!");
						break outerloop;
					}
				}
			}
		
		}
		//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.
	
		//7. declare that robot the winner and throw it a party!
		while (1==1) {
		robs[1].setWindowColor(r.nextInt(255) + 1, g.nextInt(255) + 1, b.nextInt(255) + 1);
		}
		//8. try different races with different amounts of robots.
	
		//9. make the robots race around a circular track.
	}
}