
public class Book {
  private String author;
  private int pagecount;
  private double price;
  private String title;
  public Book(){
	  
  }
  public String getAuthor(){
	  return author;
  }
  public void setAuthor(String value){
	  this.author=value;
  }
    private static void getDisplayText(Book author,Book title,Book description){
    	System.out.println(author);
    	System.out.println(title);
    	System.out.println(description);
    }
}
