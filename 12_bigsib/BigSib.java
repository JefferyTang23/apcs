//Triple J: Jeffery Tang (Mathias), Jefford Shau (Dylan), Jun Hong Wang (Bob)
//APCS
//HW12 -- Greetings with Hello Messages
//2021-10-5

//DISCO:
//Creating the BigSib object "richard" allows methods from BigSib.java to be used using richard.<method>
//QCC:
//What exactly does creating the BigSib object "richard" allow us to do that can't be done with BigSib.<method>?
//What are instance variables and how are they used?

public class BigSib {
	String HelloMsg;
	public String greet(String x) {
		return ( HelloMsg + " " + x);
	}
	public void setHelloMsg(String n) {
		HelloMsg = n;
	}
}
