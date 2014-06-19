package no.decisive.kata.poker;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class KortTest {

	@Test(expected = IllegalArgumentException.class)
	public void test_MaaVaereFargeIConstructorInput() {
		new Kort(null, Kort.Verdi.AATTE);
	}

	@Test(expected = IllegalArgumentException.class)
	public void test_MaaVaereVerdiIConstructorInput() {
		new Kort(Kort.Farge.HJERTER, null);
	}

	@Test
	public void test_FargeOgVerdiIConstructorInput_OK() {
		new Kort(Kort.Farge.HJERTER, Kort.Verdi.DAME);
	}

	@Test
	public void Farge() {
		new Kort(Kort.Farge.HJERTER, Kort.Verdi.AATTE);
		new Kort(Kort.Farge.SPAR, Kort.Verdi.AATTE);
		new Kort(Kort.Farge.KLOEVER, Kort.Verdi.AATTE);
		new Kort(Kort.Farge.RUTER, Kort.Verdi.AATTE);
	}

	@Test
	public void testVerdi() {
		assertTrue(Kort.Verdi.TO.compareTo(Kort.Verdi.TRE) < 0);
		assertTrue(Kort.Verdi.TRE.compareTo(Kort.Verdi.FIRE) < 0);
		assertTrue(Kort.Verdi.FIRE.compareTo(Kort.Verdi.FEM) < 0);
		assertTrue(Kort.Verdi.FEM.compareTo(Kort.Verdi.SEKS) < 0);
		assertTrue(Kort.Verdi.SEKS.compareTo(Kort.Verdi.SJU) < 0);
		assertTrue(Kort.Verdi.SJU.compareTo(Kort.Verdi.AATTE) < 0);
		assertTrue(Kort.Verdi.AATTE.compareTo(Kort.Verdi.NI) < 0);
		assertTrue(Kort.Verdi.NI.compareTo(Kort.Verdi.TI) < 0);
		assertTrue(Kort.Verdi.TI.compareTo(Kort.Verdi.KNEKT) < 0);
		assertTrue(Kort.Verdi.KNEKT.compareTo(Kort.Verdi.DAME) < 0);
		assertTrue(Kort.Verdi.DAME.compareTo(Kort.Verdi.KONGE) < 0);
		assertTrue(Kort.Verdi.KONGE.compareTo(Kort.Verdi.ESS) < 0);
	}

	@Test
	public void test_CompareTo_VerdiSinCompareToAvgjoer() {
		assertTrue(new Kort(Kort.Farge.SPAR, Kort.Verdi.AATTE).compareTo(new Kort(Kort.Farge.HJERTER, Kort.Verdi.FEM)) > 0);
		assertTrue(new Kort(Kort.Farge.SPAR, Kort.Verdi.TO).compareTo(new Kort(Kort.Farge.HJERTER, Kort.Verdi.FEM)) < 0);
		assertTrue(new Kort(Kort.Farge.SPAR, Kort.Verdi.FEM).compareTo(new Kort(Kort.Farge.HJERTER, Kort.Verdi.FEM)) == 0);
	}
}
