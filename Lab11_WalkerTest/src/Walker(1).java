import java.awt.Image;
import java.awt.Graphics;

public class Walker
{
  public static final int PIXELS_PER_INCH = 6;
  private Foot leftFoot, rightFoot;
  private int stepLength;
  private int stepsCount;
  private CoordinateSystem coordinates;

  // Constructor
  public Walker(int x, int y, Image leftPic, Image rightPic)
  {
    leftFoot =  new Foot(x, y - PIXELS_PER_INCH * 4, leftPic);
    rightFoot = new Foot(x, y + PIXELS_PER_INCH * 4, rightPic);
    stepLength = PIXELS_PER_INCH * 18;
  }  

  // Returns the left foot
  public Foot getLeftFoot()
  {
    return leftFoot;
  }

  // Returns the right foot
  public Foot getRightFoot()
  {
    return rightFoot;
  }

  // Makes first step, starting with the left foot
  public void firstStep()
  {
    leftFoot.moveForward(stepLength);
    stepsCount = 1;
  }

  // Makes next step
  public void nextStep()
  {
    
     {
    	 if (stepsCount % 2 == 0)  {// if stepsCount is even
    	      leftFoot.moveForward(2 * stepLength);
    	    stepsCount++;
    	 
    	 
     
    } else{
    	 rightFoot.moveForward(2 * stepLength);

    	    stepsCount++;
    	// increment by 1
    }
     }
  }

  // Stops this walker (brings its feet together)
  public void stop()
  {
	    if (stepsCount % 2 == 1)  // if stepsCount is odd
	        
	        
	        rightFoot.moveForward(stepLength);

	      stepsCount++;  // increment by 1
	    } 

  // Returns the distance walked
  public int distanceTraveled()
  {
    return stepsCount * stepLength;
  }

  // Draws this walker
  public void draw(Graphics g)
  {
	  
	 // if(stepsCount% 2 == 1 )
	  leftFoot.draw(g);
	 // else
	  rightFoot.draw(g);

  }
}