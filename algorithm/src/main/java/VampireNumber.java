import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by lsy on 2016/4/23.
 */
public class VampireNumber {
    public static void main(String[] args) {
        for (int i = 10; i < 99; i++) {
            for (int j = 10; j < 99; j++) {
                int sum = i * j;
                if (sum % 100 == 0) {
                    continue;
                }
                char[] c1 = String.valueOf(sum).toCharArray();
                char[] c2 = (i + "" + j).toCharArray();
                Arrays.sort(c1);
                Arrays.sort(c2);
                if (Arrays.equals(c1, c2)) {
                    System.out.println(i + " " + j);
                }
            }
        }
    }
}
