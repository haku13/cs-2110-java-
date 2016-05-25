
public class ThreadIntro {
	public static void main(String arg[]) {
		
		//Tread can run at the same time
		
		Thread t = new Thread (){
			public void run(){
				
				for(int i = 0; i<10; i++){
				System.out.println("This is thread t ");
				try {
					sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				}
			}
		};
		t.start();
		
		Thread t2 = new Thread (){
			public void run(){
				
				for(int i = 0; i < 10; i++){
					System.out.println("This is thread t2 ");
					try {
						sleep(100);
					} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				}
			}
		};
		t2.start();
	}
}
