package karty;

import java.util.HashMap;

public class Figures {
	
	private HashMap<Integer,Figure> figures = new HashMap<>();

	public Figures() {
		
		figures.put(Figure.ACE.getRank(), Figure.ACE);
		figures.put(Figure.KING.getRank(), Figure.KING);
		figures.put(Figure.QUEEN.getRank(), Figure.QUEEN);
		figures.put(Figure.JACK.getRank(), Figure.JACK);
		figures.put(Figure.TEN.getRank(), Figure.TEN);
		figures.put(Figure.NINE.getRank(), Figure.NINE);
	}
	
	public Figure getFigure(int rank){
		return figures.get(rank);
	}
	
	public int size(){
		return figures.keySet().size();
	}
	
}
