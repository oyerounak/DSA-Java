public class StaticKeyword {
    public static void main(String[] args) {
        Students s1 = new Students();
        s1.schoolName = "DAV";

        Students s2 = new Students();
        System.out.println(s2.schoolName);

        s2.schoolName = "TVM";
        System.out.println(Students.schoolName); //static variable can be accessed by using class name as well
        System.out.println(s2.schoolName);

        //Output : DAV TVM TVM
    }
    
}
class Students{
//We Cannot use "this" keyword in a static variable.
//If a variable is declared static and if Object1 make changes to it then it will change for everyother Objects.

    String name;
    static String schoolName; 
    int RollNo;

    String getName() {
        return name;
    }
    void setName(String Name) {
        this.name = Name;
    }
    

}