import java.util.ArrayList;
import java.util.List;

/**
 * Created by lsy on 2016/4/28.
 */
public class GoogleEquation {
    String[] strs;
    int[] sum;
    boolean[] occupy = new boolean[10];

    class Letter {
        char c;
        int val;
        boolean isLeading;

        Letter(char c, int val, boolean isLeading) {
            this.c = c;
            this.val = val;
            this.isLeading = isLeading;
        }

        @Override
        public String toString() {
            return "c:" + c + "    val:" + val + "  isLeading:" + isLeading + "\n";
        }
    }

    List<Letter> list = new ArrayList<>();


    void addList(char[] c) {
        for (int i = 0; i < c.length; i++) {
            boolean b = true;
            for (int j = 0; j < list.size(); j++) {
                if (c[i] == list.get(j).c) {
                    if (i == 0) {
                        list.get(j).isLeading = true;
                    }
                    b = false;
                    break;
                }
            }
            if (b) {
                list.add(new Letter(c[i], -1, i == 0));
            }
        }
    }

    public GoogleEquation(String... strs) {
        this.strs = strs;
        sum = new int[strs.length];
        for (int i = 0; i < strs.length; i++) {
            addList(strs[i].toCharArray());
        }
    }

    private void satisfyCondition() {
        for (int i = 0; i < strs.length; i++) {
            sum[i] = sum(strs[i].toCharArray());
        }
        if (sum[0] - sum[1] == sum[2]) {
            System.out.println(sum[0] + "-" + sum[1] + "=" + sum[2]);
        }
    }

    public int sum(char[] c) {
        int sum = 0;
        for (int i = 0; i < c.length; i++) {
            int val = val(c[i]);
            for (int j = i; j < c.length - 1; j++) {
                val *= 10;
            }
            sum += val;
        }
        return sum;
    }

    public int val(char c) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).c == c) {
                return list.get(i).val;
            }
        }
        return 0;
    }

    public void solution() {
        solution(0);
    }

    public void solution(int index) {
        if (index == list.size()) {
            satisfyCondition();
            return;
        }
        for (int i = 0; i < 10; i++) {
            Letter l = list.get(index);
            if (i == 0 && l.isLeading) {
                continue;
            }
            if (occupy[i]) {
                continue;
            }
            l.val = i;
            occupy[i] = true;
            solution(index + 1);
            occupy[i] = false;
        }
    }

    public static void main(String[] args) {
        GoogleEquation g = new GoogleEquation("WWWDOT", "GOOGLE", "DOTCOM");
        g.solution();
    }
}