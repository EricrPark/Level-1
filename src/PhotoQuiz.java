
// Copyright Wintriss Technical Schools 2013
import java.awt.Component;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz implements ActionListener {

	public static void main(String[] args) throws Exception {

		Frame quizWindow = new Frame();
		quizWindow.setVisible(true);

		// 1. find an image on the internet, and put its URL in a String variable (from your browser, right click on the
		// image, and select “Copy Image URL”)
		String axe = "https://i.ytimg.com/vi/YIytTgy1Mcs/hqdefault.jpg";
		// 2. create a variable of type "Component" that will hold your image
		Component Pic;
		// quizWindow.addMouseMotionListener(quizWindow);
		// 3. use the "createImage()" method below to initialize your Component
		Pic = createImage(axe);
		// 4. add the image to the quiz window
		quizWindow.add(Pic);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		// 6. ask a question that relates to the image
		String question = JOptionPane.showInputDialog("Who is this image protraying?");
		// 7. print "CORRECT" if the user gave the right answer
		int counter = 0;
		if (question.contains("Axe")) {
			JOptionPane.showMessageDialog(null, "Correct");
			counter++;
		} else {
			JOptionPane.showMessageDialog(null, "Incorrect");
			counter--;
		}
		// 8. print "INCORRECT" if the answer is wrong
		quizWindow.remove(Pic);
		// 9. remove the component from the quiz window (you may not see the effect of this until step 12)
		String orc = "http://i3.ytimg.com/vi/kIW3AXDCdFM/mqdefault.jpg";
		// 3. use the "createImage()" method below to initialize your Component
		Pic = createImage(orc);
		// 4. add the image to the quiz window
		quizWindow.add(Pic);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		// 6. ask a question that relates to the image
		question = JOptionPane.showInputDialog("What is this image protraying?");
		// 7. print "CORRECT" if the user gave the right answer;
		if (question.contains("orc")) {
			JOptionPane.showMessageDialog(null, "Correct");
			counter++;
		} else {
			JOptionPane.showMessageDialog(null, "Incorrect");
			counter--;
		}
		quizWindow.remove(Pic);
		// 9. remove the component from the quiz window (you may not see the effect of this until step 12)
		String randomPic = "https://lh3.googleusercontent.com/proxy/Wd4Iolxc5i1UNBCHIta0FN_nzDIZnUeMlH-ld9PK_NrOG9SD1C2kbLo6BMGOCNBYCfRH_tMx-r11xsPAO9xVCRkeTaM=w426-h240-n";
		// 3. use the "createImage()" method below to initialize your Component
		Pic = createImage(randomPic);
		// 4. add the image to the quiz window
		quizWindow.add(Pic);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		// 6. ask a question that relates to the image
		question = JOptionPane.showInputDialog("What is this image protraying?");
		// 7. print "CORRECT" if the user gave the right answer;
		if (question.contains("Jack Sparrow riding Toothless")) {
			JOptionPane.showMessageDialog(null, "Correct");
			counter++;
		} else {
			JOptionPane.showMessageDialog(null, "Incorrect");
			counter--;
		}
		quizWindow.remove(Pic);
		// 9. remove the component from the quiz window (you may not see the effect of this until step 12)
		String robot = "https://i.ytimg.com/vi/Xp-DstHmgfw/maxresdefault.jpg";
		// 3. use the "createImage()" method below to initialize your Component
		Pic = createImage(robot);
		// 4. add the image to the quiz window
		quizWindow.add(Pic);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		// 6. ask a question that relates to the image
		question = JOptionPane.showInputDialog("What is this image protraying?");
		// 7. print "CORRECT" if the user gave the right answer;
		if (question.contains("sci-fi robot")) {
			JOptionPane.showMessageDialog(null, "Correct");
			counter++;
		} else {
			JOptionPane.showMessageDialog(null, "Incorrect");
			counter--;
		}
		quizWindow.remove(Pic);
		// 9. remove the component from the quiz window (you may not see the effect of this until step 12)
		String darthjarjar = "https://i.ytimg.com/vi/UW8YaZX_0UQ/maxresdefault.jpg";
		// 3. use the "createImage()" method below to initialize your Component
		Pic = createImage(darthjarjar);
		// 4. add the image to the quiz window
		quizWindow.add(Pic);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		// 6. ask a question that relates to the image
		question = JOptionPane.showInputDialog("Who is this image protraying?");
		// 7. print "CORRECT" if the user gave the right answer;
		if (question.contains("Darth Jar Jar")) {
			JOptionPane.showMessageDialog(null, "Correct");
			counter++;
		} else {
			JOptionPane.showMessageDialog(null, "Incorrect");
			counter--;
		}
		quizWindow.remove(Pic);
		// 9. remove the component from the quiz window (you may not see the effect of this until step 12)
		String JohnCena = "https://i.ytimg.com/vi/vfirfxxPEqw/maxresdefault.jpg";
		// 3. use the "createImage()" method below to initialize your Component
		Pic = createImage(JohnCena);
		// 4. add the image to the quiz window
		quizWindow.add(Pic);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		// 6. ask a question that relates to the image
		question = JOptionPane.showInputDialog("Who is this image protraying?");
		// 7. print "CORRECT" if the user gave the right answer;
		if (question.contains("John Cena")) {
			JOptionPane.showMessageDialog(null, "Correct");
			counter++;
		} else {
			JOptionPane.showMessageDialog(null, "Incorrect");
			counter--;
		}
		quizWindow.remove(Pic);
		// 9. remove the component from the quiz window (you may not see the effect of this until step 12)
		String SkeletalDragon = "http://www.freedrama.video/thumbnail/ArDUjj6cYpQ/mqdefault.jpg";
		// 3. use the "createImage()" method below to initialize your Component
		Pic = createImage(SkeletalDragon);
		// 4. add the image to the quiz window
		quizWindow.add(Pic);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		// 6. ask a question that relates to the image
		question = JOptionPane.showInputDialog("What is this image protraying?");
		// 7. print "CORRECT" if the user gave the right answer;
		if (question.contains("Skeletal Dragon")) {
			JOptionPane.showMessageDialog(null, "Correct");
			counter++;
		} else {
			JOptionPane.showMessageDialog(null, "Incorrect");
			counter--;
		}
		quizWindow.remove(Pic);
		// 9. remove the component from the quiz window (you may not see the effect of this until step 12)
		String Ursa = "http://media.steampowered.com/apps/dota2/posts/news/ursa_announce.jpg";
		// 3. use the "createImage()" method below to initialize your Component
		Pic = createImage(Ursa);
		// 4. add the image to the quiz window
		quizWindow.add(Pic);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		// 6. ask a question that relates to the image
		question = JOptionPane.showInputDialog("Who is this image protraying?");
		// 7. print "CORRECT" if the user gave the right answer;
		if (question.contains("Ursa")) {
			JOptionPane.showMessageDialog(null, "Correct");
			counter++;
		} else {
			JOptionPane.showMessageDialog(null, "Incorrect");
			counter--;
		}
		// 10. find another image and create it (might take more than one line of code)

		// 11. add the second image to the quiz window

		// 12. pack the quiz window

		// 13. ask another question

		// 14+ check answer, say if correct or incorrect, etc.
		/* OPTIONAL */
		// *14. add scoring to your quiz
		JOptionPane.showMessageDialog(null, "Your score: " + counter + " points");
		// *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener())

	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("hi");
	}

}
