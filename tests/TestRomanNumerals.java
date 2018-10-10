import static org.junit.Assert.*;

import org.junit.Test;

public class TestRomanNumerals {

	@Test
	public void test_one() {
		
		RomanNumerals romanNumerals = new RomanNumerals();
		
		String numeral = "I";
		
		assertEquals(1, romanNumerals.convertToInteger(numeral));
		
		//fail("Not yet implemented");
	}
	
	@Test
	public void test_two() {
		
		RomanNumerals romanNumerals = new RomanNumerals();
		
		String numeral = "II";
		
		assertEquals(2, romanNumerals.convertToInteger(numeral));
		
	}
	
	@Test
	public void test_three() {
		
		RomanNumerals romanNumerals = new RomanNumerals();
		
		String numeral = "III";
		
		assertEquals(3, romanNumerals.convertToInteger(numeral));
	}
	
	@Test
	public void test_four() {
		
		RomanNumerals romanNumerals = new RomanNumerals();
		
		String numeral = "IV";
		
		assertEquals(4, romanNumerals.convertToInteger(numeral));
	}
	
	@Test
	public void test_five() {
		
		RomanNumerals romanNumerals = new RomanNumerals();
		
		String numeral = "V";
		
		assertEquals(5, romanNumerals.convertToInteger(numeral));
	}
	
	@Test
	public void test_six() {
		
		RomanNumerals romanNumerals = new RomanNumerals();
		
		String numeral = "VI";
		
		assertEquals(6, romanNumerals.convertToInteger(numeral));
	}
	
	@Test
	public void test_seven() {
		
		RomanNumerals romanNumerals = new RomanNumerals();
		
		String numeral = "VII";
		
		assertEquals(7, romanNumerals.convertToInteger(numeral));
	}
	
	@Test
	public void test_nine() {
		
		RomanNumerals romanNumerals = new RomanNumerals();
		
		String numeral = "IX";
		
		assertEquals(9, romanNumerals.convertToInteger(numeral));
	}
	
	@Test
	public void test_ten() {
		
		RomanNumerals romanNumerals = new RomanNumerals();
		
		String numeral = "X";
		
		assertEquals(10, romanNumerals.convertToInteger(numeral));
	}
	
	@Test
	public void test_twenty() {
		
		RomanNumerals romanNumerals = new RomanNumerals();
		
		String numeral = "XX";
		
		assertEquals(20, romanNumerals.convertToInteger(numeral));
	}
	
	@Test
	public void test_fourty() {
		
		RomanNumerals romanNumerals = new RomanNumerals();
		
		String numeral = "XL";
		
		assertEquals(40, romanNumerals.convertToInteger(numeral));
	}
	
	@Test
	public void test_fifty() {
		
		RomanNumerals romanNumerals = new RomanNumerals();
		
		String numeral = "L";
		
		assertEquals(50, romanNumerals.convertToInteger(numeral));
	}
	
	@Test
	public void test_sixty() {
		
		RomanNumerals romanNumerals = new RomanNumerals();
		
		String numeral = "LX";
		
		assertEquals(60, romanNumerals.convertToInteger(numeral));
	}
	
	@Test
	public void test_ninty() {
		
		RomanNumerals romanNumerals = new RomanNumerals();
		
		String numeral = "XC";
		
		assertEquals(90, romanNumerals.convertToInteger(numeral));
	}
	
	@Test
	public void test_hundred() {
		
		RomanNumerals romanNumerals = new RomanNumerals();
		
		String numeral = "C";
		
		assertEquals(100, romanNumerals.convertToInteger(numeral));
	}
	
	@Test
	public void test_twohundred() {
		
		RomanNumerals romanNumerals = new RomanNumerals();
		
		String numeral = "CC";
		
		assertEquals(200, romanNumerals.convertToInteger(numeral));
	}
	
	@Test
	public void test_fourhundred() {
		
		RomanNumerals romanNumerals = new RomanNumerals();
		
		String numeral = "CD";
		
		assertEquals(400, romanNumerals.convertToInteger(numeral));
	}
	
	@Test
	public void test_fivehundred() {
		
		RomanNumerals romanNumerals = new RomanNumerals();
		
		String numeral = "D";
		
		assertEquals(500, romanNumerals.convertToInteger(numeral));
	}
	
	@Test
	public void test_ninehundred() {
		
		RomanNumerals romanNumerals = new RomanNumerals();
		
		String numeral = "CM";
		
		assertEquals(900, romanNumerals.convertToInteger(numeral));
	}
	
	@Test
	public void test_thousand() {
		
		RomanNumerals romanNumerals = new RomanNumerals();
		
		String numeral = "M";
		
		assertEquals(1000, romanNumerals.convertToInteger(numeral));
	}
	
	@Test
	public void test_1984() {
		
		RomanNumerals romanNumerals = new RomanNumerals();
		
		String numeral = "MCMLXXXIV";
		
		assertEquals(1984, romanNumerals.convertToInteger(numeral));
	}
	
	@Test
	public void test_2014() {
		
		RomanNumerals romanNumerals = new RomanNumerals();
		
		String numeral = "MMXIV";
		
		assertEquals(2014, romanNumerals.convertToInteger(numeral));
	}

}
