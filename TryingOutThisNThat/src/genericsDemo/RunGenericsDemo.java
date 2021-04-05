package genericsDemo;

public class RunGenericsDemo {

	public static void main(String[] args) {
		GenericPair<String> strings = new GenericPair<String>("Hej", "verden");
		GenericPair<Integer> integers = new GenericPair<Integer>(42, 113);
		System.out.println(strings);
		System.out.println(integers);
	}

}
