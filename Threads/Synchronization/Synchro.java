
public class Synchro extends Thread{

	public static void Print(int threads) {
	for(int x = 0; x < threads; x++)
	{
		
			System.out.println("Thread " + Thread.currentThread().getId() + " is on: " + (x+1) + " iterations. \n" );
		}
	}
	
	@Override
public void run(){
		
		//Demonstrating synchronization blocks
		synchronized(Synchro.class)
		{
			System.out.println("Thread " + Thread.currentThread().getId() + " has started. \n");
			Print(10);
			}
   } 

	public static void main(String[] args) {
		
		
		for(int i = 0; i < 3; i++)
		{
			new Synchro().start();
			
		}

	}

}

