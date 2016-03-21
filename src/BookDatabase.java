import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BookDatabase {
	private Connection con = null;
	private Statement stmt = null;
	private ResultSet rs = null;
	public BookDatabase(){
		
	}
	public void Connect(){
		 try{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				con = DriverManager.getConnection("jdbc:oracle:thin:ora1/ora1@localhost:1521:orcl");
				}catch(SQLException e) {
					e.printStackTrace();
				}catch (ClassNotFoundException e) {
					e.printStackTrace();
			} finally {
				}
	 }
 public Book findBook(String sku){
	 Book newBook=new Book();	
	 sku.toLowerCase();
		String sql = "select * from books where sku='"+sku+"'";
		try{
			Connect();
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()){
				newBook.setSku(rs.getString("sku"));
				newBook.setTitle(rs.getString("title"));
				newBook.setAuthor(rs.getString("author"));
				newBook.setDescription(rs.getString("description"));
				newBook.setPrice(rs.getDouble("price"));
				//System.out.println(rs.getString(2));
			}
			}catch (SQLException e) {
				e.printStackTrace();
			}
		finally {
			try {
				rs.close();
				stmt.close();
				con.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
	 return newBook;
 }
 
 public void addBook(Book myBook){
	Connect();
		String add = "insert into books "+"(sku,title,author,description,price) "+"values (?,?,?,?,?)";
		try{
			Connect();
			PreparedStatement ps=con.prepareStatement(add);
			ps.setString(1, myBook.getSku());
			ps.setString(2, myBook.getTitle());
			ps.setString(3, myBook.getAuthor());
			ps.setString(4, myBook.getDescription());
			ps.setDouble(5, myBook.getPrice());
			int count=ps.executeUpdate();
			}catch (SQLException e) {
				e.printStackTrace();
			}
		finally {
			try {
				rs.close();
				stmt.close();
				con.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
	
 }
 public void updateBook(Book myBook){
		Connect();
		   
			String update = "update books "+"set title=?, author=?, description=?,price=?  "+"where sku = ?";
			try{
				Connect();
				PreparedStatement ps=con.prepareStatement(update);
				ps.setString(1, myBook.getTitle());
				ps.setString(2, myBook.getAuthor());
				ps.setString(3, myBook.getDescription());
				ps.setDouble(4, myBook.getPrice());
				ps.setString(5, myBook.getSku());
			    int count=ps.executeUpdate();
			    
				}catch (SQLException e) {
					e.printStackTrace();
				}
			finally {
				try {
					stmt.close();
					con.close();
				}catch(SQLException e){
					e.printStackTrace();
				}
			}
		
	 }
 public void deleteBook(Book myBook){
		Connect();
			String delete = "delete from books "+"where sku = ?";
			try{
				Connect();
				PreparedStatement ps=con.prepareStatement(delete);
				ps.setString(1, myBook.getSku());
				int count=ps.executeUpdate();
				}catch (SQLException e) {
					e.printStackTrace();
				}
			finally {
				try {
					stmt.close();
					con.close();
				}catch(SQLException e){
					e.printStackTrace();
				}
			}
		
	 }
}
