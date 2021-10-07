//Triple J: Jeffery Tang (Mathias), Jefford Shau (Dylan), Jun Hong Wang (Bob)
//APCS
//HW13 -- Hatch Hello Message
//2021-10-6

//DISCO:
//It is possible to use methods in another java file that use private variables.
//QCC:
//What does creating the BigSib object "richard" allow us to do that can't be done with 
//BigSib.<method>?

public class Greet {
    public static void main( String[] args ){
        String greeting;
        BigSib richard = new BigSib();

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
