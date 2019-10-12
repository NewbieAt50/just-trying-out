package helloWorldPackage;

public class Loops {

	public int forLoekke(int x) {
		int y;
		for (y=1;y<x;y+=2) {
			x++;
			}
		return x;
	}
	public int forLoekkeMedSwitch(int x) {
		int y;
		for (y=1;y<x;y+=2) {
			x++;
			switch(x) {
			case 10:
				System.out.println("Det var så ti");
				break;
			case 11:
				System.out.println("Nu er der 11");
				break;
			case 12:
				System.out.println("Wow, 12");
				break;
			default:
				System.out.println("Nej, nu er det for møj ... ");
				break;
			}
			}
		return x;
	}
}
