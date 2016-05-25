	import java.applet.Applet;
	import java.awt.Color;
	import java.awt.Graphics;
	import java.awt.Image;


	public class RealisticBall  extends Applet implements Runnable{
		
		int x = 400;
		int y = 24;
		double dx = 20;
		double dy = 0;
		int radius = 20;
		private Image i;			//this and the private graphics below is to make a oval image to replace when its suppose to be flickering
		private Graphics doubleG;
		double gravity = 9.8;
		double energyloss = 0.65;
		double dt = .2;
		double xFriction = 0.9;
		
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
				
				if(y ==this.getHeight() - radius - 1){		//slow down the ball, even if it's rolling
					dx *= xFriction;
					if(Math.abs(dx) < .8){
						dx = 0;
					}
				}
				
				if(y > this.getHeight() - radius - 1){		//if ball gets to bottom of applet(hits the ground)
					y = this.getHeight() - radius - 1;
					dy *= energyloss;						//ball lose power the longer it bounces
					dy = -dy;
				}else{									//if ball isn't at bottom of applet
					dy += gravity*dt;					//velocity formula
					y += dy*dt + .5*gravity*dt*dt;		//position formula
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
