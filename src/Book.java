
public class Book {
  private String author="";
  private double price=0;
  private String title="";
  private String description="";
  private boolean isInStock=false;
  private int stock=0;
  public Book(){
	  
  }
	  
  public Book(String newAuthor,double newPrice,String newTitle,String newDescription,int inStock){
	  setAuthor(newAuthor);
	  setPrice(newPrice);
	  setTitle(newTitle);
	  setDescription(newDescription);
	  setStock(inStock);
	  setIsInStock();
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
  public double getStock(){
	  return stock;
  }
  public void setStock(int value){
	  this.stock=value;
  }
  public boolean getIsInStock(){
	  return isInStock;
  }
  public void setIsInStock(){
	  if(stock==0){
	  this.isInStock=false;
	  }else{
		  this.isInStock=true;  
	  }
  }
    public String getDisplayText(){
   
		return author+"  "+title+"  "+description;
    }
    public double getCost(int number){
    	if(number<=stock){
		return (number*price);
		}else{
			System.out.println("Stock is below the number you requested");
			return stock*price;
			
		}
    	
    }
}
