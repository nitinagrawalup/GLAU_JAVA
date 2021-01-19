package inheritance;

public class Multilevel_Inheritance {

	public static void main(String[] args) {
		
		Child c = new Child();
		c.setName("nitin");
		c.setAge(20);
		c.setProfession("Software Engineer");
		
		System.out.println("Name -->"+ c.getName());
		System.out.println("Age -->"+c.getAge());
		System.out.println("Profession -->"+c.getProfession());
		
		System.out.println("___________________");
		
		Father f = new Father();
		f.setName("nitin's father");
		f.setAge(45);
		/*
		f.setProfession("Software Engineer");
		*/
		System.out.println("Name -->"+ f.getName());
		System.out.println("Age -->"+f.getAge());
		/*
		System.out.println("Profession -->"+f.getProfession());
		*/
		System.out.println("___________________");
		
		Grandfather g = new Grandfather();
		g.setName("agrawalji");
		/*
		g.setAge(20);
		g.setProfession("Software Engineer");
		*/
		System.out.println("Name -->"+ g.getName());
		/*
		System.out.println("Age -->"+g.getAge());
		System.out.println("Profession -->"+g.getProfession());
		*/
		
	}

}
