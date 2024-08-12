package tested;

public class threadclass extends Thread{
	public void run() {
		System.out.println("testing");
	}
	public static void main (String[] args) {
		threadclass t = new threadclass();
		t.start();
	}

}
