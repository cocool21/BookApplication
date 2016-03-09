
public class Book {
  private static String author="";
  private static double price=0;
  private static String title="";
  private static String description="";
  private static boolean isInStock=false;
  public Book(){
	  
  }
	  
  public Book(String newAuthor,double newPrice,String newTitle,String newDescription,boolean inStock){
	  setAuthor(newAuthor);
	  setPrice(newPrice);
	  setTitle(newTitle);
	  setDescription(newDescription);
	  setIsInStock(inStock);
  }
  public String getAuthor(){
	  return author;
  }
  public void setAuthor(String value){
	  this.author=value;
  }
  public double getPrice(){
	  return price;
  }
  public void setPrice(double value){
	  this.price=value;
  }
  public String getTitle(){
	  return title;
  }
  public void setTitle(String value){
	  this.title=value;
  }
  public String getDescription(){
	  return description;
  }
  public void setDescription(String value){
	  this.description=value;
  }
  public boolean getIsInStock(){
	  return isInStock;
  }
  public void setIsInStock(boolean value){
	  this.isInStock=value;
  }
    public static String getDisplayText(){
   
		return author+"  "+title+"  "+description;
    }
}
