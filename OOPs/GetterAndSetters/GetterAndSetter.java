package GetterAndSetters;

//Getters - To return the value
//Setters - To modify the value
public class GetterAndSetter {
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
    // We can access the private access modifiers outside the class using getters
    // and setters
    private String color;
    private int tip;

    String getColor() { // getters
        return this.color; // This keyword is used to refer to the current Object
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