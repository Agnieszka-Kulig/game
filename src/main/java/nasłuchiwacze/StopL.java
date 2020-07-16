package nas³uchiwacze;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import okienko.OnePlayerGame;

public class StopL implements ActionListener {
	
	OnePlayerGame opg = new OnePlayerGame();
	
	public StopL(OnePlayerGame opg) {
		super();
		this.opg = opg;
	}

	public void actionPerformed(ActionEvent e) {
		opg.start.setEnabled(true);
		opg.stop.setEnabled(false);
		opg.change.setEnabled(false);
		opg.change.setVisible(false);
		opg.buttons.setBackIcons();
		opg.buttons.setDefaultPosition(opg.frameHeight);
		opg.variant.setText("");
	}
}
