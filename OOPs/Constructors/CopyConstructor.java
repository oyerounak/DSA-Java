package Constructors;

public class CopyConstructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Saksham";
        s1.roll = 61;
        s1.password = "abcde";
        s1.marks[0] = 3;
        s1.marks[1] = 7;
        s1.marks[2] = 9;

        Student s2 = new Student(s1); //Calling Copy Constructor
        s2.password = "xyz";
        s1.marks[2] = 13; //this will reflect change in SHALLOW constructor but not in DEEP Constructor

        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);

        }


    }

}

class Student {
    String name;
    int roll;
    String password;
    int marks[];

    // Shallow Copy Constructor - marks changed
    // Student(Student s1){
    //     marks=new int[3];
    //     this.name =s1.name;
    //     this.roll =s1.roll;
    //     this.marks=s1.marks;
    // }

    // Deep Copy Constructor - marks Unchanged
    Student(Student s1) {
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for (int i = 0; i < marks.length; i++) { 
            this.marks[i] = s1.marks[i]; //Here we are creating a deep copy Constructor.
        }

    }

    Student() {
        marks = new int[3];
        System.out.println("Constructor is called.");

    }

}
