package week2.day1;

public class Library {

	public String addBook (String bookTitle) //define method1 
	{
		System.out.println(bookTitle+ " book added Successfully");
		return bookTitle;
	}
	
	public void issueBook(String bookName)//define method2
	{
		System.out.println(bookName +" "+"Book issued successfully");
	}
	public static void main(String[] args) {
			
		Library bookDetail = new Library(); //declaring method in main method using object 
		bookDetail.addBook("HarryPotter"); //call the method bookTitle
		bookDetail.issueBook("Ponniyin Selvan");//call the method bookName
		

	}

}
