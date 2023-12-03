class Solution {

    public String gcdOfStrings(String str1, String str2) {

        String gcd = "";

        if(str2.equals("") || str1.equals("")) { return ""; }

        int str1Len = str1.length();
        int str2Len = str2.length();

        int longerStr = str1Len > str2Len ? 1 : 2;

        String gcdMemento = "";

        for(int i = 0; i < (str1Len > str2Len ? str2Len : str1Len); i++) {
            if(str1.charAt(i) == str2.charAt(i)) {
                gcd += Character.toString(str1.charAt(i));
                System.out.println(gcd + " here!");
                if(checkRepeats(gcd, str1, str2)) {
                    gcdMemento = gcd;
                }
            } else {
                break;
            }
        }

        return gcdMemento;

    }

    public static Boolean checkRepeats(String gcd, String str1, String str2) {

        Boolean str1B = false;
        Boolean str2B = false;

        String str1cmp = "";
        String str2cmp = "";

        if(str1.length() % gcd.length() == 0) {
            for(int j = 0; j < str1.length(); j = j + gcd.length()) {
                str1cmp += gcd;
            }
            System.out.println(str1cmp + " here1!");
            if (str1cmp.equals(str1))
                str1B = true;
        }

        if(str2.length() % gcd.length() == 0) {
            for(int j = 0; j < str2.length(); j = j + gcd.length()) {
                str2cmp += gcd;
            }
            System.out.println(str2cmp + " here2!");
            if (str2cmp.equals(str2))
                str2B = true;
            }

        return (str1B && str2B);

    }

}