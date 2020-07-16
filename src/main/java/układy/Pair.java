package uk³ady;

import karty.Figure;

public class Pair extends Variant{
	
	private Figure pair;
	
	public Pair(int[] handID) {
		
		int index = findIndex(handID, 2, 1);
		pair = figures.getFigure(index);
			
	}
	
	@Override
	public String showVariant() {
		return "JEDNA PARA ["+ pair.getCharFigure()+"]";
	}

}
