//Triple J: Jeffery Tang (Mathias), Jefford Shau (Dylan), Jun Hong Wang (Bob)
//APCS
//HW12 -- Greetings with Hello Messages
//2021-10-5

//DISCO:
//Creating the BigSib object "richard" allows methods from BigSib.java to be used using richard.<method>
//QCC:
//What exactly does creating the BigSib object "richard" allow us to do that can't be done with BigSib.<method>?
//What are instance variables and how are they used?

public class Greet {
    public static void main( String[] args ){
        String greeting;
        BigSib richard = new BigSib();

        richard.setHelloMsg("Word up");
        greeting = richard.greet("freshman");
        System.out.println(greeting);

        richard.setHelloMsg("Salutations");
        greeting = richard.greet("Dr. Spaceman");
        System.out.println(greeting);

        richard.setHelloMsg("Hey ya");
        greeting = richard.greet("Kong Fooey");
        System.out.println(greeting);

        richard.setHelloMsg("Sup");
        greeting = richard.greet("mom");
        System.out.println(greeting);
    }
}
