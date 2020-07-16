package nas³uchiwacze;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import okienko.OnePlayerGame;

public class PickCard implements ActionListener {
	int index;
	OnePlayerGame opg = new OnePlayerGame();

	public PickCard(int i, OnePlayerGame opg) {
		index = i;
		this.opg = opg;
	}

	public void actionPerformed(ActionEvent e) {

		int X = opg.buttons.get(index).getLocation().x;
		int Y = opg.buttons.get(index).getLocation().y;
		if (Y == (opg.frameHeight + 300) / 2) {
			opg.newGame.getPlayer().toChange[index] = true;
			opg.buttons.get(index).setLocation(X, Y - 60);
		} else {
			opg.newGame.getPlayer().toChange[index] = false;
			opg.buttons.get(index).setLocation(X, (opg.frameHeight + 300) / 2);
		}
	}
}
