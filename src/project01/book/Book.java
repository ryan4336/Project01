package project01.book;

import java.util.Objects;

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
	/**
	 * When this constructor is called, it will create a Book object that is 
	 * a copy of another Book object (given as the argument). 
	 * @param other
	 * 		The Book object to be copied.
	 */
	public Book(Book other) {
		this.title = other.title;
		this.author = other.author;
		this.ISBN = other.ISBN;
		this.price = other.price;
	}
	/**
	 * This method will get the title of the Book.
	 * @return
	 * 		Returns the title of the Book as a String.
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * This method will set the title of the Book to the given argument.
	 * @param title
	 * 		 String to be the new title of the Book.
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * This method will get the author of the Book.
	 * @return
	 * 		Returns the author of the Book as a String.
	 */
	public String getAuthor() {
		return author;
	}
	/**
	 * This method will set the author of the Book to the given argument.
	 * @param author
	 * 		 String to be the new author of the Book.
	 */
	public void setAuthor(String author) {
		this.author = author;
	}
	/**
	 * This method will get the ISBN of the Book.
	 * @return
	 * 		Returns the ISBN of the Book as a String.
	 */
	public String getISBN() {
		return ISBN;
	}
	/**
	 * This method will set the ISBN of the Book to the given argument.
	 * @param ISBN
	 * 		 String to be the new ISBN of the Book.
	 */
	public void setISBN(String ISBN) {
		this.ISBN = ISBN;
	}
	/**
	 * This method will get the price of the Book.
	 * @return
	 * 		Returns the price of the Book as a double.
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * This method will set the price of the Book to the given argument.
	 * @param price
	 * 		 double to be the new price of the Book.
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	/**
	 * This method converts the Book object's properties into a readable format.
	 */
	@Override
	public String toString() {
		return title + " by " + author + " (ISBN: " + ISBN + ", $" + price + ")";
	}
	/**
	 * This method compares a Book object to another Object (casted to type 'Book'). 
	 * Used to compare two Book objects.
	 * @param obj
	 * 		Object to be casted as type 'Book' and compared to another Book object.
	 * @return	
	 * 		Returns false if the Object argument given is null, or if the Object argument given
	 * is not of the same class as the Object it is being compared to.
	 * 
	 * 		Returns true if the Objects being compared are equal.
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(ISBN, other.ISBN) && Objects.equals(author, other.author)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Objects.equals(title, other.title);
	}
	
}

