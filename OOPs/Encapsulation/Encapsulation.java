package Encapsulation;

public class Encapsulation {
    /*
     * It is defined as the Wrapping Up(Combining) of data & methods under a single
     * unit callled class
     * Encapsulation envolves Data Hiding or Information Hiding(this Data can be
     * either Useless or Very sensitive) by using access Specifiers.
     */
    public static void main(String[] args) {
        NewPen p = new NewPen(); // created a pen object p1
        p.setColor("Blue");
        System.out.println(p.getColor());
        p.setTip(5);
        System.out.println(p.getTip());
        p.setColor("Yellow");
        System.out.println(p.getColor());

    }
}

class NewPen {
    // Attributes of the class are kept private and public getters and setters
    // method are provided to manipulate(To return/modify) these attributes
    // When me mark all the data members of the Class private then it is said to be
    // FULLY ENCAPSULATED CLASS
    private String color;
    private int tip;

    String getColor() { // getters
        return this.color;
    }

    void setColor(String newColor) { // setters
        this.color = newColor;
    }

    int getTip() { // getters
        return this.tip;
    }

    void setTip(int newTip) { // setters
        this.tip = newTip;
    }
}
