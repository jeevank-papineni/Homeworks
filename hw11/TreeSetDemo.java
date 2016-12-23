import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
	public Set<String> Array2(){
		Set<String> set=new TreeSet<String>();
		set.add("A");
		set.add("B");
		set.add("C");
		set.add("D");
		return set;
		
	}

	public static void main(String[] args) {
		TreeSetDemo ts=new TreeSetDemo();
		        Set ts1 =ts.Array2();
		        System.out.println(ts1);

	}

}