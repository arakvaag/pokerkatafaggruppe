package no.decisive.kata.poker;

public class Kort implements Comparable<Kort> {

	private Verdi verdi;

	@Override
	public int compareTo(Kort o) {
		return verdi.compareTo(o.verdi);
	}

	public enum Farge {SPAR, KLOEVER, RUTER, HJERTER}

	public enum Verdi {TO, TRE, FIRE, FEM, SEKS, SJU, AATTE, NI, TI, KNEKT, DAME, KONGE, ESS}

	public Kort(Farge farge, Verdi verdi) {
		if (farge == null || verdi == null)
			throw new IllegalArgumentException();

		this.verdi = verdi;
	}

}
