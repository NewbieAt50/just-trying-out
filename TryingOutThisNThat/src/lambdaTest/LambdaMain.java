package lambdaTest;

public class LambdaMain {
	Integer a =1;
	Integer b =2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LambdaFuncInterface lambdaFuncInterface = (x, y) ->  x + y; 
		
		Integer xx = lambdaFuncInterface.summer(2, 2);
		
		System.out.println(xx);
	

	}

}
