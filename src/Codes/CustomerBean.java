package Codes;

public class CustomerBean {

    public CustomerBean(){};
    public CustomerBean(String name){
        this();
        this.name = name;
    }
    public CustomerBean(int age, String name){
        this(name);
        this.age = age;
    }
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    private int age;
    private boolean isMale;

}
