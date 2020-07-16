package karty;

import javax.swing.ImageIcon;

public enum Card {
	
	HA(Suit.HEART, Figure.ACE, new ImageIcon(Default.PATH_SMALL+"HA.jpg")),
	DA(Suit.DIAMOND, Figure.ACE, new ImageIcon(Default.PATH_SMALL+"DA.jpg")),
	SA(Suit.SPADES, Figure.ACE, new ImageIcon(Default.PATH_SMALL+"SA.jpg")),
	CA(Suit.CLUB, Figure.ACE, new ImageIcon(Default.PATH_SMALL+"CA.jpg")),
	HK(Suit.HEART, Figure.KING, new ImageIcon(Default.PATH_SMALL+"HK.jpg")),
	DK(Suit.DIAMOND, Figure.KING, new ImageIcon(Default.PATH_SMALL+"DK.jpg")),
	SK(Suit.SPADES, Figure.KING, new ImageIcon(Default.PATH_SMALL+"SK.jpg")),
	CK(Suit.CLUB, Figure.KING, new ImageIcon(Default.PATH_SMALL+"CK.jpg")),
	HQ(Suit.HEART, Figure.QUEEN, new ImageIcon(Default.PATH_SMALL+"HQ.jpg")),
	DQ(Suit.DIAMOND, Figure.QUEEN, new ImageIcon(Default.PATH_SMALL+"DQ.jpg")),
	SQ(Suit.SPADES, Figure.QUEEN, new ImageIcon(Default.PATH_SMALL+"SQ.jpg")),
	CQ(Suit.CLUB, Figure.QUEEN, new ImageIcon(Default.PATH_SMALL+"CQ.jpg")),
	HJ(Suit.HEART, Figure.JACK, new ImageIcon(Default.PATH_SMALL+"HJ.jpg")),
	DJ(Suit.DIAMOND, Figure.JACK, new ImageIcon(Default.PATH_SMALL+"DJ.jpg")),
	SJ(Suit.SPADES, Figure.JACK, new ImageIcon(Default.PATH_SMALL+"SJ.jpg")),
	CJ(Suit.CLUB, Figure.JACK, new ImageIcon(Default.PATH_SMALL+"CJ.jpg")),
	HT(Suit.HEART, Figure.TEN, new ImageIcon(Default.PATH_SMALL+"HT.jpg")),
	DT(Suit.DIAMOND, Figure.TEN, new ImageIcon(Default.PATH_SMALL+"DT.jpg")),
	ST(Suit.SPADES, Figure.TEN, new ImageIcon(Default.PATH_SMALL+"ST.jpg")),
	CT(Suit.CLUB, Figure.TEN, new ImageIcon(Default.PATH_SMALL+"CT.jpg")),
	H9(Suit.HEART, Figure.NINE, new ImageIcon(Default.PATH_SMALL+"H9.jpg")),
	D9(Suit.DIAMOND, Figure.NINE, new ImageIcon(Default.PATH_SMALL+"D9.jpg")),
	S9(Suit.SPADES, Figure.NINE, new ImageIcon(Default.PATH_SMALL+"S9.jpg")),
	C9(Suit.CLUB, Figure.NINE, new ImageIcon(Default.PATH_SMALL+"C9.jpg"));
	
	private Figure figure;
	private Suit suit;
	private ImageIcon icon;
	
	private Card(Suit suit, Figure figure , ImageIcon icon ) {
		this.figure = figure;
		this.suit = suit;
		this.icon = icon;
	}

	public int getRank() {
		return figure.getRank();
	}
	
	public Suit getSuit() {
		return suit;
	}
	
	public String getCard(){
		return "["+figure.getCharFigure()+" "+suit.getColour()+"]";
	}
	
	public ImageIcon getIcon(){
		return icon;
	}

}
