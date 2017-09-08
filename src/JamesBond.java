
public class JamesBond {
	VaultClass myVault; 
	public JamesBond(VaultClass V) {
		this.myVault = V;
	}
	public int guessCode(){
		for (int i = 0; i < 2147483647; i++) {
		
			if(myVault.tryCode(i)==true){
				return i;
			}
			
		}
		return -1;
		
	}
}
