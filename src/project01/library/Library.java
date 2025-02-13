package project01.library;
import project01.book.*;

/**
 * create library class to manage array of Book objects
 */
public class Library 
{
	private Book[] books;
	private int bookcount;
	
/**
 * initialize library w fixed size of 5 and private int count to keep track of
 * number of books
 */
public Library()
{
	books = new Book[5];
	bookcount = 0;
}

/**
 * used to add book to library
 * @param book the Book to add
 * @return true if book is added and false if libraries full
 */
public boolean addBook(Book book)
{
	if(bookcount<books.length)
	{
		books[bookcount]=book;
		bookcount++;
		return true;
	}
		return false;
}
}


