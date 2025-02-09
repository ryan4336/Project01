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
	
	
}

