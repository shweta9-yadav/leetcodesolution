package designpatterns;

public class singletondesignpattern {
// used when only one object is created and shared it among them
	
	private static singletondesignpattern instance;
		private singletondesignpattern() {
			
		}
		public static singletondesignpattern getInstance() {
			if(instance==null) {
				synchronized(instance) {// double check 
					if(instance==null) {
						instance = new singletondesignpattern();
					}
				}
			}
			return instance;
			
		};
		
		
		
	
}
