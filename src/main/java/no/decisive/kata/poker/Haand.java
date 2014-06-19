package no.decisive.kata.poker;

import java.util.*;
import java.util.stream.Collectors;

public class Haand {
	private final Collection<Kort> kort;

	public Haand(Collection<Kort> kort) {
		if (kort == null || kort.size() != 5)
			throw new IllegalArgumentException();
		this.kort = kort;
	}

	public List<Kort> hentSynkendeSorterteKort() {
		List<Kort> sorterteKort = new ArrayList<Kort>(kort);
		Collections.sort(sorterteKort);
		Collections.reverse(sorterteKort);
		return sorterteKort;
	}
}
