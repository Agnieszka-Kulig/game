package uk�ady;

import karty.Figure;

public class Trips  extends Variant{
	
	private Figure trips;
	
	public Trips(int[] handID) {
		
		int index = findIndex(handID, 3, 1);
		trips = figures.getFigure(index);
		
	}

	@Override
	public String showVariant() {
		return "TR�JKA ["+trips.getCharFigure()+"]";
	}

}
