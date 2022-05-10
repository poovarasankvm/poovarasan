package selenium1;

public class TwoWheeler {
	
	
		String bikeName="YAMAHA";
		char noOfWheels='2';
		short noOfMirrors=2;
		long chassisNumber=34562754347l;
		double runningKM=780;
		public static void main(String[] args) {
			TwoWheeler obj=new TwoWheeler();
			
			System.out.println("bikeName: "+obj.bikeName);
			System.out.println("chassisNumber: "+obj.chassisNumber);
			System.out.println("noOfWheels: "+obj.noOfWheels);
			System.out.println("runningKM: "+obj.runningKM);
			System.out.println("noOfMirrors: "+obj.noOfMirrors);
		}
	}


