package uk³ady;

import karty.Figure;

public class TwoPair  extends Variant{
	
	private Figure highPair;
	private Figure lowPair;
	
	public TwoPair(int[] handID) {
		
		int index = findIndex(handID, 2, 1);
		highPair = figures.getFigure(index);
		
		index = findIndex(handID, 2, 2);
		lowPair = figures.getFigure(index);
			
	}

	@Override
	public String showVariant() {
		return "DWIE PARY ["+highPair.getCharFigure()+"] na ["+lowPair.getCharFigure()+"]";
	}
	
}
