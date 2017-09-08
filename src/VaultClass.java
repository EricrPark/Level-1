import javax.swing.JOptionPane;

public class VaultClass {
	int mycode;
	public boolean tryCode(int code){
		if(code==mycode) {
			return true;
		}
		else {
			return false;
		}
	}
	public VaultClass(int scode) {
		mycode = scode;
	}
}
