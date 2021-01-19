package inheritance;

public class Hierarchical_Inheritance {

	public static void main(String[] args) {
		
		Shape s = new Shape();
		s.setSide(-1);
		System.out.println("Shape class -->"+ s.getSide());
		
		System.out.println("_________________");
		Rectangle r = new Rectangle();
		r.setSide(4);
		System.out.println("Shape class -->"+ r.getSide());
		r.printDescription();
		r.RectangleSide();
		System.out.println("_________________");
		Triangle t = new Triangle();
		t.setSide(3);
		System.out.println("Shape class -->"+ t.getSide());;
		t.printDescription();
		t.TriangleSide();
		System.out.println("_________________");
		Circle c = new Circle();
		c.setSide(0);
		System.out.println("Shape class -->"+ c.getSide());
		c.printDescription();
		c.CircleSide();
	}

}
