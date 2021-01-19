package inheritance;

public class Single_Inheritance {

	public static void main(String[] args) {
			
		B obj1 = new B();
		
		obj1.setName("nitin");
		System.out.println("name --> " +obj1.getName());
		obj1.setRollno(21);
		System.out.println("rollno --> "+obj1.getRollno());
		
		
		System.out.println("______________________________");
		A obj2 = new B();
		/*
		obj2.setName("nitin"); //Error not accessible
		System.out.println("name --> " +obj2.getName()); // not accessible
		*/
		obj2.setRollno(21);
		System.out.println("rollno --> "+obj2.getRollno());


		System.out.println("______________________________");
		/*
		B obj3 = new A(); // Type mismatch Error: cannot convert from A to B
		obj3.setName("nitin");
		System.out.println("name --> " +obj3.getName());
		obj3.setRollno(21);
		System.out.println("rollno --> "+obj3.getRollno());
		*/
		System.out.println("______________________________");
		B obj4 = new B();
		obj4.setName("agrawalji");
		System.out.println("name --> " +obj4.getName());
		obj4.setRollno(22);
		System.out.println("rollno --> "+obj4.getRollno());
	}

}
