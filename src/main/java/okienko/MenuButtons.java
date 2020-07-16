package okienko;

import java.awt.Button;
import java.awt.Font;

public class MenuButtons {

	public Button[] buttons = new Button[2];

	private int lenght;
	private int height;

	Font menuFont = new Font("Times Roman", Font.BOLD, 20);

	public MenuButtons(int frameLength, int frameHeight) {
		this.lenght = frameLength / 8;
		this.height = frameHeight / 10;
		createButtons(frameLength, frameHeight);
	}

	private void createButtons(int frameLength, int frameHeight) {

		String[] text = { "START", "STOP" };

		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new Button(text[i]);
			buttons[i].setBounds(frameLength - 350 + i * frameLength / 8, (frameHeight + 300) / 2 + frameHeight / 10,
					lenght, height);
			buttons[i].setFont(menuFont);
		}
	}

	public Button get(int index) {
		return buttons[index];
	}

	public Button[] getAll() {
		return buttons;
	}

}
