public class MethodOverloading {
	int a;
	
	public Integer area(int l,int b){
		a=l*b;
		return a;
	}
	public Integer area(int l,int b,int h){
		a=l*b*h;
		return a;
	}

	public static void main(String[] args) {
		MethodOverloading mo=new MethodOverloading();
		Integer a=mo.area(2, 3);
		System.out.println(a);
		Integer v=mo.area(5, 6, 7);
		System.out.println(v);

	}

}