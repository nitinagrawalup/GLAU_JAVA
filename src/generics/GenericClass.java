package generics;

public class GenericClass<T> {

	T i;
	public void add(T num) {
		i = num;
	}
	public T get() {
		return i;
	}
	
}
