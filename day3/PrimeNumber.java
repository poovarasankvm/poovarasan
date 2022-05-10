package week1.day3;

public class PrimeNumber {
	public static void main(String[] args) {
		int a=13;
		int count=0;
		for (int i = 1; i <=a; i++) {
			if(a%i==0) {
				count++;
				
		
			}
			
		}
		if(count==2) {
			System.out.println("Givem number is Prime:");
		} else
		{
			System.out.println("Given number is not Prime:");
		}
	}

}
