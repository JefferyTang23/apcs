//Triple J: Jeffery Tang (Mathias), Jefford Shau (Dylan), Jun Hong Wang (Bob)
//APCS
//HW13 -- Hatch Hello Message
//2021-10-6

//DISCO:
//It is best to define a instance varible as private and before code for methods.
//QCC:
//What exactly does creating the BigSib object "richard" allow us to do that can't be done with BigSib.<method>?

public class BigSib {
	private String HelloMsg = "Word up";
	public String greet(String x) {
		return ( HelloMsg + " " + x);
	}
	public void setHelloMsg(String n) {
		HelloMsg = n;
	}
}
