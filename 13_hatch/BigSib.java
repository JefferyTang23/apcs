//Triple J: Jeffery Tang (Mathias), Jefford Shau (Dylan), Jun Hong Wang (Bob)
//APCS
//HW13 -- Hatch Hello Message
//2021-10-6

//DISCO:
//It is possible to use methods in another java file that use private variables.
//QCC:
//What does creating the BigSib object "richard" allow us to do that can't be done with 
//BigSib.<method>?

public class BigSib {
	private String HelloMsg;
	public BigSib() {
		HelloMsg = "Word up";
	}
	
	public String greet(String x) {
		return ( HelloMsg + " " + x);
	}
	public void setHelloMsg(String n) {
		HelloMsg = n;
	}
}
