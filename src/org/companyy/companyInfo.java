package org.companyy;

public class companyInfo {
	private void companyName() {
		System.out.println("AMAZON");
	}
	private void companyName(String Name) {
		System.out.println("Name:"+Name);
	}
	private void companyName(int id) {
		System.out.println("ID:"+id);
	}
	private void companyName(float salary,String role ) {
	System.out.println("Salary:"+salary);
		System.out.println("Role:"+role);
	}
	public static void main(String[] args) {
		companyInfo c=new companyInfo();
		c.companyName("SRINITHY");
		c.companyName(2025);
		c.companyName(48576.589f, "Tester");
		
		
	}
}
