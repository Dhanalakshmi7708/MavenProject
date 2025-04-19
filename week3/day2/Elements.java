package week3.day2;

public class Elements extends Button{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebElement element = new WebElement();
		element.click();
		element.setText("Welcome");
		
		System.out.println("--------------------");
		
		Button btn = new Button();
		btn.submit();
		btn.click();
		
		System.out.println("--------------------");
		
		TextField txtfield = new TextField();
		txtfield.getText();
		
		System.out.println("--------------------");
		
		CheckBoxButton ChkBox = new CheckBoxButton();
		ChkBox.clickCheckButton();
		
		System.out.println("--------------------");
		
		RadioButton rd = new RadioButton();
		rd.selectRadioButton();
		rd.submit();
		rd.click();
		rd.setText("Hello!!!!!!!");
		
		
		
	}

}
