package no.decisive.kata.poker;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

public class PokerTest {

	@Test
	public void test_HaandHoytKort_HoyesteVerdiVinner() {
		Collection<Kort> kortene = new ArrayList<Kort>();
		kortene.add(new Kort(Kort.Farge.RUTER, Kort.Verdi.TRE));
		kortene.add(new Kort(Kort.Farge.HJERTER, Kort.Verdi.KONGE));
		kortene.add(new Kort(Kort.Farge.SPAR, Kort.Verdi.FEM));
		kortene.add(new Kort(Kort.Farge.HJERTER, Kort.Verdi.SJU));
		kortene.add(new Kort(Kort.Farge.KLOEVER, Kort.Verdi.TI));
		Haand haand1 = new Haand(kortene);

		kortene = new ArrayList<Kort>();
		kortene.add(new Kort(Kort.Farge.RUTER, Kort.Verdi.FIRE));
		kortene.add(new Kort(Kort.Farge.RUTER, Kort.Verdi.DAME));
		kortene.add(new Kort(Kort.Farge.KLOEVER, Kort.Verdi.FEM));
		kortene.add(new Kort(Kort.Farge.RUTER, Kort.Verdi.TI));
		kortene.add(new Kort(Kort.Farge.SPAR, Kort.Verdi.NI));
		Haand haand2 = new Haand(kortene);

		Resultat resultat = Poker.finnVinner(haand1, haand2);
		assertEquals(true, resultat.harVinner());
		assertEquals(haand1, resultat.getVinnerhaand());
	}

	@Test
	public void test_HaandHoytKort_IkkeHoyesteVerdiTaper() {
		Collection<Kort> kortene = new ArrayList<Kort>();
		kortene.add(new Kort(Kort.Farge.RUTER, Kort.Verdi.TRE));
		kortene.add(new Kort(Kort.Farge.HJERTER, Kort.Verdi.KNEKT));
		kortene.add(new Kort(Kort.Farge.SPAR, Kort.Verdi.FEM));
		kortene.add(new Kort(Kort.Farge.HJERTER, Kort.Verdi.SJU));
		kortene.add(new Kort(Kort.Farge.KLOEVER, Kort.Verdi.TI));
		Haand haand1 = new Haand(kortene);

		kortene = new ArrayList<Kort>();
		kortene.add(new Kort(Kort.Farge.RUTER, Kort.Verdi.FIRE));
		kortene.add(new Kort(Kort.Farge.RUTER, Kort.Verdi.DAME));
		kortene.add(new Kort(Kort.Farge.KLOEVER, Kort.Verdi.FEM));
		kortene.add(new Kort(Kort.Farge.RUTER, Kort.Verdi.TI));
		kortene.add(new Kort(Kort.Farge.SPAR, Kort.Verdi.NI));
		Haand haand2 = new Haand(kortene);

		Resultat resultat = Poker.finnVinner(haand1, haand2);
		assertEquals(true, resultat.harVinner());
		assertEquals(haand2, resultat.getVinnerhaand());
	}

	@Test
	public void test_HaandHoytKort_HoyesteVerdiLik_HoyereVerdiPaaNestHoyesteKortVinner() {
		Collection<Kort> kortene = new ArrayList<Kort>();
		kortene.add(new Kort(Kort.Farge.RUTER, Kort.Verdi.TRE));
		kortene.add(new Kort(Kort.Farge.HJERTER, Kort.Verdi.KONGE));
		kortene.add(new Kort(Kort.Farge.SPAR, Kort.Verdi.FEM));
		kortene.add(new Kort(Kort.Farge.HJERTER, Kort.Verdi.DAME));
		kortene.add(new Kort(Kort.Farge.KLOEVER, Kort.Verdi.TI));
		Haand haand1 = new Haand(kortene);

		kortene = new ArrayList<Kort>();
		kortene.add(new Kort(Kort.Farge.RUTER, Kort.Verdi.FIRE));
		kortene.add(new Kort(Kort.Farge.RUTER, Kort.Verdi.KONGE));
		kortene.add(new Kort(Kort.Farge.KLOEVER, Kort.Verdi.FEM));
		kortene.add(new Kort(Kort.Farge.RUTER, Kort.Verdi.TI));
		kortene.add(new Kort(Kort.Farge.SPAR, Kort.Verdi.NI));
		Haand haand2 = new Haand(kortene);

		Resultat resultat = Poker.finnVinner(haand1, haand2);
		assertEquals(true, resultat.harVinner());
		assertEquals(haand1, resultat.getVinnerhaand());
	}

	@Test
	public void test_HaandHoytKort_HoyesteVerdiLik_LavereVerdiPaaNestHoyesteKortTaper() {
		Collection<Kort> kortene = new ArrayList<Kort>();
		kortene.add(new Kort(Kort.Farge.RUTER, Kort.Verdi.TRE));
		kortene.add(new Kort(Kort.Farge.HJERTER, Kort.Verdi.DAME));
		kortene.add(new Kort(Kort.Farge.SPAR, Kort.Verdi.TI));
		kortene.add(new Kort(Kort.Farge.HJERTER, Kort.Verdi.SJU));
		kortene.add(new Kort(Kort.Farge.KLOEVER, Kort.Verdi.AATTE));
		Haand haand1 = new Haand(kortene);

		kortene = new ArrayList<Kort>();
		kortene.add(new Kort(Kort.Farge.RUTER, Kort.Verdi.FIRE));
		kortene.add(new Kort(Kort.Farge.RUTER, Kort.Verdi.DAME));
		kortene.add(new Kort(Kort.Farge.KLOEVER, Kort.Verdi.FEM));
		kortene.add(new Kort(Kort.Farge.RUTER, Kort.Verdi.KNEKT));
		kortene.add(new Kort(Kort.Farge.SPAR, Kort.Verdi.NI));
		Haand haand2 = new Haand(kortene);

		Resultat resultat = Poker.finnVinner(haand1, haand2);
		assertEquals(true, resultat.harVinner());
		assertEquals(haand2, resultat.getVinnerhaand());
	}

	@Test
	public void test_HaandHoytKort_LikeGodeVerdierPaaAlleKortene() {
		Collection<Kort> kortene = new ArrayList<Kort>();
		kortene.add(new Kort(Kort.Farge.RUTER, Kort.Verdi.TRE));
		kortene.add(new Kort(Kort.Farge.HJERTER, Kort.Verdi.KONGE));
		kortene.add(new Kort(Kort.Farge.SPAR, Kort.Verdi.FEM));
		kortene.add(new Kort(Kort.Farge.HJERTER, Kort.Verdi.DAME));
		kortene.add(new Kort(Kort.Farge.KLOEVER, Kort.Verdi.TI));
		Haand haand1 = new Haand(kortene);

		kortene = new ArrayList<Kort>();
		kortene.add(new Kort(Kort.Farge.RUTER, Kort.Verdi.TRE));
		kortene.add(new Kort(Kort.Farge.RUTER, Kort.Verdi.KONGE));
		kortene.add(new Kort(Kort.Farge.KLOEVER, Kort.Verdi.FEM));
		kortene.add(new Kort(Kort.Farge.RUTER, Kort.Verdi.DAME));
		kortene.add(new Kort(Kort.Farge.SPAR, Kort.Verdi.TI));
		Haand haand2 = new Haand(kortene);

		Resultat resultat = Poker.finnVinner(haand1, haand2);
		assertEquals(false, resultat.harVinner());
		assertEquals(null, resultat.getVinnerhaand());
	}

	@Test
	public void test_HaandEttPar_EttParBedreEnnHoytKort() {
		Collection<Kort> kortene = new ArrayList<Kort>();
		kortene.add(new Kort(Kort.Farge.RUTER, Kort.Verdi.TRE));
		kortene.add(new Kort(Kort.Farge.HJERTER, Kort.Verdi.KONGE));
		kortene.add(new Kort(Kort.Farge.SPAR, Kort.Verdi.TRE));
		kortene.add(new Kort(Kort.Farge.HJERTER, Kort.Verdi.DAME));
		kortene.add(new Kort(Kort.Farge.KLOEVER, Kort.Verdi.TI));
		Haand haand1 = new Haand(kortene);

		kortene = new ArrayList<Kort>();
		kortene.add(new Kort(Kort.Farge.RUTER, Kort.Verdi.TRE));
		kortene.add(new Kort(Kort.Farge.RUTER, Kort.Verdi.KONGE));
		kortene.add(new Kort(Kort.Farge.KLOEVER, Kort.Verdi.FEM));
		kortene.add(new Kort(Kort.Farge.RUTER, Kort.Verdi.DAME));
		kortene.add(new Kort(Kort.Farge.SPAR, Kort.Verdi.TI));
		Haand haand2 = new Haand(kortene);

		Resultat resultat = Poker.finnVinner(haand1, haand2);
		assertEquals(true, resultat.harVinner());
		assertEquals(haand1, resultat.getVinnerhaand());
	}
}
