package week4.day1;

public class APIClient {

	public void sendRequest(String endPoint) // Created Methods with Arguments

	{

		System.out.println("Endpoint for the Send Request is " + endPoint);

	}

	public void sendRequest(String endPoint, String requestBody, boolean requestStatus) // Created another Methods with same name passing different input Arguments
																							
	{

		System.out.println("Endpoint for the Send Request is " + endPoint);
		System.out.println("Request Body of the Send Request is " + requestBody);
		System.out.println("Request Status is " + requestStatus);

	}

	public static void main(String[] args)

	{

		APIClient client = new APIClient(); //Created object to call the method
		client.sendRequest("https://platform.testleaf.com/#/"); // Call the First method
		client.sendRequest("Test1", "Test2", true); // Call the Second method

	}

}
