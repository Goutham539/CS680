package edu.umb.cs680.hw01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;



class PrimeGeneratorTest {

	@Test
	public void generatePrime_1To20() throws Exception {
		PrimeGenerator prime = new PrimeGenerator(1, 20);
		prime.generatePrimes();
		Long[] expectedNum = { 2L, 3L, 5L, 7L, 11L, 13L, 17L, 19L };
		assertArrayEquals(expectedNum, prime.getPrimes().toArray());

	}

	@Test
	public void primeGenerator_20To1() throws Exception {
		try {
			PrimeGenerator prime = new PrimeGenerator(20, 1);

		} catch (RuntimeException ex) {
			assertEquals("Wrong input values: from=20 to=1", ex.getMessage());
		}

	}

	@Test
	public void primeGenerator_negetiveTo1() throws Exception {
		try {
			PrimeGenerator prime = new PrimeGenerator(-10, 1);

		} catch (RuntimeException ex) {
			assertEquals("Wrong input values: from=-10 to=1", ex.getMessage());
		}

	}

	@Test
	public void primeGenerator_negetiveTonegetive() throws Exception {
		try {
			PrimeGenerator prime = new PrimeGenerator(-20, -1);

		} catch (RuntimeException ex) {
			assertEquals("Wrong input values: from=-20 to=-1", ex.getMessage());
		}

	}

	@Test
	public void primeGenerator_0To0() throws Exception {
		try {
			PrimeGenerator prime = new PrimeGenerator(0, 0);

		} catch (RuntimeException ex) {
			assertEquals("Wrong input values: from=0 to=0", ex.getMessage());
		}

	}

}