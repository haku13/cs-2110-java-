import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;


public class WebApplet extends Applet implements Runnable{
	
	int x = 400;
	int y = 24;
	double dx = 4;
	double dy = 2;
	int radius = 20;
	private Image i;			//this and the private graphics below is to make a oval image to replace when its suppose to be flickering
	private Graphics doubleG;
	
	@Override
	public void init() {
		setSize(800, 600);
	}
	@Override
	public void start() {
		Thread thread = new Thread(this);
		thread.start();
		
	}
	@Override
	public void run() {
		//thread info for above thread method
		while (true){
			if(x + dx > this.getWidth() - radius -1){
				x = this.getWidth() - radius -1;
				dx = -dx;		//make ball bounce off the wall 
			}if(x + dx < 0 + radius){
				x = 0 + radius;
				dx = - dx;			//bounce off another wall
			}
			else{
				x += dx;
			}
			
			if(y + dy > this.getHeight() - radius -1){
				y = this.getHeight() - radius -1;
				dy = -dy;		//make ball bounce off the wall 
			}if(y + dy < 0 + radius){
				y = 0 + radius;
				dy = -dy;			//bounce off another wall
			}
			else{
				y += dy;
			}
			repaint();		//repaint canvas and then sleep for 17 msec. USE UPDATE METHOD 
			try {			//try and sleep, if not(catch) printStackTrace
				Thread.sleep(17);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
	}
	@Override
	public void stop() {
		
		
	}
	@Override
	public void destroy() {
		
		
	}
	
	
	
	@Override				//to stop the circle from flickering-->double buffering 
	public void update(Graphics g) {
		if(i == null){
			i = createImage(this.getSize().width, this.getSize().height);
			doubleG = i.getGraphics();
		}
		
		doubleG.setColor(getBackground());	//background color
		doubleG.fillRect(0, 0, this.getSize().width, this.getSize().height);
		
		doubleG.setColor(getForeground());
		paint(doubleG);
		
		g.drawImage(i, 0, 0, this);
	}
	
	
	
	@Override
	public void paint(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillOval(x-radius, y-radius, radius*2, radius*2);
		
	}
	

}
