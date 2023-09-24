public class ClassesAndObjects {
    /*
     * class - It is a blueprint of an object(Collection of Objects ) properties +
     * Functions
     * Object - It is an instance of a java Class. An object is created using a
     * "new " keyword
     * 
     */
    public static void main(String[] args) {
        Pen p1 = new Pen(); // created a pen object p1
        p1.setColor("Blue");
        System.out.println(p1.color);

        p1.setTip(5);
        System.out.println(p1.tip);

        p1.color = "Yellow";
        System.out.println(p1.color);

    }
}

class Pen {
    // Properties (Attributes)
    String color;
    int tip;

    // Functions (Behaviours)
    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }
}

class Student {
    String name;
    int roll;
    int age;
    float percentage;

    float calcPercentage(int phy, int chem, int math) {
        percentage = (phy + chem + math) / 3;
        return percentage;
    }
}