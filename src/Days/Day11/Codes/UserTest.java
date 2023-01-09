package Days.Day11.Codes;

public class UserTest {


}

class User{
    public String name;
    private int age;
    boolean isMale;
    User(){}
    User(String name){
        this.name = name;
    }

    public void eat(){
        //public String food = "bing";
        //System.out.println("chi" + food);
    }
    public void walk(){
        System.out.println("zou");
    }
    public void talk(String language){
        System.out.println("shuo"+ language);
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