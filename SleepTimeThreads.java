package multithreadingassignments;

//W.A.J.P to create 2 threads and execute that threads by providing sleep time as 
//2000ms and check the execution. 

class MyThread extends Thread{
	String name;
	MyThread(String name){
		this.name=name;
	}
	
	public void run() {
		try {
			System.out.println(name+" thread is running");
			Thread.sleep(2000);
			System.out.println(name+" finished");
		}catch(InterruptedException e) {
			System.out.println(e);
		}
	}
}

public class SleepTimeThreads {

	public static void main(String[] args) {
		MyThread t1=new MyThread("T1");
		MyThread t2=new MyThread("T2");
		
		t1.start();
		t2.start();
	}

}
