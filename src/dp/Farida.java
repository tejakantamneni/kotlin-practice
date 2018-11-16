package dp;

import java.util.Arrays;

import static java.lang.Math.max;

public class Farida {

    long[] cache;

    Farida() {
        cache = new long[1000];
        Arrays.fill(cache, -1);
    }

    long calculate(long[] inp, int n) {
        if (cache[0] == -1) {
            cache[0] = inp[0];
        }
        if (cache[1] == -1) {
            cache[1] = inp[1];
        }
        //System.out.println(n);
        if(cache[n] != -1){
            return cache[n];
        }
        long val = max(calculate(inp, n - 1), inp[n] + calculate(inp, n - 2));
        cache[n] = val;
        return cache[n];
    }

    public static void main(String[] args) {
        System.out.println(new Farida().calculate(new long[]{2, 1, 1}, 2));
        System.out.println(new Farida().calculate(new long[]{1, 5, 2}, 2));
        System.out.println(new Farida().calculate(new long[]{1, 2, 1}, 2));
        System.out.println(new Farida().calculate(new long[]{1, 2, 1, 3, 4}, 4));
        System.out.println(new Farida().calculate(new long[]{1, 3, 4, 5, 6, 23, 4, 5, 45, 23, 67, 78, 98, 1, 34, 67, 89}, 16));
    }
}
