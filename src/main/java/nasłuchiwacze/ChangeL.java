package nas³uchiwacze;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import konsola.MyLine;
import okienko.OnePlayerGame;

public class ChangeL implements ActionListener {
	
	OnePlayerGame opg = new OnePlayerGame();

	public ChangeL(OnePlayerGame opg) {
		super();
		this.opg = opg;
	}

	public void actionPerformed(ActionEvent e) {

		opg.newGame.getPlayer().replaceCards(opg.newGame.getDealer());
		opg.setIcons();
		opg.start.setEnabled(false);
		opg.stop.setEnabled(true);
		opg.buttons.setDefaultPosition(opg.frameHeight);
		opg.variant.setText(MyLine.placeCenter("Twój uk³ad to : " + opg.newGame.getPlayer().showVariant(), 60));
		opg.newGame.getPlayer().toChange = new boolean[5];
	}
}