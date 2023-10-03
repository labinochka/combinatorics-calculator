package ru.itis;

import java.math.BigInteger;

import static java.lang.Math.pow;

public class CombinatoricsOperations {
    public static BigInteger getFactorial(int n) {
        BigInteger res = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            res = res.multiply(BigInteger.valueOf(i));
        }
        return res;
    }

    public static BigInteger getPlacements(int n, int k, Boolean isRepetitions) {
        if (isRepetitions) {
            return BigInteger.valueOf((long) pow(n, k));
        }
        else {
            return getFactorial(n).divide(getFactorial(n - k));
        }
    }

    public static BigInteger getCombinations(int n, int k, Boolean isRepetitions) {
        if (isRepetitions) {
            return getFactorial(n + k - 1).divide(getFactorial(k).multiply(getFactorial(n - 1)));
        }
        else {
            return getFactorial(n).divide(getFactorial(k).multiply(getFactorial(n - k)));
        }
    }
}
