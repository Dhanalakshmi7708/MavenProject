package week4.day1;

public class Amazon extends CanaraBank{


	@Override
	public void cashOnDelivery() {
		
		System.out.println("Cash On Delivery Enabled");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void upiPayments() {
		
		System.out.println("upiPayments Enabled");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cardPayments() {
		System.out.println("cardPayments Enabled");
		
	}

	@Override
	public void internetBanking() {
		System.out.println("internetBanking enabled");
		// TODO Auto-generated method stub
		
	}
	
	public void recordPaymentDetails() {
		super.recordPaymentDetails();
		System.out.println("Customer Payment Details recorded");
	}
	

	public static void main(String[] args) {
		
		Amazon Amazon1 = new Amazon();
		Amazon1.cardPayments();
		Amazon1.cashOnDelivery();
		Amazon1.internetBanking();
		Amazon1.upiPayments();
		Amazon1.recordPaymentDetails();
		

	}

}
