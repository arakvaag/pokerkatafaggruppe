package no.decisive.kata.poker;

import java.util.List;

public class Poker {
	public static Resultat finnVinner(Haand haand1, Haand haand2) {
		Resultat resultat = new Resultat();

		List<Kort> korteneHaand1 = haand1.hentSynkendeSorterteKort();
		List<Kort> korteneHaand2 = haand2.hentSynkendeSorterteKort();

		for (int i = 0; i < korteneHaand1.size(); i++) {
			int compareResultat = korteneHaand1.get(i).compareTo(korteneHaand2.get(i));
			if (compareResultat != 0) {
				resultat.setVinnerhaand(compareResultat > 0 ? haand1 : haand2);
				break;
			}
		}

		return resultat;
	}
}
