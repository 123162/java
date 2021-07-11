
package javaapplication46;


public class Book {
    public String name,author,publisher;
    public int numberOfPage;

    public Book(String name, String author, String publisher, int numberOfPage) {
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        if(numberOfPage<1){
            this.numberOfPage=10;
        }else{
            this.numberOfPage = numberOfPage;

        }
    }
    
    
}
