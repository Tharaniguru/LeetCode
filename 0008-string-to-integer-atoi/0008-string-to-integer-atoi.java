class Solution {
    public int myAtoi(String s) {
        int result = 0;
        int sign = 1;
        int i = 0;

        if (s.length() == 0) {
            return 0;
        }

       
        while (i < s.length() && s.charAt(i) == ' ') {
            i++;
        }

       
        if (i < s.length() && s.charAt(i) == '-') {
            sign = -1;
            i++;
        } else if (i < s.length() && s.charAt(i) == '+') {
            i++;
        }

        
        if (i >= s.length() || !Character.isDigit(s.charAt(i))) {
            return 0;
        }

        
        for (; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                int digit = s.charAt(i) - '0';

                
                if (result > (Integer.MAX_VALUE - digit) / 10) {
                    return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }

                result = result * 10 + digit;
            } else {
                break;
            }
        }

        return result * sign;
    }
}
