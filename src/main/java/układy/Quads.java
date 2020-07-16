package uk³ady;

import karty.Figure;

public class Quads  extends Variant {
	
	private Figure four;
	
	public Quads(int[] handID) {
		
		int index = findIndex(handID, 4, 1);
		four = figures.getFigure(index);
	}


	@Override
	public String showVariant() {
		return "KARETA ["+four.getCharFigure()+"]";
	}

}
