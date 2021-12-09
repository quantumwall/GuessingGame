import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class GuessingGame extends JFrame {
	private JTextField textField;
	public GuessingGame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Artem HiLo Guessing game");
		getContentPane().setLayout(null);
		
		JLabel lblArtemGuessingGame = new JLabel("Artem Guessing game");
		lblArtemGuessingGame.setFont(new Font("Liberation Serif", Font.BOLD | Font.ITALIC, 16));
		lblArtemGuessingGame.setHorizontalAlignment(SwingConstants.CENTER);
		lblArtemGuessingGame.setVerticalAlignment(SwingConstants.BOTTOM);
		lblArtemGuessingGame.setBounds(52, 12, 346, 27);
		getContentPane().add(lblArtemGuessingGame);
		
		JLabel lblGuessANumber = new JLabel("Guess a number between 1 and 100:");
		lblGuessANumber.setHorizontalAlignment(SwingConstants.CENTER);
		lblGuessANumber.setBounds(52, 88, 279, 15);
		getContentPane().add(lblGuessANumber);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(349, 86, 49, 19);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Guess");
		btnNewButton.setBounds(171, 180, 117, 25);
		getContentPane().add(btnNewButton);
		
		JLabel lblEnterANumber = new JLabel("Enter a number above and press Guess");
		lblEnterANumber.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnterANumber.setBounds(12, 240, 436, 15);
		getContentPane().add(lblEnterANumber);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
