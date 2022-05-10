package day2;

public class Mobile {
	public void sendMessage() {
		System.out.println("Send Message in My Friend");
	}
	public void shareDocument() {
		System.out.println("Share a Document in GitHub application");
	}
	public void call() {
		System.out.println("Call for Emergency");
	}
	public static void main(String[] args) {
		Mobile m=new Mobile();
		m.sendMessage();
		m.shareDocument();
		m.call();
	}

}
