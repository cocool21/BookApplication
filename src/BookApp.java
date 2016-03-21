import java.util.Scanner;
public class BookApp {

	public static void main(String[] args) {
      boolean quit=false;
      Scanner sc=new Scanner(System.in);
      String yn;
      String sku;
      int i;
      Book myBook;
      BookDatabase bd=new BookDatabase();
      
      while(quit==false){
		
		System.out.println("What do you want to do?");
		System.out.println("Find a book in database - 1");
		System.out.println("Update book database    - 2");
		System.out.println("Delete from database    - 3");
		i=sc.nextInt();
		sc.nextLine();
		if(i==1){
	    System.out.println("Enter the sku number");
		sku=sc.nextLine();
		myBook=bd.findBook(sku);
		if(myBook.getSku().equals("")){
					System.out.println("Add book information below. ");
					System.out.println("Enter the sku: ");
					myBook.setSku(sc.nextLine());
					
					System.out.println("Enter the author name: ");
					myBook.setAuthor(sc.nextLine());
					
					
					System.out.println("Enter the title: ");
					myBook.setTitle(sc.nextLine());
					
					
					System.out.println("Enter the description: ");
					myBook.setDescription(sc.nextLine());
					
					
					System.out.println("Enter the price: ");
					double price = sc.nextDouble();
					sc.nextLine();
					myBook.setPrice(price);
					
					bd.addBook(myBook);

		}else{
		System.out.println(myBook.getDisplayText());
		}
		}else if(i==2){
			System.out.println("Update book information below. ");
			System.out.println("Enter the sku: ");
			sku=sc.nextLine();
			myBook=bd.findBook(sku);
			System.out.println("Enter the author name: ");
			myBook.setAuthor(sc.nextLine());
			System.out.println("Enter the title: ");
			myBook.setTitle(sc.nextLine());
			System.out.println("Enter the description: ");
			myBook.setDescription(sc.nextLine());
			System.out.println("Enter the price: ");
			myBook.setPrice(sc.nextDouble());
			sc.nextLine();
			bd.updateBook(myBook);
		}else if(i==3){
			System.out.println("Enter the sku number");
			sku=sc.nextLine();
			myBook=bd.findBook(sku);
			bd.deleteBook(myBook);
			
		}else{}
		System.out.println("Do you want to quit?(y/n)");
		yn=sc.nextLine();
		if(yn.toLowerCase().equals("y")){
			quit=true;
		}
      }
      System.out.println("Thank you for using the BookApp.");
		sc.close();
		

	}

}
