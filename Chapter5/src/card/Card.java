package card;

public class Card {
	
	private static int serialNum = 10001;
	private int cardNumber;
	
	public Card() {
		cardNumber = serialNum++;
	}
	
	public int getCardNumber() {
		return cardNumber;
	}
	
	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}

}
