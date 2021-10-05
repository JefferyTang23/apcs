//BeepBoop: Jeffery Tang (Mathias), Jefford Shau (Dylan), Anthony Sun (Corn)
//APCS
//HW10 -- SOP Big Sibs Greeting
//2021-10-4

//DISCOVERIES:
//"void" has to be changed to "String" for the greet method in BigSib.java in order for the method to return strings.
//UNRESOLVED QUESTIONS:
//Is a java file able to call a method from another java file that calls a method from yet another java file?

public class Greet {
    public static void main( String[] args ){
        System.out.println( BigSib.greet("Crosby") );
        System.out.println( BigSib.greet("Stills") );
        System.out.println( BigSib.greet("Nash") );
    }
}
