
public class harryPotterRunner {
	public static void main(String[] args) {
		// 1. make harry potter
		harryPotter harry = new harryPotter();
		// 2. become invisible
		harry.makeInvisible(true);
		// 3. spy on professor snape
		harry.spyOnSnape();
		// 4. become visible again
		harry.makeInvisible(false);
		// 5. cast a “stupefy” spell
		harry.castSpell("stupefy");
	}
}
