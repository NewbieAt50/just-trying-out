package helloWorldPackage;

public class HelloWorld {
	static HelloCounter counter = new HelloCounter();
	static Loops loop = new Loops();
	static Tabel tabel = new Tabel();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("Hello World");
//		System.out.println(counter.getNumber());
//		counter.increaseNumber();
//		System.out.println(counter.getNumber());
		System.out.println(loop.forLoekke(10));
		System.out.println(loop.forLoekkeMedSwitch(10));
		tabel.printNavne();
	}
}
