package strings;

import java.util.ArrayList;
import java.util.Arrays;

public class Anagram {

    /*
        Given two strings s and t, write a function to determine if t is an anagram of s.

        For example,
        s = "anagram", t = "nagaram", return true.
        s = "rat", t = "car", return false.
     */
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }

        if(s.equals(t)) {
            return true;
        }

        char[] charsOfS = s.toCharArray();
        Arrays.sort(charsOfS);

        char[] charsOfT = t.toCharArray();
        Arrays.sort(charsOfT);

        for(int i = 0; i < charsOfS.length; i++) {
            if(charsOfS[i] != charsOfT[i]) {
                return false;
            }
        }

        return true;
    }
}
