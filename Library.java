package week2.day1;

public class Library {

	public String addBook (String booktitle) {
		System.out.println(booktitle+ " book added Successfully");
		return booktitle;
	}
	
	public void issueBook(String bookname) {
		System.out.println(bookname +" "+"Book issued successfully");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Library bookDetail = new Library();
		bookDetail.addBook("HarryPotter");
		bookDetail.issueBook("Ponniyin Selvan");
		

	}

}
