//Triple J: Jeffery Tang (Mathias), Jefford Shau (Dylan), Jun Hong Wang (Bob)
//APCS
//HW14 -- BigSib Overload
//2021-10-7

//DISCO:
//It is possible to have multiple contructors in a class in order for multiple tasks to be performed when called.
//QCC:
//Would the constructor that takes String x not run if the BigSib object is an int or anything
//that is not a string?

public class Greet {
    public static void main( String[] args ){
        String greeting;
        BigSib richard = new BigSib();
        BigSib grizz = new BigSib();
        BigSib dotCom = new BigSib();
        BigSib tracy = new BigSib();
        greeting = richard.greet("freshman");
        System.out.println(greeting);
        greeting = tracy.greet("Dr. Spaceman");
        System.out.println(greeting);
        greeting = grizz.greet("Kong Fooey");
        System.out.println(greeting);
        greeting = dotCom.greet("mom");
        System.out.println(greeting);
    }
}
