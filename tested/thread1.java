package tested;

public class thread1{
//thread interface
//	@Override
//	public void run() {
//		// TODO Auto-generated method stub
//		System.out.println("testing");
//	}
//	public static void main (String[] args) {
//	thread1 t1 = new thread1();
//	Thread th = new Thread(t1);
//	th.start();
//	}
	Runnable a = new Runnable() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			
		}
	};
	
	Thread t = new Thread(a);
	

}
