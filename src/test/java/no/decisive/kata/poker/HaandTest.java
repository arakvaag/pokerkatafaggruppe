package no.decisive.kata.poker;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class HaandTest {

	@Test(expected = IllegalArgumentException.class)
	public void test_MaaVaere5KortIConstructorInput_NullInputFeiler() {
		new Haand(null);
	}

	@Test(expected = IllegalArgumentException.class)
	public void test_MaaVaere5KortIConstructorInput_4KortFeiler() {
		Collection<Kort> kortene = new ArrayList<Kort>();
		kortene.add(new Kort(Kort.Farge.HJERTER, Kort.Verdi.AATTE));
		kortene.add(new Kort(Kort.Farge.HJERTER, Kort.Verdi.AATTE));
		kortene.add(new Kort(Kort.Farge.HJERTER, Kort.Verdi.AATTE));
		kortene.add(new Kort(Kort.Farge.HJERTER, Kort.Verdi.AATTE));
		new Haand(kortene);
	}

	@Test
	public void test_MaaVaere5KortIConstructorInput_5KortOk() {
		Collection<Kort> kortene = new ArrayList<Kort>();
		kortene.add(new Kort(Kort.Farge.HJERTER, Kort.Verdi.AATTE));
		kortene.add(new Kort(Kort.Farge.HJERTER, Kort.Verdi.AATTE));
		kortene.add(new Kort(Kort.Farge.HJERTER, Kort.Verdi.AATTE));
		kortene.add(new Kort(Kort.Farge.HJERTER, Kort.Verdi.AATTE));
		kortene.add(new Kort(Kort.Farge.HJERTER, Kort.Verdi.AATTE));
		new Haand(kortene);
	}

	@Test(expected = IllegalArgumentException.class)
	public void test_MaaVaere5KortIConstructorInput_6KortFeiler() {
		Collection<Kort> kortene = new ArrayList<Kort>();
		kortene.add(new Kort(Kort.Farge.HJERTER, Kort.Verdi.AATTE));
		kortene.add(new Kort(Kort.Farge.HJERTER, Kort.Verdi.AATTE));
		kortene.add(new Kort(Kort.Farge.HJERTER, Kort.Verdi.AATTE));
		kortene.add(new Kort(Kort.Farge.HJERTER, Kort.Verdi.AATTE));
		kortene.add(new Kort(Kort.Farge.HJERTER, Kort.Verdi.AATTE));
		kortene.add(new Kort(Kort.Farge.HJERTER, Kort.Verdi.AATTE));
		new Haand(kortene);
	}

	@Test
	public void test_HentSynkendeSorterteKort() {
		List<Kort> kortInput = new ArrayList<Kort>();
		kortInput.add(new Kort(Kort.Farge.SPAR, Kort.Verdi.AATTE));
		kortInput.add(new Kort(Kort.Farge.HJERTER, Kort.Verdi.KNEKT));
		kortInput.add(new Kort(Kort.Farge.RUTER, Kort.Verdi.KONGE));
		kortInput.add(new Kort(Kort.Farge.KLOEVER, Kort.Verdi.TRE));
		kortInput.add(new Kort(Kort.Farge.HJERTER, Kort.Verdi.SEKS));
		Haand haand = new Haand(kortInput);

		List<Kort> returListe = haand.hentSynkendeSorterteKort();

		assertEquals(kortInput.get(2), returListe.get(0));
		assertEquals(kortInput.get(1), returListe.get(1));
		assertEquals(kortInput.get(0), returListe.get(2));
		assertEquals(kortInput.get(4), returListe.get(3));
		assertEquals(kortInput.get(3), returListe.get(4));
	}

}
