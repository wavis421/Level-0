import java.awt.event.MouseAdapter;

import java.awt.event.MouseEvent;

import java.io.File;

import java.net.MalformedURLException;

import java.net.URL;

import javax.swing.Icon;

import javax.swing.ImageIcon;

import javax.swing.JFrame;

import javax.swing.JLabel;

public class ThatWasEasy extends MouseAdapter {

	public void mouseClicked(MouseEvent arg0) {

		/* Use the speak method to make the button work. */
		//speak("that was easy");
		System.out.println("THAT WAS EASY!!");
	}

	private void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		new ThatWasEasy();

	}

	public ThatWasEasy() {
		showEasyButton();
		easyButtonImage.addMouseListener(this);

	}

	JLabel easyButtonImage;

	private void showEasyButton() {
		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);

		URL imageURL = null;
		try {
			//imageURL = new File("easy_button.jpg").toURI().toURL();
			imageURL = new File("c:/users/wendy/workspace/level 0/src/easy_button.jpg").toURI().toURL();
		} catch (MalformedURLException e) {
			System.err.println("Could not load file: " + imageURL);
		}

		Icon icon = new ImageIcon(imageURL);
		System.out.println("icon: " + icon);
		this.easyButtonImage = new JLabel(/*icon*/ "Press me!");
		quizWindow.add(easyButtonImage);
		quizWindow.pack();

	}

}

