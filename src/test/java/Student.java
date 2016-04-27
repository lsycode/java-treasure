/**
 * Created by lsy on 2016/4/23.
 */
public class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "name = " + name + "," + "age = " + age;
    }
}
