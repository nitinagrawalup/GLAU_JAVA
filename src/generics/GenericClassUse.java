package generics;

public class GenericClassUse {

	public static void main(String[] args) {
		
		GenericClass<Integer> obj1 = new GenericClass<Integer>();
		GenericClass<String> obj2 = new GenericClass<String>();
		
		
		Integer k = 5;
		obj1.add(k);
		
		obj2.add("nitin");
		
		System.out.println("obj1 -->"+obj1.get());
		System.out.println("obj2 -->"+obj2.get());
	}

}
