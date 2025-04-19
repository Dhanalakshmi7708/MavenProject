package week4.day1;

public class JavaConnection implements DatabaseConnection {

	@Override
	public void connect() 
	{
		System.out.println("Connection Established");

	}

	@Override
	public void disconnect() 
	{
		System.out.println("Database is disconnedted, Please Reconnect again");

	}

	@Override
	public void executeUpdate() 
	{
		System.out.println("System Start the Update at anytime");

	}
	
	public static void main(String[] args) {
		
		JavaConnection connection = new JavaConnection();
		connection.connect();
		connection.executeUpdate();
		connection.disconnect();

	}

}
