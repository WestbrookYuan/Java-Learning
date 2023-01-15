package rightspackage;

public class RightTest {
    public int age;
    String name;
    protected boolean sex;
    private int legs;

    public RightTest(){}
    public RightTest(int age) {
        this.age = age;
    }

    public RightTest(int age, String name, boolean sex, int legs) {
        this.age = age;
        this.name = name;
        this.sex = sex;
        this.legs = legs;
    }
}


