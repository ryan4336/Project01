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


/**
 * used to remove book from library
 * @param book the Book to remove
 * @return true if book is removed and false if none to remove
 */
public boolean removeBook(Book book)
{
	for(int i=0; i<bookcount; i++)
	{
		if(books[i].equals(book))
		{
			books[i]=books[bookcount-1];
			books[bookcount-1] = null;
			bookcount--;
			return true;
		}
	}
			return false;
}


/**
 * used to search for book via ISBN
 * @param ISBN of the book to be searched
 * @return if found and null if not 
 */
public Book searchByISBN(String ISBN)
{
	for(int i=0; i<bookcount; i++)
	{
		if(books[i].getISBN().equals(ISBN))
		{
			return books[i];
		}
	}
			return null;
}

/**
 * display books in library
 */
public void displayBooks()
{
	for(int i=0; i<bookcount; i++)
	{
		System.out.println(books[i].toString());
		}
	}
}


