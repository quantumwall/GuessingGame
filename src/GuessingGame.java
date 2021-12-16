import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class GuessingGame extends JFrame {
	private JTextField txtGuess;
	private JLabel lblOutput;
	private int theNumber;
	public void checkGuess() {
		String guessText = txtGuess.getText();
		String message = "";
		int guess = Integer.parseInt(guessText);
		if (guess < theNumber) {
			message = guess + " is to low. Try again";
		} else if (guess > theNumber) {
			message = guess + " is to high. Try again";
		} else {
			message = guess + " is correct. You win!";
		}
		lblOutput.setText(message);
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
		txtGuess.setHorizontalAlignment(SwingConstants.RIGHT);
		txtGuess.setBounds(349, 135, 49, 19);
		getContentPane().add(txtGuess);
		txtGuess.setColumns(10);
		
		JButton btnNewButton = new JButton("Guess");
		btnNewButton.setBounds(171, 180, 117, 25);
		getContentPane().add(btnNewButton);
		
		lblOutput = new JLabel("Enter a number above and press Guess");
		lblOutput.setFont(new Font("FreeSerif", Font.ITALIC, 10));
		lblOutput.setHorizontalAlignment(SwingConstants.CENTER);
		lblOutput.setBounds(12, 228, 436, 15);
		getContentPane().add(lblOutput);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
