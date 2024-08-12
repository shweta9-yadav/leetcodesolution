package tested;

import java.util.concurrent.CompletableFuture;


class MyTask implements Runnable {
    public void run() {
        // Task logic here
        System.out.println(Thread.currentThread().getName() + " is executing the task.");
    }
}
public class threads {
	public static void main(String[] args) throws InterruptedException {
		// synchrounous 
		 Thread t5 = new Thread(new MyTask());
	        Thread t6 = new Thread(new MyTask());

	        t5.start();
	        t6.start();
		System.out.println("start t");
		task();
		System.out.println("end t");
		System.out.println("start t1");
		task1();
		System.out.println("end t1");
		
		CompletableFuture<Void> t1 = CompletableFuture.runAsync(()->{
			System.out.println("start t3");
			task3();
			System.out.println("end t3");
		});

		CompletableFuture<Void> t2 = CompletableFuture.runAsync(()->{
			System.out.println("start t4");
			task4();
			System.out.println("end t4");
		});
		
		   CompletableFuture<Void> allTasks = CompletableFuture.allOf(t1, t2);
	       allTasks.thenRun(() -> System.out.println("End"));
	       allTasks.join();
	}

	private static void task1() {
		try {
			Thread.sleep(200);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

	private static void task() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(500);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	
	//Asynchrounous :- can be run independently and multiple task can be start run execue stop 
	
	
	
	private static void task3() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	private static void task4() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	// concureent :- multiple task can be run simaltaneously 
	
	
	
	

}
