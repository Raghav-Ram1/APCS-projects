import kareltherobot.*;

public class Main implements Directions{
  public static void main(String[] args) {
    World.setVisible(true);// allows us to see the run
    World.setSize(9,9);

    // The line below creates a Robot that we will refer to as r.  
    // Find out what the numbers and direction do!
    Robot r = new Robot(1,5,East,100);
    World.setDelay(5);
		
    // examples of commands you can invoke on a Robot
    for (int i=0; i<2; i++){
    r.putBeeper();
    r.move();
    r.turnLeft();
    r.move();
	r.putBeeper();
   r.putBeeper();
    r.move();
    r.turnLeft();
     r.turnLeft();
      r.turnLeft();
    r.move();
	r.putBeeper();
    }

     r.turnLeft();
      r.turnLeft();
      // gets the robot ready for the next part of the diamond 

  for (int i=0; i<2; i++){
    r.putBeeper();
    r.move();
    r.turnLeft();
     r.turnLeft();
      r.turnLeft();
    r.move();
	r.putBeeper();
   r.putBeeper();
    r.move();
    r.turnLeft();
    r.move();
	r.putBeeper();
  }

  r.turnLeft();
  
  

  for (int i=0; i<2; i++){
  r.putBeeper();
    r.move();
    r.turnLeft();
     r.turnLeft();
      r.turnLeft();
    r.move();
	r.putBeeper();
   r.putBeeper();
    r.move();
    r.turnLeft();
    r.move();
	r.putBeeper();  
      
  }

  r.turnLeft();


  for (int i=0; i<2; i++){
  r.putBeeper();
    r.move();
    r.turnLeft();
     r.turnLeft();
      r.turnLeft();
    r.move();
	r.putBeeper();
   r.putBeeper();
    r.move();
    r.turnLeft();
    r.move();
	r.putBeeper();  
  }

  

  
  

  }
}