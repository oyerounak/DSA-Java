public class SuperKeyword {
    /*
     * Super Keyword is used to refer immediate parent class Objects.
     * 
     * It is used to:
     * 1. access parent properties
     * 2. access parent function
     * 3. access parent constructor
     * 
     */
    public static void main(String[] args) {
        Horse h = new Horse();
        System.out.println(h.color);
        
    }
}
class Animals{
    String color;
    Animals(){
        System.out.println("Animal constructor is called");
    }

}
class Horse extends Animals{
    Horse(){
        super();
        super.color ="Dark Brown";
        System.out.println("Horse Constructor is called");
    }
}