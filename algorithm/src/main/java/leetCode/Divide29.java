package leetCode;

import java.awt.*;

/**
 * Created by lsy on 2016/4/23.
 */
public class Divide29 {
    public static int divide(int dividend, int divisor) {
        System.out.println(dividend / divisor);
        boolean negative = ((dividend ^ divisor) >>> 31) == 1;
        long dividendl = Math.abs(0l + dividend);
        long divisorl = Math.abs(0l + divisor);

        long sum = 0;
        while (dividendl >= (divisorl << 1)) {
            long num = 1;
            long temp = divisorl;
            while (dividendl >= (temp << 1)) {
                temp <<= 1;
                num <<= 1;
            }
            if (num != 1) {
                sum += num;
            }
            dividendl -= temp;
        }
        if (dividendl >= divisorl) {
            sum++;
        }
        if (negative) {
            sum = -sum;
        }
        if (sum > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        if (sum < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        return (int)sum;
    }

    public static void main(String[] args) {
        long t1 = System.currentTimeMillis();
        System.out.println(Integer.MAX_VALUE);
        System.out.println(divide(-2147483648,
                1));
        System.out.println(System.currentTimeMillis() - t1);
    }
}
