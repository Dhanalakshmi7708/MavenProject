package week2.day1;

public class Browser {
	public String launchBrowser (String browserName) {
		System.out.println(browserName+ " is lunched Successfully");
		return browserName;
	}
	
	public void loadUrl() {
		System.out.println("Application URL Loaded Successfully");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Browser browseOption = new Browser();
		browseOption.launchBrowser("Chrome");
		browseOption.loadUrl();

	}

}
