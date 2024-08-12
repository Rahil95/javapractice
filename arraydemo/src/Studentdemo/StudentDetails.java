package Studentdemo;

public class StudentDetails {
	private String ename,division,email;

	public StudentDetails() {
		
	}
	
	public StudentDetails(String ename,String division,String email) {
		this.ename = ename;
		this.division = division;
		this.email = email;
	}
	
	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "StudentDetails [ename=" + ename + ", division=" + division + ", email=" + email + "]";
	}
	
	
	
	
}
