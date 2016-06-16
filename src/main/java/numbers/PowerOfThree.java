package numbers;

public class PowerOfThree {
    public boolean isPowerOfThree(int n) {
        int exponent = 3;

        if(n == 0) {
            return false;
        }

        if(n == exponent) {
            return true;
        }

        while (n % 3 == 0) {
            n = n / 3;
        }
        return n == 1;
    }
}
