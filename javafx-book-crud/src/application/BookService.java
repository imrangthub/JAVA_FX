package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class BookService {

	public void executeQuery(String query) {
		Connection conn = getConnection();
		Statement st;
		try {
			st = conn.createStatement();
			System.out.println(query);
			st.executeUpdate(query);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void showBooks() {
		ObservableList<Book> list = getBooksList();
		System.out.print("BookData: " + list);

	}

	public ObservableList<Book> getBooksList() {
		ObservableList<Book> booksList = FXCollections.observableArrayList();
		Connection connection = getConnection();
		String query = "SELECT * FROM book ";
		Statement st;
		ResultSet rs;

		try {
			st = connection.createStatement();
			rs = st.executeQuery(query);
			Book bookObj;
			while (rs.next()) {
				bookObj = new Book(rs.getLong("id"), rs.getString("name"), rs.getString("type"));
				booksList.add(bookObj);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return booksList;
	}

	public Connection getConnection() {
		Connection conn;
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/springbootdb", "root", "root");
			return conn;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
