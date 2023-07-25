/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LibraryUi;

/**
 *
 * @author Tanuki
 */
public class BookObj {

    public  String title;
    public  String author;
    public  String isbn;
    public  String bookForm;
    public  String edition;
    
    public static BookObj actualBook;
    
    public BookObj(String title, String author, String isbn, String bookForm, String edition) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.bookForm = bookForm;
        this.edition = edition;
    }
    
    public String getTitle() {
        return this. title;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getIsbn() {
        return this.isbn;
    }

    public String getBookForm() {
        return this.bookForm;
    }

    public String getEdition() {
        return this.edition;
    }

    public BookObj getActualBook() {
        return this.actualBook;
    }
    
}
