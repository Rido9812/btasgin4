
package authorr;

public class Book {
    public String BookID;
    public String title;
    public Author author; 
    
    
    public Book(String BookID, String title, Author author) {
        this.BookID = BookID;
        this.title = title;
        this.author = author;
    }
    
    
    public Book() {}
    
  
    public String getID() {
        return BookID;
    }

    public void setID(String BookID) {
        this.BookID = BookID; 
    }

   
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

   
    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    
    @Override
    public String toString() {
        return "Book{" +
               "BookID='" + BookID + '\'' +
               ", title='" + title + '\'' +
               ", author=" + author +
               '}';
    }
}

