package karty;

public enum Suit {
	
	SPADES("s" , 0), DIAMOND("d", 1), CLUB("c" , 2), HEART("h" , 3);
	
	private String colour;
	private int id;

	private Suit(String suit, int id) {
		this.colour = suit;
		this.id = id ;
	}

	public String getColour() {
		return colour;
	}
	
	public int getId(){
		return id;
	}

}
