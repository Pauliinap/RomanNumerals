public class RomanNumerals {
	public int convertToInteger(String romanNum) {
		
		int num = 0;
		int j = 0;
		int x = 0;
		int c = 0;
		int m = 0;
		
		//Program returns 0 if input is wrong
		for (int i = 0; i < romanNum.length(); i++) {
			
			if (romanNum.charAt(i) == 'I' ) {
				num = num + 1;
				j = j + 1;
				if (j == 4) {
					return 0;
				}
				x = 0;
				c = 0;
				m = 0;
			}
			
			if (romanNum.charAt(i) == 'V') {
				if (i == 0) {
					num = num + 5;
				} else {
					if (romanNum.charAt(i) == 'V') {
						if (romanNum.charAt(i - 1) == 'I') {
							num = num + 3;
						} else if (romanNum.charAt(i - 1) == 'V') {
							return 0;
						} else {
						num = num + 5;
						}
					}
				}
				j = 0;
				x = 0;
				c = 0;
				m = 0;
			}
			
			if (romanNum.charAt(i) == 'X') {
				if (i == 0) {
					num = num + 10;
				} else {
					if (romanNum.charAt(i) == 'X') {
						if (romanNum.charAt(i - 1) == 'I') {
							num = num + 8;
						} else if (romanNum.charAt(i - 1) == 'V') {
							return 0;
						} else {
						num = num + 10;
						}			
					}
				}
				x = x + 1;
				if (x == 4) {
					return 0;
				}
				j = 0;
				c = 0;
				m = 0;
			}
			
			if (romanNum.charAt(i) == 'L') {
				if (i == 0) {
					num = num + 50;
				} else {
					if (romanNum.charAt(i) == 'L') {
						if (romanNum.charAt(i - 1) == 'X') {
							num = num + 30;
						} else if ((romanNum.charAt(i - 1) == 'I')||(romanNum.charAt(i - 1) == 'V')||(romanNum.charAt(i - 1) == 'L')) {
							return 0;
						} else {
						num = num + 50;
						}
					}
				}
				j = 0;
				x = 0;
				c = 0;
				m = 0;
			}

			if (romanNum.charAt(i) == 'C') {
				if (i == 0) {
					num = num + 100;
				} else {
					if (romanNum.charAt(i) == 'C') {
						if (romanNum.charAt(i - 1) == 'X') {
							num = num + 80;
						} else if ((romanNum.charAt(i - 1) == 'I')||(romanNum.charAt(i - 1) == 'V')||(romanNum.charAt(i - 1) == 'L')) {
							return 0;
						} else {
						num = num + 100;
						}
					}
				}
				c = c + 1;
				if (c == 4) {
					return 0;
				}
				j = 0;
				x = 0;
				m = 0;
			}
			
			if (romanNum.charAt(i) == 'D') {
				if (i == 0) {
					num = num + 500;
				} else {
					if (romanNum.charAt(i) == 'D') {
						if (romanNum.charAt(i - 1) == 'C') {
							num = num + 300;
						} else if ((romanNum.charAt(i - 1) == 'I')||(romanNum.charAt(i - 1) == 'V')||(romanNum.charAt(i - 1) == 'X')||(romanNum.charAt(i - 1) == 'L')||(romanNum.charAt(i - 1) == 'D')) {
							return 0;
						} else {
						num = num + 500;
						}
					}
				}
				j = 0;
				x = 0;
				c = 0;
				m = 0;
			}
			
			if (romanNum.charAt(i) == 'M') {
				if (i == 0) {
					num = num + 1000;
				} else {
					if (romanNum.charAt(i) == 'M') {
						if (romanNum.charAt(i - 1) == 'C') {
							num = num + 800;
						} else if ((romanNum.charAt(i - 1) == 'I')||(romanNum.charAt(i - 1) == 'V')||(romanNum.charAt(i - 1) == 'X')||(romanNum.charAt(i - 1) == 'L')||(romanNum.charAt(i - 1) == 'D')) {
							return 0;
						} else {
						num = num + 1000;
						}
					}
				}
				m = m + 1;
				if (m == 4) {
					return 0;
				}
				j = 0;
				x = 0;
				c = 0;
			}

			
		}
		
		return num; 
		
	}
}
