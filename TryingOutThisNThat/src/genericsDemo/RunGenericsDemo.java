package genericsDemo;

import java.util.Arrays;
import java.util.List;

public class RunGenericsDemo {

	public static void main(String[] args) {
		GenericPair<String> strings = new GenericPair<String>("Hej", "verden");
		GenericPair<Integer> integers = new GenericPair<Integer>(42, 113);
		System.out.println(strings);
		System.out.println(integers);
		
		List<Integer> number = Arrays.asList(2,3,4,5);
		number.stream().map(x->x*x).forEach(y->System.out.println(y));
	}

}
