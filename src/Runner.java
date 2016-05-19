
public class Runner {
	public static void main(String[] args) {
		NotSmurf handy = new NotSmurf("Handy");
		NotSmurf Papa = new NotSmurf("Papa");
		NotSmurf Smurfette = new NotSmurf("Smurfette");
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
