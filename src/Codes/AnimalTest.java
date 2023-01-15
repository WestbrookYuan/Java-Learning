package Codes;

import javax.lang.model.element.AnnotationMirror;

public class AnimalTest {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.age = 15;
        animal.name ="syb";
//        animal.legs = 4;
        System.out.println(animal.toString());
        animal.setLegs(3);
        System.out.println(animal.toString());
    }

}

class Animal{
    String name;
    int age;
    private int legs;

    public Animal(String name, int age, int legs) {
        this.name = name;
        this.age = age;
        this.legs = legs;
    }
    public Animal(){}

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

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        if(legs % 2 == 0){
            this.legs = legs;
        }
        else {
            this.legs = 0;
        }

    }

    public void eat(){
        System.out.println("eat");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", legs=" + legs +
                '}';
    }
}