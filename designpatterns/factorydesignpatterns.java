package designpatterns;
abstract class data1{
	public abstract void display();
}

class data2 extends data1{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("print data2");
	}
	
}
abstract class data3{
	public abstract data1 display1();
}

class factorydesignpatterns extends data3{

	@Override
	public data1 display1() {
		// TODO Auto-generated method stub
		return new data2();
	}



	
	

}
