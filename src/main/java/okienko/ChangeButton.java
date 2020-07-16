package okienko;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;

public class ChangeButton extends Button{
	
	private static final long serialVersionUID = 1L;
	Font menuFont = new Font("Times Roman", Font.BOLD, 20);

	public ChangeButton(int frameLength, int frameHeight) throws HeadlessException {
		super("CHANGE CARDS");
		setBounds((frameLength - 200) / 2, frameHeight / 2 - 72, 200, 80);
		setForeground(Color.BLUE);
		setFont(menuFont);
		setEnabled(false);
		setVisible(false);
	}
	
}
