package arraysalgorithm;
import java.util.*;

public class test1 implements Cloneable{
	String name;
	List<String> hobies;
	   public test1(String name, List<String> hobies) {
	        this.name = name;
	        this.hobies = hobies;
	    }
	public String getName() {
		return name;
	}
//	public void setName(String name) {
//		this.name = name;
//	}
	public List<String> getHobies() {
		return hobies;
	}
//	public void setHobies(List<String> hobies) {
//		this.hobies = hobies;
//	}
	
	@Override
    public Object clone() throws CloneNotSupportedException {
        test1 clonedPerson = (test1) super.clone();
        // Deep copy for hobbies list
        clonedPerson.hobies = new ArrayList<>(this.hobies);
        return clonedPerson;
    }
	public static void main(String[] args) throws CloneNotSupportedException {
		List<String> hoby = new ArrayList<>();
		hoby.add("cricket");
		hoby.add("badminton");
		test1 t = new test1("shweta",hoby);
		test1 deepCopyPerson = (test1) t.clone();
		test1 t1 = new test1(t.getName(),t.getHobies());
		t1.getHobies().add("kho");
		deepCopyPerson.getHobies().add("Cooking");
		System.out.println(t.getName()+"--"+t.getHobies()+"----"+deepCopyPerson.getName()+"--"+deepCopyPerson.getHobies());

		//System.out.println(t.getName()+"--"+t.getHobies()+"----"+t1.getName()+"--"+t1.getHobies());
	}
	

}
