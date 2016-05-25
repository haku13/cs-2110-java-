import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;


public class Item {
	
	private int x, y, dx, radius;
	private MultiBallTwo sp;
	
	public Item(int x) {
		// TODO Auto-generated constructor stub
		this.x = x;
		this.sp = sp;
		Random r = new Random();
		y = r.nextInt(400) +  radius;
		dx = -2;
		radius = 10;
		
	}
	
	

	public int getX() {
		return x;
	}



	public void setX(int x) {
		this.x = x;
	}



	public int getY() {
		return y;
	}



	public void setY(int y) {
		this.y = y;
	}



	public int getDx() {
		return dx;
	}



	public void setDx(int dx) {
		this.dx = dx;
	}



	public int getRadius() {
		return radius;
	}



	public void setRadius(int radius) {
		this.radius = radius;
	}



	public MultiBallTwo getSp() {
		return sp;
	}



	public void setSp(MultiBallTwo sp) {
		this.sp = sp;
	}



	public void update(MultiBallTwo sp, MultiBall b){
		x += dx;												//move to the left by position of dx		
		checkForCollision(b);
		if (x < 0 - radius){									//because its circle; radius on top
			Random r = new Random();						//dont want ball to be too consistent--> add randomness
			x = sp.getWidth() + 2000 + r.nextInt(300); 		//add random pixels
		}
		
	}
	
private void checkForCollision(MultiBall b) {		//(Y DIRECTION ONLY) ball only bounces off on the bottom
		// TODO Auto-generated method stub
		int ballX = b.getX();
		int ballY = b.getY();
		int ballR = b.getRadius();									//HAVE THE BALL HIT THE ITEM SPOT ON INSTEAD OF JUST 1 PIXEL
		
		int a = x - ballX;
		int bb = y - ballY;											//is bb because ball is b
		int collide = radius + ballR;
		double c = Math.sqrt((double)(a*a) + (double)(bb*bb));		//distance between objects' centers: a^22 + b^2 = c^2
		
		if(c < collide){					//if there is collision
			performAction(b);
			x = 0;
			y = sp.getHeight() + 100;		//below applet by 100 pixels
		}
		
		/*
		//if ball is within plateform, set up new DY, which is reverse of y speed right now
		if (ballY + radius > y&& ballY + radius < y + height){		//BOUNCES OFF OF Y DIRECTION
			if (ballX > x && ballX < x + width){	//BOUNCES OFF OF X DIRECTION
				double newDY = b.getGameDY();		//change direction of current y speed
				b.setDy(y - radius);				//put ball on top of platform
				b.setDy(newDY);
			}
			
		}
		*/
	}

public void performAction(MultiBall b) {
	// TODO Auto-generated method stub
	
}

public void paint(Graphics g) {
	
	//g.setColor(Color.GREEN);
	g.fillOval(x-radius, y-radius, radius*2, radius*2);				//because its a circle
}
}
