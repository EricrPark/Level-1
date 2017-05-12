
public class smurfRunner {
	public static void main(String[] args) {
		Smurf handy = new Smurf("Handy");
		Smurf Papa = new Smurf("Papa");
		Smurf Smurfette = new Smurf("Smurfette");
		System.out.println(handy.getName());
		handy.eat();
		System.out.println(Papa.getName());
		System.out.println(Papa.getHatColor());
		System.out.println(Papa.isGirlOrBoy());
		System.out.println(Smurfette.getName());
		System.out.println(Smurfette.getHatColor());
		System.out.println(Smurfette.isGirlOrBoy());
	}
}
