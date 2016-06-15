package strings;

import java.util.HashMap;
import java.util.Map;

public class RomanNumerals {

    public int romanToInt(String s) {
        s = s.toLowerCase();

        Map<Character, Integer> numerals = new HashMap<>();
        numerals.put('i', 1);
        numerals.put('x', 10);
        numerals.put('c', 100);
        numerals.put('m', 1000);
        numerals.put('v', 5);
        numerals.put('l', 50);
        numerals.put('d', 500);

        int intNum = 0;
        int prev = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int temp = numerals.get(s.charAt(i));

            if (temp < prev)
                intNum -= temp;
            else
                intNum += temp;
            prev = temp;
        }

        return intNum;
    }
}
