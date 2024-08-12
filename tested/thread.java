package tested;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class thread implements Runnable{
//public String name;
	
//	public thread(){
//		this.name="test";
//	}
//	public thread(String name){
//		this.name="test1";
//	}

@Override
public void run() {
	// TODO Auto-generated method stub
	System.out.println("test is running");
	
}


	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException{
	//thread t = new thread();//new method
		
	//thread t1= new thread("priya");//constructor parameter
		
//		Class c = Class.forName("thread");//new Instance without construor arguments
//		thread t = (thread) c.newInstance();
//		System.out.println(t.name);
		
//		Class.forName("thread");//new instance with contructor arguments
//		Constructor t = thread.class.getConstructor(String.class);
//		thread t1 = (thread) t.newInstance("testing");
		thread t1 = new thread();
//		t1.start();
		
		
	}
		
	
}
