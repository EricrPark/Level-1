import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class SensitiveKeyboard implements KeyListener {
	
	JFrame frame = new JFrame();
	
	SensitiveKeyboard() {
		
		frame.addKeyListener(this);
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		SensitiveKeyboard sk = new SensitiveKeyboard();
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method 
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		speak("Ouch Ouch Ouch Ouch");
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("OWCH");
	}

	static void speak(String words) {
	  	 try {
	  		 Runtime.getRuntime().exec("say " + words).waitFor();
	  	 } catch (Exception e) {
	  		 e.printStackTrace();
	  	 }
	   }
}


