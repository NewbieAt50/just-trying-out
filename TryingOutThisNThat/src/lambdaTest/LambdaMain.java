package lambdaTest;


public class LambdaMain {
	static int a = 1, b =2;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LambdaFuncInterface lambdaFuncInterface = (x, y) ->  x + y; 
		
		Integer xx = lambdaFuncInterface.summer(a, b);
		
		System.out.println(xx);
		
		
		Person personX = new Person("Svend", 42);
		Person personY = new Person("Knud", 53);
		LambdaFuncInterface2 lambdaFuncInterface2 = (person1, person2) -> person1.getAge() > person2.getAge();
		
//		boolean xOlderThanY = lambdaFuncInterface2.olderThan(personX, personY);
		System.out.println(lambdaFuncInterface2.olderThan(personX, personY));
	

	}

}
