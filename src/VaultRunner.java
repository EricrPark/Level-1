
public class VaultRunner {
	public static void main(String[] args) {
		VaultClass V = new VaultClass(439089739);
		JamesBond jb = new JamesBond(V);
		
		System.out.println(jb.guessCode());
	}
}
