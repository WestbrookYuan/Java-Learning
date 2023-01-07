package Days.Day11.Codes;

public class PersonTest {
    public static void main(String[] args) {

        Person person1 = new Person();
        person1.age = 15;
        person1.name = "syb";
        System.out.println(person1.age);
        person1.talk();
        person1.eat();
        System.out.println(person1.toString());
        Person p2 = new Person();
        p2.isMale = true;
        p2.age = 15;
        p2.name = "sb";
        System.out.println(p2.toString());
        Person p3 = person1;
        p3.name = "lucas";
        System.out.println(person1.toString());
        System.out.println(p3.toString());
    }


}

class Person{
    String name;
    int age;
    boolean isMale;
    Person(){}
    Person(String name){
        this.name = name;
    }

    public void eat(){
        System.out.println("chi");
    }
    public void walk(){
        System.out.println("zou");
    }
    public void talk(){
        System.out.println("shuo");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isMale=" + isMale +
                '}';
    }
}