package no.decisive.kata.poker;

public class Resultat {
	private Haand vinnerhaand;

	public Haand getVinnerhaand() {
		return vinnerhaand;
	}

	public void setVinnerhaand(Haand vinnerhaand) {
		this.vinnerhaand = vinnerhaand;
	}

	public boolean harVinner() {
		return vinnerhaand != null;
	}
}
