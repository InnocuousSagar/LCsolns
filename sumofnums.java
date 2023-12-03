/* 
Given two non-negative integers, num1 and num2 represented as string, 
return the sum of num1 and num2 as a string.

Result String should not have leading zeros.

You must solve the problem without using any built-in library for handling large integers (such as BigInteger). 
You must also not convert the inputs to integers directly.

num1 and num2 consist of only digits.
num1 and num2 don't have any leading zeros except for the zero itself.
input="999" and "44"
output="100" */

class A {

	public static String summ(String a, String b) {

		if (! (NumberUtils.isParsable(a) || NumberUtils.isParsable(b))) {
			return 0;
		} else {
			char[] arr = String.chars(a);
			char[] brr = String.chars(b);

			char[] longer = arr.length >= brr.length ? arr : brr;
			char[] shorter = arr.length < brr.length ? arr : brr;

			Integer sumWithCarry = 0;
			Integer currentCarry = 0;

			for(int i = longer.length - 1; i >= 0; i--) {
				
				if(i = 1 && Integer.parseInt(longer.charAt(i)) + shorter.length < i ? 0 :Integer.parseInt(shorter.charAt(i))) > 10 {
					currentCarry = 1;
				} else {
					currentCarry = 0;
				}

				sumWithCarry += currentCarry + Integer.parseInt(longer.charAt(i)) + shorter.length < i ? 0 :Integer.parseInt(shorter.charAt(i));

			}

			return String.valueOf(sumWithCarry)

		}

	}

}

