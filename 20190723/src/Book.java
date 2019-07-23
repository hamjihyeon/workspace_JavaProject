
public class Book {
	String title;
	String author;
	int ISBN;
	
	public Book(String title, String author, int ISBN) {
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
	}
	public Book(String title, int ISBN) {
		this(title, "Anonybous", ISBN);
	}
	public Book() {
		this(null, null, 0);
		System.out.println("생성자가 호출되었음");
	}
	public static void main(String[] args) {
		Book javaBook = new Book("java JDK", "황기태", 3333);
		Book holyBible = new Book("Holy Bible", 1);
		Book emptyBook = new Book();
			}

}
