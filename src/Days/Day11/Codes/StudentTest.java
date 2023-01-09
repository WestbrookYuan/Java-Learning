package Days.Day11.Codes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StudentTest {


    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();
        for(int i=0;i<20;i++){
            Student student = new Student();
            student.id = i+1;
            student.state = (int)Math.round(6 * Math.random());
            student.score = (int)Math.round(100 * Math.random());
            students.add(student);
        }

        for(int i=0;i<20;i++) {
            if (students.get(i).state == 3){
                System.out.println(students.get(i).toString());
            }
        }
        System.out.println();
        students.sort((s1, s2) ->{
            if (s1.score > s2.score){
                return 1;
            } else if (s1.score < s2.score) {
                return -1;
            }
            else {
                return 0;
            }
        });
        for(int i=0;i<20;i++) {
            System.out.println(students.get(i).toString());
        }
        System.out.println(new Student().score);
    }

}

class Student{
    int id;
    int state;
    int score;

    Student(){};

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", state=" + state +
                ", score=" + score +
                '}';
    }
}
