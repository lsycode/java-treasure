import Tools.T;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lsy on 2016/4/22.
 */
class A{
    int i=0;
    A inc(){
        i++;
        return this;
    }
}

public class Test {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.i);
        A b=a.inc();
        System.out.println(b.i);
    }
}
