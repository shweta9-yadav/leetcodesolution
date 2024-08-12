package tested;

interface factories{
	String getSymobol();
}
public class factorydesign implements factories{

	@Override
	public String getSymobol() {
		// TODO Auto-generated method stub
		return "factorydesign";
	}
	
}

class factorydesign2 implements factories{

	@Override
	public String getSymobol() {
		// TODO Auto-generated method stub
		return "factorydesign2";
	}
	
}
