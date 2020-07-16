package okienko;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import karty.Default;

public class MyLabels {
	
	private ImageIcon leftChips = new ImageIcon(Default.PATH+"left_chips.jpg");
	private ImageIcon logo = new ImageIcon(Default.PATH+"logo.jpg");
	private ImageIcon rightChips = new ImageIcon(Default.PATH+"right_chips.png");
	private ImageIcon negreanu = new ImageIcon(Default.PATH+"negreanu.jpg");
	private ImageIcon dealer = new ImageIcon(Default.PATH+"dealer.jpg");
	
	private JLabel upLeftL = new JLabel(leftChips);
	private JLabel upMiddleL = new JLabel(logo);
	private JLabel upRightL = new JLabel(rightChips);
	private JLabel dealerL = new JLabel(dealer);
	private JLabel negreanuL = new JLabel(negreanu);
	
	public MyLabels(int frameLength, int frameHeight) {
		
		upLeftL.setBounds(0, 0, 200, 170);
		upMiddleL.setBounds((frameLength - 400) / 2, 0, 400, 60);
		upRightL.setBounds(frameLength - 220, 0, 200, 170);
		dealerL.setBounds((frameLength - 220) / 2, frameHeight / 2 - 295, 220, 220);
		negreanuL.setBounds(0, (frameHeight - 220) / 2, 220, 220);		
		
	}

	public JLabel getUpLeftL() {
		return upLeftL;
	}

	public JLabel getUpMiddleL() {
		return upMiddleL;
	}

	public JLabel getUpRightL() {
		return upRightL;
	}

	public JLabel getDealerL() {
		return dealerL;
	}

	public JLabel getNegreanuL() {
		return negreanuL;
	}
	
	

}
