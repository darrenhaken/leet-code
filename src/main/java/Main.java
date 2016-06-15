import strings.RomanNumerals;

public class Main {

    public static void main(final String[] args) throws Exception {
        RomanNumerals romanNumerals = new RomanNumerals();

        int result = romanNumerals.romanToInt("DCXXI");

        System.out.println(result);
    }
}
