import people.Student;
import people.Teacher;
import people.studentType.Freshman;

public class Main {

    public static void main(String[] args) {

        Student jan = new Student("blue",18,1.8,5);
        Teacher henk = new Teacher("green", 43,1.7,"English");
        Freshman pieter = new Freshman( "blue" , 43 ,1.6, 5 , true);
        System.out.println(jan.getAge());
        System.out.println(henk.getVak());
        System.out.println(pieter.getExperienced());
    }
}
