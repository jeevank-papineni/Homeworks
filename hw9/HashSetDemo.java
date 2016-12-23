import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetDemo {
	public Set<Integer> hash(){
		Set<Integer> se=new HashSet<Integer>();
		se.add(1);
		se.add(2);
		se.add(6);
		se.add(4);
		se.add(5);
		return se;
		
		}
	
	public Set<Integer> tree(){
	Set<Integer> se=new TreeSet<Integer>();
	se.add(1);
	se.add(2);
	se.add(6);
	se.add(4);
	se.add(5);
	return se;
		
	}
	public Set<String> linked()
	{
		Set<String> se=new LinkedHashSet<String>();
		se.add("A");
		se.add("C");
		se.add("D");
		se.add("E");
		return se;
		
	}

	public static void main(String[] args) {
		HashSetDemo hs=new HashSetDemo();
		Set<Integer> hashsetdemo=hs.hash();
		System.out.println(hashsetdemo);
		Set<Integer> treesetdemo=hs.hash();
		System.out.println(treesetdemo);
		Set<String> linkedhashset=hs.linked();
		System.out.println(linkedhashset);
		
		

	}

}