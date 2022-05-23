package wee4.day1;

public class Bank extends Loan implements Cibil,PNB {

	@Override
	public void bankBalance() {
		// TODO Auto-generated method stub
		System.out.println("2000");
		
	}

	@Override
	public void maximumLoanAmount() {
		// TODO Auto-generated method stub
		System.out.println("150000");
		
	}

	public void creditScore() {
		// TODO Auto-generated method stub
		System.out.println("720-850");
		
	}

	public void minimumBalance() {
		// TODO Auto-generated method stub
		System.out.println("720");
		
	}

	public void cibilScore() {
		// TODO Auto-generated method stub
		System.out.println("400000");
		
	}
	
	public static void main(String[] args) {
		
	//Bank extends of Object
		Bank val=new Bank();
		val.SBIITLoan();
		val.bankBalance();
		val.maximumLoanAmount();
		
	//CIBIL Implement of Object	
		Cibil val1=new Bank();
		val1.cibilScore();
		
	//PNB Implement of Object
		PNB val2=new Bank();
		val2.maximumLoanAmount();
		val2.creditScore();
		val2.minimumBalance();
	
	}
	
}


