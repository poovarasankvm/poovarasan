

package day2;

public class EmployeeDetails {
	public String printEmployeeName(String empName, int empID) {
		return empName;
	}
	public String getEmployeeAddress(String empAddress) {
		return empAddress;
	}
	public double printEmployeeSalary(double empSalary) {
		return empSalary;
	}
	public long printEmployeeMobileNumber(long mobNum) {
		return mobNum;
	}
	public static void main(String[] args) {
		EmployeeDetails ed = new EmployeeDetails();
		
		String Name=ed.printEmployeeName("Poovarasan",7230);
		System.out.println(Name);
		String Address=ed.getEmployeeAddress("Chengalpattu");
		System.out.println(Address);
		double Salary=ed.printEmployeeSalary(32000);
		System.out.println(Salary);
		long MobileNo=ed.printEmployeeMobileNumber(9361941985l);
		System.out.println(MobileNo);
		
		
	}

}
