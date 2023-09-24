package Constructors;
/*
 * There are Three types of Constructor:
 * 1.Non-Parameterized Constructor
 * 2.Parameterized Constructor
 * 3.Copy Constructor
 */
public class Constructos {
    public static void main(String[] args) {
        //Calling Suitable Constructor based on parameter this is Called CONSTRUCTOR OVERLOADING.(Polymorphism)
        Student s1 = new Student("Raunak");
        System.out.println(s1.name);
        Student s2 = new Student();
        Student s3 = new Student("Swapnil",61);

    }

}

class Student {
    String name;
    int roll;

    // Constructors -> There can be multiple number of constructor based on needs.
    Student(String name) { // Parametrize Constructor (suppose we don't know the roll no of the student)
        this.name = name;
    }

    Student(String Name, int RollNo) { // Parametrize Constructor (suppose we know the rollno and name of the student)
        this.name = Name;
        this.roll = RollNo;
        System.out.println(this.roll+" "+this.name);

    }

    Student() { // Non-Parametrize Constructor (suppose we don't know any thing about the student)
        System.out.println("Constructor is called...");
    }
}
