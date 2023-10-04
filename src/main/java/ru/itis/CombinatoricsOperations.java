package ru.itis;

import java.math.BigInteger;
import java.util.List;

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
        } else {
            return getFactorial(n).divide(getFactorial(n - k));
        }
    }

    public static BigInteger getCombinations(int n, int k, Boolean isRepetitions) {
        if (isRepetitions) {
            return getFactorial(n + k - 1).divide(getFactorial(k).multiply(getFactorial(n - 1)));
        } else {
            return getFactorial(n).divide(getFactorial(k).multiply(getFactorial(n - k)));
        }
    }

    public static BigInteger getPermutations(int n) {
        return getFactorial(n);
    }

    public static BigInteger getPermutations(int n, List<Integer> permutations) {
        BigInteger res = BigInteger.ONE;
        for (Integer x : permutations) {
            res = res.multiply(getFactorial(x));
        }
        return getFactorial(n).divide(res);
    }

    public static double getUrnModel(int n, int m, int k) {
        double x = getCombinations(m, k, false).doubleValue();
        double y = getCombinations(n, k, false).doubleValue();
        return x / y;
    }

    public static double getUrnModel(int n, int m, int k, int r) {
        double x = getCombinations(m, r, false).doubleValue();
        System.out.println(x);
        double y = getCombinations(n - m, k - r, false).doubleValue();
        System.out.println(y);
        double z = getCombinations(n, k, false).doubleValue();
        System.out.println(z);
        return (x * y) / z;
    }
}

