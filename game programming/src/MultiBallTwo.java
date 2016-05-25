
	import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;


	public class MultiBallTwo  extends Applet implements Runnable,KeyListener{
		
		private Image i;			//this and the private graphics below is to make a oval image to replace when its suppose to be flickering
		private Graphics doubleG;
		MultiBall b, b2;
		Platform[] p = new Platform[7];				//do multiple platforms at once. to create just 2 platforms put p, p2
		Item item[] = new Item[3];
		
		@Override
		public void init() {
			setSize(800, 600);
			addKeyListener(this); 			//like button.addActionListener(this)
		}
		@Override
		public void start() {
			b = new MultiBall();
			b2 = new MultiBall(250,250);
			for (int i = 0; i < p.length; i++ ){ 				//MULTI PLATFORM
				Random r = new Random();
				p[i] = new Platform(getWidth() + 200 * i, getHeight() - 40 - r.nextInt(400));		//generate all 7 platform at width of applet (same x coordinate-->will be all on top of each other)
			}																	//+ 200 * i makes spaces between the platforms
			
			
			for (int i = 0; i < item.length; i++ ){ 				//MULTI PLATFORM
				Random r = new Random();
				item[i] = new GravityUp(getWidth() + 2000 * i );		//polymorphism: even tho it's an "item", define the object in each array as GravityUp item, cuz it extends to Item Class. //generate all 7 platform at width of applet (same x coordinate-->will be all on top of each other)
			}	
			
			
			
			
			//p2 = new Platform(100, 425); 			//p2 = new platform
			Thread thread = new Thread(this);
			thread.start();
		
			
		}
		@Override
		public void run() {
			//thread info for above thread method
			while (true){
			
				for (int i = 0; i < item.length; i++){
				if (item[i].getY() == this.getHeight() + 100){
					item[i] = null;
					item[i] = new GravityUp(getWidth());
				}
			}
			
				b.update(this);
				b2.update(this);
				
				for (int i = 0; i < p.length; i++){					//multi platform
					p[i].update(this, b);
				}
				for (int i = 0; i < item.length; i++){					//multi platform
					item[i].update(this, b);
					}
				
				//p2.update(this,  b);				//update for new platform p2, and compare to ball b
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
			b.paint(g);
			b2.paint(g);
			
			for (int i = 0; i < p.length; i++){				//multi platform
			p[i].paint(g);
			}
			for (int i = 0; i < item.length; i++){				//multi platform
				item[i].paint(g);
				}
			//p.paint(g);
			//p2.paint(g); 								//paint p2 so people can see the platform
		}
		
		
		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			switch(e.getKeyCode()){						//return an int of keyEvent thats pressed
			case KeyEvent.VK_LEFT:
				b.moveLeft();
				break;
			case KeyEvent.VK_RIGHT:
				b.moveRight();
				break;
			case KeyEvent.VK_A:
				b2.moveLeft();
				break;
			case KeyEvent.VK_D:
				b2.moveRight();
				break;
				
			}
		}
		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
		

	}

