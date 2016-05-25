import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;


public class MultiBall {
	private int x = 400;
	private int y = 24;
	private double dx = 0;
	private double dy = 0;
	private double gameDY = -75;			//HOW HIGH BALL BOUNCES ON PLATFORM. negative to shoot ball towards the top
	private int radius = 20;
	private Image i;			//sp and the private graphics below is to make a oval image to replace when its suppose to be flickering
	private Graphics doubleG;
	private double gravity = 15;
	private double energyloss = 1;
	private double dt = .2;
	private double xFriction = 0.9;
	
	
	public MultiBall() {
		// TODO Auto-generated constructor stub
	}
	public MultiBall(int i, int j) {
		// TODO Auto-generated constructor stub
		x = i;
		y = j;
	}
	
	
	
	public double getGameDY() {
		return gameDY;
	}
	public int getRadius() {				//return radius
		return radius;
	}
	public int getX() {				//bounce ball on platform
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
	public double getDx() {
		return dx;
	}
	public double getDy() {
		return dy;
	}
	public void setDx(double dx) {
		this.dx = dx;
	}
	public void setDy(double dy) {
		this.dy = dy;
	}
	public double getGravity() {
		return gravity;
	}
	public void setGravity(double gravity) {
		this.gravity = gravity;
	}
	
	
	
	public void moveRight(){	//USER CONTROL: RETURN
		if (dx + 1 < 20){			//slow ball down if reached 20
			dx += 1;				//add speed if ball havent reached 20
		}
	}
	public void moveLeft(){
		if (dx - 1 > -20){			//slow ball down if reached -20
			dx -= 1;				//add speed if ball havent reached -20
		}
	}
	
	
	
	
	public void update(MultiBallTwo sp){
	
		
		
			if(x + dx > sp.getWidth() - radius - 1){
				x = sp.getWidth() - radius -1;
				dx = -dx;		//make ball bounce off the wall 
			} if(x + dx < 0 + radius){
				x = 0 + radius;
				dx = - dx;			//bounce off another wall
			}else{
				x += dx;
			}
			
			if(y == sp.getHeight() - radius - 1){		//slow down the ball, even if it's rolling
				dx *= xFriction;
				if(Math.abs(dx) < .8){
					dx = 0;
				}
			}
			
			if(y > sp.getHeight() - radius - 1){		//if ball gets to bottom of applet(hits the ground)
				y = sp.getHeight() - radius - 1;
				dy *= energyloss;						//ball lose power the longer it bounces
				dy = gameDY;
			}else{									//if ball isn't at bottom of applet
				dy += gravity * dt;					//velocity formula
				y += dy * dt + .5 * gravity * dt * dt;		//position formula
			}
		}
		
	public void paint(Graphics g) {
		
		g.setColor(Color.BLUE);
		g.fillOval(x-radius, y-radius, radius*2, radius*2);
	}
	public void moveUp() {
		// TODO Auto-generated method stub
		
	}
}

	

