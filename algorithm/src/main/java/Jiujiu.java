import org.junit.Test;

import java.text.ParseException;

/**
 * Created by lsy on 2016/4/22.
 */
public class Jiujiu {
    @Test
    public void a() throws ParseException {
        for (int a = 0x11; (a & 0x0f) <= 0x09; a++) {
            for (; (a >> 4) <= (a & 0x0f); a += 0x10) {
                System.out.printf((a >> 4) + "*" + (a & 0x0f) + "=" + (a >> 4)
                        * (a & 0x0f) + " ");
            }
            a = (a & 0x0f) + 0x10;
            System.out.println();
        }
    }
}
