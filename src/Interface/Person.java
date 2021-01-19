package Interface;

public class Person implements Student, YouTuber{

	@Override
	public void makeVideo() {
		System.out.println("Person makes Video");
		
	}

	@Override
	public void study() {
		System.out.println("Person loves studies");
		
	}

}
