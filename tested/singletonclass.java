package tested;


//className ref = new Constructor();
//Employee E1 = new Employee();
// singleton class :- create only one instance in class created in heap memory  -- no other way to create instance of created

//eager loading
// static method and instance method?-instance method need to called object when we called 
public class singletonclass {
	private static final singletonclass objs = new singletonclass() ;
	private singletonclass() {
		
	}
	
	public static singletonclass test() {
		return objs;
		
	}

}
