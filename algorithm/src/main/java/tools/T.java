package tools;

/**
 * Created by lsy on 2016/4/22.
 */
public class T {

    public static void outAll(Object... objects) {
        for (int i = 0; i < objects.length; i++) {
            System.out.println(objects[i].toString());
        }
    }

    public static void outArray(Object[] objects) {
        for (int i = 0; i < objects.length; i++) {
            System.out.println(objects[i].toString());
        }
    }

    public static void outInt(int[] objects) {
        for (int i = 0; i < objects.length; i++) {
            System.out.println(objects[i]);
        }
    }
}
