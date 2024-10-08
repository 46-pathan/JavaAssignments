package multithreadingassignments;

//W.A.J. P to create one thread by implementing Runnable interface in 
//Class. 

public class RunnableInterface implements Runnable{

	public void run() {
		System.out.println("Thread is running");
	}
	
	public static void main(String[] args) {
		RunnableInterface r=new RunnableInterface();
		Thread thread=new Thread(r);
		thread.start();

	}

}
