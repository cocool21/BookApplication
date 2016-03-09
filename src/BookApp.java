
public class BookApp {

	public static void main(String[] args) {
		Book myBook=new Book("me",20,"MyBook","I wrote this book",0);
		System.out.println(myBook.getDisplayText());
		System.out.println(myBook.getCost(5));

	}

}
