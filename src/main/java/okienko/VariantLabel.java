package okienko;

import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.Label;

public class VariantLabel extends Label{

	private static final long serialVersionUID = 1L;
	Font variantFont = new Font("Times Roman", Font.BOLD, 30);
	Color white = new Color(255, 250, 250);
	public VariantLabel(int frameLength, int frameHeight) throws HeadlessException {
		super();
		
		setFont(variantFont);
		setForeground(Color.BLACK);
		setBackground(white);
		setBounds((frameLength-750) / 2, frameHeight*9/10 , 750, 50);
		
	}
	
}
