package leetCode;

/**
 * Created by lsy on 2016/4/23.
 */
public class CountAndSay {
    public static String countAndSay(int n) {
        String s = "1";
        for (int g = 1; g < n; g++) {
            StringBuffer sb = new StringBuffer();
            char[] c = s.toCharArray();
            char x = c[0];
            int count = 0;
            for (int i = 0; i < c.length; i++) {
                if (c[i] == x) {
                    count++;
                } else {
                    sb.append(count).append(x);
                    x = c[i];
                    count = 1;
                }
                if (i == c.length - 1) {
                    sb.append(count).append(x);
                }
            }
            s = sb.toString();
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println(countAndSay(1));
    }
}
