package uk³ady;

import karty.Figure;

public class Straight  extends Variant{
	
	private Figure highest;
	private Figure lowest;
	
	public Straight(int[] handID) {

		int index = findIndex(handID, 1, 1);
		highest = figures.getFigure(index);
		lowest = figures.getFigure(index+4);
	}

	@Override
	public String showVariant() {
		return "STRAIGHT od ["+highest.getCharFigure()+"] do ["+lowest.getCharFigure()+"]";
	}
	
}
