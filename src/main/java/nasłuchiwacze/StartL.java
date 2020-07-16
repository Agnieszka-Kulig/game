package nas³uchiwacze;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import konsola.MyLine;
import okienko.OnePlayerGame;
import rozgrywka.Game;

public class StartL implements ActionListener {
	
	OnePlayerGame opg = new OnePlayerGame();
	
	public StartL(OnePlayerGame opg) {
		super();
		this.opg = opg;
	}

	public void actionPerformed(ActionEvent e) {
		opg.newGame = new Game();
		opg.setIcons();
		opg.variant.setText(MyLine.placeCenter("Twój uk³ad to : " + opg.newGame.getPlayer().showVariant(), 60));
		opg.change.setEnabled(true);
		opg.change.setVisible(true);
		opg.start.setEnabled(false);
		opg.stop.setEnabled(true);
		opg.buttons.setDefaultPosition(opg.frameHeight);
	}
}
