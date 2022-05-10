package day4;

public class AmstrongNumber {
	public static void main(String[] args) {
		int n=370,num,temp,total=0;
		num=n;
		while(num !=0) {
			temp=num %10;
			total=total+temp*temp*temp;
			num/=10;
		}
		if(total == n)
			System.out.println(n+ "is an Armstrong Number");
		else
			System.out.println(n+ "is not a Armstrong Number");
			
	}

}
