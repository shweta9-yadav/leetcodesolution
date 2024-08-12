package tested;
// multithreading is not working because two thread is simaltenousy working it dont work 
public class singletonlazy {
	private static volatile singletonlazy test = new singletonlazy();
	
	private singletonlazy() {
		
	}
	public static singletonlazy test1() {
		if(test==null) {
			synchronized (singletonlazy.class) {
				test = new singletonlazy();
			}
		}
		return test;
	}

}
