
public class RomanNumerals {
	public int convertToInteger(String romanNum) {
		// To be Implemented
		
		int num = 0;
		for (int i = 0; i < romanNum.length(); i++) {
			
			
			
			if (romanNum.charAt(i) == 'V') {
				num = num + 5;
			}
			
			if (romanNum.charAt(i) == 'I' && i + 1 < romanNum.length()) {
				if (romanNum.charAt(i + 1) == 'V') {
					num = num + 4;
					i = i + 1;
					break;
				}
				
			}
			
			if (romanNum.charAt(i) == 'I' && i + 1 < romanNum.length()) {
				if (romanNum.charAt(i + 1) == 'X') {
					num = num + 9;
					i = i + 1;
					break;
				}
				
			}
			
			if (romanNum.charAt(i) == 'X' && i + 1 < romanNum.length()) {
				if (romanNum.charAt(i + 1) == 'L') {
					num = num + 40;
					i = i + 1;
					break;
				} else if (romanNum.charAt(i + 1) == 'C') {
					num = num + 90;
					i = i + 1;
					break;
				}
				
			}
			
			if (romanNum.charAt(i) == 'C' && i + 1 < romanNum.length()) {
				if (romanNum.charAt(i + 1) == 'D') {
					num = num + 400;
					i = i + 1;
					break;
				} else if (romanNum.charAt(i + 1) == 'M') {
					num = num + 900;
					i = i + 1;
					break;
				}
				
			}

			
			if (romanNum.charAt(i) == 'I' ) {
				num = num + 1;
			}
			
			if (romanNum.charAt(i) == 'X') {
				num = num + 10;
			}
			
			if (romanNum.charAt(i) == 'L') {
				num = num + 50;
			}
			
			if (romanNum.charAt(i) == 'C') {
				num = num + 100;
			}
			
			if (romanNum.charAt(i) == 'D') {
				num = num + 500;
			}
			
			if (romanNum.charAt(i) == 'M') {
				num = num + 1000;
			}
		}
		return num;
		
	}
}
