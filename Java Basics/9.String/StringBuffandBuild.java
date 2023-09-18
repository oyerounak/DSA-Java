public class StringBuffandBuild {
    public static void main(String[] args) {
        //Conversion String to StringBuilder
        String st = "Hello";
        StringBuilder stringbuild = new StringBuilder(st); 

        //conversion StringBuilder to String
        StringBuilder stringbuild1 = new StringBuilder("Buddy");
        String s = stringbuild1.toString();
        
        //All the methods of String class is available in 'StringBuilder' and 'StringBuffer'
        //New methods StringBuilder and StringBuffer operation in java
        StringBuilder sb1 = new StringBuilder("java");
        StringBuilder sb2 = sb1;
        sb1 = sb1.append(" is a good language!");
        System.out.println(sb1==sb2); //output : true

        //append(x)- x =(boolean,int,char,string,float,object)
        StringBuilder sb =new StringBuilder("Java");
        String str = "Nice";
        System.out.println(sb.append(123)); //output :Java123
        System.out.println(sb.append(true));//output :Java123true
        System.out.println(sb.append(1.234));//output :Java123true
        System.out.println(sb.append('s'));//output :Java123true1.234s
        System.out.println(sb.append(str));//output :Java123true1.234sNice

        //insert(offset,x) - x =(boolean, int,char,String,float,object)
        StringBuilder sb3 =new StringBuilder("Raunak");
        String str1 ="Well";
        System.out.println(sb3.insert(0, str)); //output: NiceRaunak
        System.out.println(sb3.insert(2, str1)); // output : NiWellceRaunak

        //SetCharAt()
        StringBuilder sb4= new StringBuilder("Builder");
        sb4.setCharAt(1,'A');
        System.out.println(sb4); //output : BAilder

        //reverse()
        System.out.println(sb4.reverse()); //output : redliAB

        //deleteCharAt(index)
        System.out.println(sb4.deleteCharAt(1));//Output : rdliAB

        //delete(start,end)- end is excluded
        StringBuilder str5 = new StringBuilder("Raunak");
        System.out.println(str5.delete(1, 3));//output: Rnak

        //replace(int start,int end,str)
        StringBuilder sb5 = new StringBuilder("Cricket");
        System.out.println(sb5.replace(1,3,"VK"));//output : CVKcket





    }
    
}
