package assign2;

import java.time.LocalDate;

public class Customer  {

	private static int custId;
	private String Fname,Lname,email,pass;
	private double regAmount;
	private LocalDate dob;
	private ServicePlan sp;
	
	static {
		custId=0;
	}
	
	public Customer(String fname, String lname, String email, String pass, double regAmount, LocalDate dob,
			ServicePlan sp) {
		super();
		custId++;
		Fname = fname;
		Lname = lname;
		this.email = email;
		this.pass = pass;
		this.regAmount = regAmount;
		this.dob = dob;
		this.sp = sp;
		this.sp=sp;
	}

	@Override
	public String toString() {
		return "Customer"+ "[Customer ID= "+custId+"  Fname=" + Fname + ", Lname=" + Lname + ", email=" + email + ", pass=" + pass + ", regAmount="
				+ regAmount + ", dob=" + dob +", ServicePlan="+ sp + "]";
	}
	
}
