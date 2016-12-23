import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListDemo {
	public List<String> Array()
	{
		List<String> li=new ArrayList<String>();
		li.add("jeevan");
		li.add("naveej");
		li.add("yuva");
		return li;
		}
	public List<String> linked(){
		List<String> ll=new LinkedList<String>();
		ll.add("A");
		ll.add("D");
		ll.add("B");
		return ll;
		
		
		
	}
	public static void main(String args[]){
		ArrayListDemo al=new ArrayListDemo();
		List<String> print=al.Array();
		System.out.println(print);
		List<String> pri=al.linked();
		pri.remove(2);
		System.out.println(pri);
		
	}

}