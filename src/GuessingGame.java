import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class GuessingGame extends JFrame {
	private JTextField txtGuess;
	private JLabel lblOutput;
	private int theNumber;
	public void checkGuess() {
		String guessText = txtGuess.getText();
		String message = "";
		try {
			int guess = Integer.parseInt(guessText);
			if (guess < theNumber) {
				message = guess + " is to low. Try again";
			} else if (guess > theNumber) {
				message = guess + " is to high. Try again";
			} else {
				message = guess + " is correct. You win! Let's play again";
				newGame();
			}
		} catch (Exception e) {
			message = "Enter a whole number between 1 and 100";
		} finally {
			lblOutput.setText(message);
			txtGuess.requestFocus();
			txtGuess.selectAll();
		}
	}
	public void newGame() {
		theNumber = (int)(Math.random() * 100 + 1);
	}
	public GuessingGame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Artem HiLo Guessing game");
		getContentPane().setLayout(null);

		JLabel lblArtemGuessingGame = new JLabel("Artem Guessing game");
		lblArtemGuessingGame.setFont(new Font("Liberation Serif", Font.BOLD | Font.ITALIC, 16));
		lblArtemGuessingGame.setHorizontalAlignment(SwingConstants.CENTER);
		lblArtemGuessingGame.setVerticalAlignment(SwingConstants.BOTTOM);
		lblArtemGuessingGame.setBounds(52, 55, 346, 27);
		getContentPane().add(lblArtemGuessingGame);

		JLabel lblGuessANumber = new JLabel("Guess a number between 1 and 100:");
		lblGuessANumber.setHorizontalAlignment(SwingConstants.CENTER);
		lblGuessANumber.setBounds(52, 137, 279, 15);
		getContentPane().add(lblGuessANumber);

		txtGuess = new JTextField();
		txtGuess.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent eTXT) {
				checkGuess();
			}
		});
		txtGuess.setHorizontalAlignment(SwingConstants.RIGHT);
		txtGuess.setBounds(349, 135, 49, 19);
		getContentPane().add(txtGuess);
		txtGuess.setColumns(10);

		JButton btnNewButton = new JButton("Guess");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkGuess();
			}
		});
		btnNewButton.setBounds(171, 180, 117, 25);
		getContentPane().add(btnNewButton);

		lblOutput = new JLabel("Enter a number above and press Guess");
		lblOutput.setFont(new Font("FreeSerif", Font.BOLD, 13));
		lblOutput.setHorizontalAlignment(SwingConstants.CENTER);
		lblOutput.setBounds(12, 228, 436, 15);
		getContentPane().add(lblOutput);
	}

	public static void main(String[] args) {
		GuessingGame game = new GuessingGame();
		game.newGame();
		game.setSize(new Dimension(450, 350));
		game.setVisible(true);

	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
