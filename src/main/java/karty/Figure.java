package karty;

public enum Figure {

	ACE(0, "A"), KING(1, "K"), QUEEN(2, "Q"), JACK(3, "J"), TEN(4, "T"), NINE(5, "9"),
	EIGHT(6, "8"), SEVEN(7, "7"), SIX(8, "6"), FIVE(9, "5"), FOUR(10, "4"), THREE(11, "3"), TWO(12, "2");

	private int rank;
	private String charFigure;

	private Figure(int rank, String charFigure) {
		this.charFigure = charFigure;
		this.rank = rank;
	}

	public int getRank() {
		return rank;
	}

	public String getCharFigure() {
		return charFigure;
	}

}
