
public class BookDatabase {
 public Book findBook(String sku){
	 Book newBook;	
	 sku.toLowerCase();
	 switch (sku){ 
		case "java1001":
			newBook = new Book("Kathy Sierra and Bert Bates", 47.5, "Head First Java",
					"Easy to read Java workbook", 100);
			break;
     case "java1002":
    	 newBook = new Book("Bruce Eckel", 20, "Thinking in Java",
					"Details about Java under the hood", 80);
    	 break;
     case "orcl1003":
    	 newBook = new Book("Jeanne Boyarsky", 45, "OCP: Oracle Certified Professional Java SE",
					"Everything you need to know in one place", 70);
    	 break;
     case "python1004":
    	 newBook = new Book("Al Sweigart", 10.5, "Automate the Boring Stuff with Python",
					"Fun with Python", 92);
    	 break;
     case "zombie1005":
    	 newBook = new Book("Kathy Sierra and Bert Bates", 47.5, "Head First Java",
					"Easy to read Java workbook", 100);
    	 break;
     case "rasp1006":
    	 newBook = new Book("Kathy Sierra and Bert Bates", 47.5, "Head First Java",
					"Easy to read Java workbook", 100);
    	 break;
     default:System.out.println("Book Not Found");
    	 newBook= new Book("",0,"","",0);
     break;}
	 return newBook;
 }
	

}
