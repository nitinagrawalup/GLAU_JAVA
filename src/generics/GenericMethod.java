package generics;

public class GenericMethod {
	
	public <E> void printArray(E []s) {
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i]);
		}
	}

}
