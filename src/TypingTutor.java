


import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class TypingTutor implements KeyListener {
	char currentLetter = generateRandomLetter();
	JLabel jLabel = new JLabel(String.valueOf(currentLetter));
	JFrame frame = new JFrame();
	TypingTutor() {
		
		frame.setVisible(true);
		
		frame.add(jLabel);
		jLabel.setFont(jLabel.getFont().deriveFont(28.0f));
		jLabel.setHorizontalAlignment(JLabel.CENTER);
		frame.addKeyListener(this);
		jLabel.setOpaque(true);
		frame.pack();
	}
	public static void main (String[] args) {
		TypingTutor tut = new TypingTutor();
	}
	char generateRandomLetter() {
		Random r = new Random();
		return (char) (r.nextInt(26) + 'a');
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyChar() == (currentLetter)) {
			System.out.println("CORRECT");
			jLabel.setBackground(Color.green);
		}
		else {
			jLabel.setBackground(Color.red);
		}
		System.out.println("You typed: " + e.getKeyChar());
		showTypingSpeed(10);
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		currentLetter = generateRandomLetter();
		jLabel.setText(String.valueOf(currentLetter));
		
	}
	private void showTypingSpeed(int numberOfCorrectCharactersTyped) {
		Date timeAtEnd = new Date();
		long gameDuration = timeAtEnd.getTime() - timeAtStart.getTime();
		long gameInSeconds = (gameDuration / 1000) % 60;
		double charactersPerSecond = ((double) numberOfCorrectCharactersTyped / (double) gameInSeconds);
		int charactersPerMinute = (int) (charactersPerSecond * 60);
		JOptionPane.showMessageDialog(null, "Your typing speed is " + charactersPerMinute + " characters per minute.");
	}
	Date timeAtStart = new Date();

}