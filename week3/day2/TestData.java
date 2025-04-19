package week3.day2;

public class TestData extends LoginTestData {

	public void enterCredentials() {
		System.out.println("Enter the Credential");

	}

	public void navigateToHomePage() {
		System.out.println("Navigate to Home page");

	}

	public static void main(String[] args) {

		TestData loginData = new TestData();
		loginData.enterCredentials();
		loginData.enterUsername(); //call the method from subClass
		loginData.enterPassword(); //call the method from subClass
		loginData.navigateToHomePage();

	}

}
