import java.awt.Frame;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class BodyPartQuiz {
	int score = 0;
	// Get 3 celebrity photos from the internet, save them to your computer, and fill
	// in their paths here. To get the path, right click on the image, and copy its Location.
	String firstImage = "/Users/league/Desktop/TS.jpg";
	String secondImage = "/Users/league/Desktop/YM.jpg";
	String thirdImage = "/Users/league/Desktop/DP.jpg";
	String fourthImage = "/Users/league/Desktop/AH.jpg";
	
	Frame window = new Frame();
	
	private void startQuiz() {
		// Set the size of the window so that you can only see part of the image.
		window.setSize(300, 200);	
		String name;
		// Make an int variable to hold the score.
		check("Trevor Story");
		// Use the method below to show the next image
		showNextImage();
		window.setSize(400, 300);
		check("Yadier Molina");
		showNextImage();
		window.setSize(500,250);
		check("Dustin Pedroia");
		showNextImage();
		window.setSize(500,250);
		check("Alexander Hamilton");
		// Show the score
		// .... repeat for all your images.....
		if(score == 4) {
			JOptionPane.showMessageDialog(null,"Nice Job 4/4");
		}
	}

	private void check(String name) {
		String reply = JOptionPane.showInputDialog("Who is this person?");
		if(reply.equalsIgnoreCase(name)) {
			score++;
		}
		else {
			JOptionPane.showMessageDialog(null,"YOU ARE WRONG!!!!!!!!!!!!!!");
		}
		JOptionPane.showMessageDialog(null,"Your score is: "+score);
	}

	public void showNextImage() {
		window.removeAll();
		window.add(getNextImage());
		window.pack();
	}

	public static void main(String[] args) {
		BodyPartQuiz quiz = new BodyPartQuiz();
		quiz.initializeGui();
		quiz.startQuiz();
	}

	private void initializeGui() {
		initializeImageList();
		imageIterator = imageList.iterator();
		window.setVisible(true);
		showNextImage();
	}

	private JLabel loadImage(String fileName) {
		Icon icon = new ImageIcon(fileName);
		JLabel image = new JLabel(icon);
		return image;
	}

	ArrayList<JLabel> imageList = new ArrayList<JLabel>();
	Iterator<JLabel> imageIterator;

	private void initializeImageList() {
		JLabel imageLabel = loadImage(firstImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(secondImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(thirdImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(fourthImage);
		imageList.add(imageLabel);
	}

	private JLabel getNextImage() {
		if (imageIterator.hasNext())
			return imageIterator.next();
		window.dispose();
		return new JLabel();
	}
}

