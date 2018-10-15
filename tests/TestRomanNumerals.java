import static org.junit.Assert.*;

import org.junit.Test;

public class TestRomanNumerals {

	@Test
	public void test_1() {
		
		RomanNumerals romanNumerals = new RomanNumerals();
		
		String numeral = "I";
		
		assertEquals(1, romanNumerals.convertToInteger(numeral));
		
	}
	
	@Test
	public void test_2() {
		
		RomanNumerals romanNumerals = new RomanNumerals();
		
		String numeral = "II";
		
		assertEquals(2, romanNumerals.convertToInteger(numeral));
		
	}
	
	@Test
	public void test_3() {
		
		RomanNumerals romanNumerals = new RomanNumerals();
		
		String numeral = "III";
		
		assertEquals(3, romanNumerals.convertToInteger(numeral));
	}
	
	@Test
	public void test_4() {
		
		RomanNumerals romanNumerals = new RomanNumerals();
		
		String numeral = "IV";
		
		assertEquals(4, romanNumerals.convertToInteger(numeral));
	}
	
	@Test
	public void test_5() {
		
		RomanNumerals romanNumerals = new RomanNumerals();
		
		String numeral = "V";
		
		assertEquals(5, romanNumerals.convertToInteger(numeral));
	}
	
	@Test
	public void test_6() {
		
		RomanNumerals romanNumerals = new RomanNumerals();
		
		String numeral = "VI";
		
		assertEquals(6, romanNumerals.convertToInteger(numeral));
	}
	
	@Test
	public void test_7() {
		
		RomanNumerals romanNumerals = new RomanNumerals();
		
		String numeral = "VII";
		
		assertEquals(7, romanNumerals.convertToInteger(numeral));
	}
	
	@Test
	public void test_9() {
		
		RomanNumerals romanNumerals = new RomanNumerals();
		
		String numeral = "IX";
		
		assertEquals(9, romanNumerals.convertToInteger(numeral));
	}
	
	@Test
	public void test_10() {
		
		RomanNumerals romanNumerals = new RomanNumerals();
		
		String numeral = "X";
		
		assertEquals(10, romanNumerals.convertToInteger(numeral));
	}
	
	@Test
	public void test_20() {
		
		RomanNumerals romanNumerals = new RomanNumerals();
		
		String numeral = "XX";
		
		assertEquals(20, romanNumerals.convertToInteger(numeral));
	}
	
	@Test
	public void test_40() {
		
		RomanNumerals romanNumerals = new RomanNumerals();
		
		String numeral = "XL";
		
		assertEquals(40, romanNumerals.convertToInteger(numeral));
	}
	
	@Test
	public void test_50() {
		
		RomanNumerals romanNumerals = new RomanNumerals();
		
		String numeral = "L";
		
		assertEquals(50, romanNumerals.convertToInteger(numeral));
	}
	
	@Test
	public void test_60() {
		
		RomanNumerals romanNumerals = new RomanNumerals();
		
		String numeral = "LX";
		
		assertEquals(60, romanNumerals.convertToInteger(numeral));
	}
	
	@Test
	public void test_90() {
		
		RomanNumerals romanNumerals = new RomanNumerals();
		
		String numeral = "XC";
		
		assertEquals(90, romanNumerals.convertToInteger(numeral));
	}
	
	@Test
	public void test_100() {
		
		RomanNumerals romanNumerals = new RomanNumerals();
		
		String numeral = "C";
		
		assertEquals(100, romanNumerals.convertToInteger(numeral));
	}
	
	@Test
	public void test_200() {
		
		RomanNumerals romanNumerals = new RomanNumerals();
		
		String numeral = "CC";
		
		assertEquals(200, romanNumerals.convertToInteger(numeral));
	}
	
	@Test
	public void test_400() {
		
		RomanNumerals romanNumerals = new RomanNumerals();
		
		String numeral = "CD";
		
		assertEquals(400, romanNumerals.convertToInteger(numeral));
	}
	
	@Test
	public void test_500() {
		
		RomanNumerals romanNumerals = new RomanNumerals();
		
		String numeral = "D";
		
		assertEquals(500, romanNumerals.convertToInteger(numeral));
	}
	
	@Test
	public void test_900() {
		
		RomanNumerals romanNumerals = new RomanNumerals();
		
		String numeral = "CM";
		
		assertEquals(900, romanNumerals.convertToInteger(numeral));
	}
	
	@Test
	public void test_1000() {
		
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

	@Test
	public void test_iiii() {
		
		RomanNumerals romanNumerals = new RomanNumerals();
		
		String numeral = "IIII";
		
		assertEquals(0, romanNumerals.convertToInteger(numeral));
	}
	
	@Test
	public void test_xxxx() {
		
		RomanNumerals romanNumerals = new RomanNumerals();
		
		String numeral = "XXXX";
		
		assertEquals(0, romanNumerals.convertToInteger(numeral));
	}
	
	@Test
	public void test_cccc() {
		
		RomanNumerals romanNumerals = new RomanNumerals();
		
		String numeral = "CCCC";
		
		assertEquals(0, romanNumerals.convertToInteger(numeral));
	}
	
	@Test
	public void test_mmmm() {
		
		RomanNumerals romanNumerals = new RomanNumerals();
		
		String numeral = "MMMM";
		
		assertEquals(0, romanNumerals.convertToInteger(numeral));
	}
	
	@Test
	public void test_vv() {
		
		RomanNumerals romanNumerals = new RomanNumerals();
		
		String numeral = "VV";
		
		assertEquals(0, romanNumerals.convertToInteger(numeral));
	}
	
	@Test
	public void test_ll() {
		
		RomanNumerals romanNumerals = new RomanNumerals();
		
		String numeral = "LL";
		
		assertEquals(0, romanNumerals.convertToInteger(numeral));
	}
	
	@Test
	public void test_dd() {
		
		RomanNumerals romanNumerals = new RomanNumerals();
		
		String numeral = "DD";
		
		assertEquals(0, romanNumerals.convertToInteger(numeral));
	}
	
	@Test
	public void test_il() {
		
		RomanNumerals romanNumerals = new RomanNumerals();
		
		String numeral = "IL";
		
		assertEquals(0, romanNumerals.convertToInteger(numeral));
	}
	
	@Test
	public void test_ic() {
		
		RomanNumerals romanNumerals = new RomanNumerals();
		
		String numeral = "IC";
		
		assertEquals(0, romanNumerals.convertToInteger(numeral));
	}
	
	@Test
	public void test_id() {
		
		RomanNumerals romanNumerals = new RomanNumerals();
		
		String numeral = "ID";
		
		assertEquals(0, romanNumerals.convertToInteger(numeral));
	}
	
	@Test
	public void test_im() {
		
		RomanNumerals romanNumerals = new RomanNumerals();
		
		String numeral = "IM";
		
		assertEquals(0, romanNumerals.convertToInteger(numeral));
	}
	
	@Test
	public void test_xd() {
		
		RomanNumerals romanNumerals = new RomanNumerals();
		
		String numeral = "XD";
		
		assertEquals(0, romanNumerals.convertToInteger(numeral));
	}
	
	@Test
	public void test_xm() {
		
		RomanNumerals romanNumerals = new RomanNumerals();
		
		String numeral = "XM";
		
		assertEquals(0, romanNumerals.convertToInteger(numeral)); 
	}
}
