package Day3HomeWork2;

public class Instructor extends User{
	private String odevler;

	public Instructor() {
	
	}
	public Instructor(String odevler) {
	super();
	this.odevler = odevler;
	}
	
	public String getOdevler() {
		return odevler;
	}
	public void setOdevler(String odevler) {
		this.odevler = odevler;
	}
}