package project01;



import project01.book.Book;
import project01.library.Library;

public class LibraryApp {

	public static void main(String[] args) {
		//create a library object
		Library library = new Library();
		
		//create books to add to library
		Book book3 = new Book("Clean Code", "Robert C. Martin", "978-0135166307", 40.99);
		Book book4 = new Book("Design Patterns", "Erich Gamma", "978-0201633610", 50.99);
		Book book5 = new Book("The Pragmatic Programmer", "Andrew Hunt", "978-0135957059", 45.99);
		
		//add books to library
		System.out.println("Adding books...");
		library.addBook(book3);
		library.addBook(book4);
		library.addBook(book5);
		System.out.println("Books added successfully.");
		
		//search for a book by ISBN
		library.searchByISBN("978-0135166307");
		
		//display all books in library
		library.displayBooks();
		
		//remove a book from the library
		library.removeBook(book4);
		
		//display all books again
		library.displayBooks();
		
		//try to remove a book that does not exist in the library
		library.removeBook(book4);

	}

}
