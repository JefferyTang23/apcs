//Triple J: Jeffery Tang (Mathias), Jefford Shau (Dylan), Jun Hong Wang (Bob)
//APCS
//HW14 -- BigSib Overload
//2021-10-7

//DISCO:
//It is possible to have multiple contructors in a class in order for multiple tasks to be performed when called.
//QCC:
//Would the constructor that takes String x not run if the BigSib object is an int or anything
//that is not a string?

public class BigSib {
	private String helloMsg; 
 	public BigSib() {
		helloMsg = "Hey, ";
	}
	public BigSib(String x){
		helloMsg = x; 
	}
	public String greet(String n){
		return helloMsg + n + "! How are you today?" ;
	}
}
