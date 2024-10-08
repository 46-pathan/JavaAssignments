package multithreadingassignments;

//W.A.J. P to create one thread by extending Thread class in another Class. 

public class ThreadClass extends Thread{

	public void run() {
		System.out.println("Thread is running");
	}
	
	public static void main(String[] args) {
		ThreadClass thread=new ThreadClass();
		thread.start();

	}

}
