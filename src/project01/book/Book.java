package project01.book;

/**
 * The Book class is used to represent a book with a 
 * title, author, ISBN, and price.
 * It provides methods that get/set properties, compare Book objects, and print a Book object in 
 * readable format.
 */
public class Book {
	private String title;
	private String author;
	private String ISBN;
	private double price;
	
	/**
	 * When this constructor is called, it will initialize a Book object with default values of "Unknown"
	 * for title, author, and ISBN, and a default value of 0.0 for price. 
	 */
	public Book() {
		title = "Unknown";
		author = "Unknown";
		ISBN = "Unknown";
		price = 0.0;
	}
	/**
	 * When this constructor is called, it will create a Book object using four parameters: 
	 * (String)title, (String)author, (String)ISBN, and (double)price.
	 * @param title 
	 * 		 String to be the title of the book.
	 * @param author
	 * 		 String to be the author of the book.
	 * @param ISBN
	 * 		 String to be the ISBN of the book.
	 * @param price
	 * 		 double to be the price of the book.
	 */
	public Book(String title, String author, String ISBN, double price) {
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
		this.price = price;
	}
	
}

