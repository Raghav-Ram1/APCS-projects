import kareltherobot.*;

public class Main implements Directions{
  public static void main(String[] args) {
    World.setVisible(true);// allows us to see the run
    World.setDelay(0);

    // The line below creates a Robot that we will refer to as r.  
    // Find out what the numbers and direction do!
    Robot r = new Robot(9,1,East,1000);
		
    // examples of commands you can invoke on a Robot
    r.move();// move one step in the direction it is facing
    r.putBeeper();
    r.move();
	  r.putBeeper();
    r.move();// move one step in the direction it is facing
    r.putBeeper();
    r.turnLeft();
    r.turnLeft();
    r.turnLeft();
    r.move();
    r.putBeeper();
    r.move();
    r.putBeeper();
    r.turnLeft();
    r.turnLeft();
    r.turnLeft();
    r.move();
    r.putBeeper();
    r.move();
    r.putBeeper();
    r.turnLeft();
    r.turnLeft();
    r.turnLeft();
     r.move();
    r.putBeeper();
    r.move();
    r.turnLeft();
    r.turnLeft();
   r.move();
    r.putBeeper();
    r.move();
    r.putBeeper();
    r.move();
    r.putBeeper();
    r.move();
    r.putBeeper();
    r.move();
    r.putBeeper();
    r.move();
    r.putBeeper();
    r.turnLeft();
    r.turnLeft();
   r.move();
   r.move();
   r.move();
   r.move();
   r.turnLeft();
   r.turnLeft();
    r.turnLeft();
   r.move();
   r.turnLeft();
   r.turnLeft();
    r.turnLeft();
    r.move();
    r.putBeeper();
    r.move();
    r.turnLeft();
    r.move();
    r.putBeeper();
    r.move();
    r.turnLeft();
   r.turnLeft();
    r.turnLeft();
    r.move();
    r.putBeeper();
    r.move();
    r.turnLeft();
    r.putBeeper();


Robot s = new Robot(9,6,East,1000);

    s.move();// move one step in the direction it is facing
   s.putBeeper();
   s.move();
   s.putBeeper();
   s.move();// move one step in the direction it is facing
   s.putBeeper();
   s.turnLeft();
   s.turnLeft();
   s.turnLeft();
   s.move();
   s.putBeeper();
   s.move();
   s.putBeeper();
   s.turnLeft();
   s.turnLeft();
   s.turnLeft();
   s.move();
   s.putBeeper();
   s.move();
   s.putBeeper();
   s.turnLeft();
   s.turnLeft();
   s.turnLeft();
    s.move();
   s.putBeeper();
   s.move();
   s.turnLeft();
   s.turnLeft();
  s.move();
   s.putBeeper();
   s.move();
   s.putBeeper();
   s.move();
   s.putBeeper();
   s.move();
   s.putBeeper();
   s.move();
   s.putBeeper();
   s.move();
   s.putBeeper();
   s.turnLeft();
   s.turnLeft();
  s.move();
  s.move();
  s.move();
  s.move();
  s.turnLeft();
  s.turnLeft();
   s.turnLeft();
  s.move();
  s.turnLeft();
  s.turnLeft();
   s.turnLeft();
   s.move();
   s.putBeeper();
   s.move();
   s.turnLeft();
   s.move();
   s.putBeeper();
   s.move();
   s.turnLeft();
  s.turnLeft();
   s.turnLeft();
   s.move();
   s.putBeeper();
   s.move();
   s.turnLeft();
   s.putBeeper();
   
  }
}