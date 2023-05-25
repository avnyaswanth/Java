package main.staticDemo;

public class StaticMain {

    static {
        System.out.println("Inside static block1");
    }

    static {
        System.out.println("Inside static block2");
    }

    public static void main(String[] args) {
        System.out.println("inside main");

        System.out.println(Student.schoolName);

        Student s1 = new Student("alpha", 123);
        Student s2 = new Student("beta" ,456);
        Student s3 = new Student("gamma", 789);

        s1.changeUtil("SAI PUBLIC SCHOOL");
        System.out.println(Student.schoolName);

        printName();
    }

    public static void printName() {
        System.out.println("alpha");
    }
}
