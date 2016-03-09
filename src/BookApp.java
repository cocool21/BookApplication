import java.util.Scanner;
public class BookApp {

	public static void main(String[] args) {
		Book myBook=new Book("me",20,"MyBook","I wrote this book",3);
		Scanner sc=new Scanner(System.in);
		System.out.println(myBook.getDisplayText());
		System.out.println("Enter the number of book you want");
		int number=sc.nextInt();
		double cost=myBook.getCost(number);
		System.out.println("Available stock: "+myBook.getStock());
		System.out.println("You pay: "+cost);

	}

}
