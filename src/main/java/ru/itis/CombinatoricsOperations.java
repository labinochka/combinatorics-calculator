package ru.itis;

public class CombinatoricsOperations {
    public static int getFactorial(int n) {
        int res = 1;
        for (int i = 1; i <= n; i++) {
            res *= i;
        }
        return res;
    }

    public static int getPlacements(int n, int k, Boolean isRepetitions) {
        if (isRepetitions) {
            return (int) Math.pow(n, k);
        }
        else {
            return getFactorial(n) / (getFactorial(n - k));
        }
    }
}
