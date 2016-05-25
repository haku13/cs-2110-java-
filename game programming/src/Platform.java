import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;


public class Platform {
	
	private int dx;
	private int x, y, width, height;
	
	public Platform(){				//below is structure of platform
		dx = -1;					//-1 to slow platform speed
		x = 300;
		y = 200;
		width = 130;
		height = 30;
	}
	
	public Platform(int x, int y){		//new way to construct platform
		this.x = x;
		this.y = y;
		width = 120;
		height = 30;
		dx = -1;						//makes ball moves slower
	}
	
	public void update(MultiBallTwo sp, MultiBall b){
		x += dx;										//move to the left by dx
		checkForCollision(b);
		if (x < 0 - width){
			Random r = new Random();				//dont want ball to be too consistent--> add randomness
			y = sp.getHeight() - 40 - r.nextInt(400);
			x = sp.getWidth() + r.nextInt(300); 	//add random pixels
		}
		
	}
	
private void checkForCollision(MultiBall b) {		//(Y DIRECTION ONLY) ball only bounces off on the bottom
		// TODO Auto-generated method stub
		int ballX = b.getX();
		int ballY = b.getY();
		int radius = b.getRadius();
		
		
		//if ball is within plateform, set up new DY, which is reverse of y speed right now
		if(ballY + radius > y&& ballY + radius < y + height){		//BOUNCES OFF OF Y DIRECTION
			if (ballX > x && ballX < x + width){	//BOUNCES OFF OF X DIRECTION
				double newDY = b.getGameDY();		//change direction of current y speed
				b.setDy(y - radius);				//put ball on top of platform
				b.setDy(newDY);
			}
			
		}
	}

public void paint(Graphics g) {
	
	g.setColor(Color.GREEN);
	g.fillRect(x, y, width, height);
}

public void moveUp() {
	// TODO Auto-generated method stub
	
}
}


