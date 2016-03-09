import java.util.Scanner;
public class BookApp {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sku number of book you want");
		String sku=sc.next();
		BookDatabase bd=new BookDatabase();
		Book myBook=bd.findBook(sku);
		System.out.println(myBook.getDisplayText());
		

	}

}
