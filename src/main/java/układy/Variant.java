package uk³ady;

import karty.Figures;

public abstract class  Variant {
	
public Figures figures = new Figures();
	
	public abstract String showVariant();
	
	public static int findIndex(int[] handID, int number, int which) {
		int index = -1;
		int count = 0;
		while (count < which && index < handID.length - 1) {
			index++;
			if (handID[index] == number) {
				count++;
			}
		}
		return index;
	}
	
}
