package genericsDemo;

public class GenericPair<T> {
	
	private final T first;
	private final T second;
	
	public GenericPair(T first, T second) {
		this.first = first;
		this.second = second;
	}

	public T getFirst() {
		return first;
	}

	public T getSecond() {
		return second;
	}

	@Override
	public String toString() {
		return "GenericPair [first=" + first + ", second=" + second + "]";
	}

}
