/**
 * Created by lsy on 2016/4/28.
 */
public class EditDistance {
    char[] src;
    char[] dest;

    int solution() {
        return solution(0, 0);
    }

    int solution(int i, int j) {
        if (src.length - 1 == i || dest.length - 1 == j) {
            return Math.abs(src.length-dest.length);
        }
        if (src[i] == dest[j]) {
            return solution(i + 1, j + 1);
        }
        int edIns = solution(i, j + 1) + 1;
        int edDel = solution(i + 1, j) + 1;
        int edRep = solution(i + 1, j + 1) + 1;
        return Math.min(Math.min(edIns, edDel), edRep);
    }

    public static void main(String[] args) {
        EditDistance e = new EditDistance();
        e.src = "abc".toCharArray();
        e.dest = "ac".toCharArray();
        System.out.println(e.solution());
    }
}
