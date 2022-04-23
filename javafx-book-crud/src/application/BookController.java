package application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import java.util.ResourceBundle;

public class BookController {
	
	    BookService bookService =new BookService();
	
	  @FXML
	    private TextField tfBookId;
	    
	    @FXML
	    private TextField tfBookName;

	    @FXML
	    private TextField tfBookType;
	    

	    
	    
	
	   @FXML
	    private void onClickAddBtn() {
	    	String query = "insert into book values("+tfBookId.getText()+",'"+tfBookName.getText()+"','"+tfBookType.getText()+"')";
	    	bookService.executeQuery(query);
	    	bookService.showBooks();

	    }
	    
	    
	    @FXML 
	    private void onClickUpdateBtn() {

	    }
	    
	    @FXML
	    private void onClickDeleteBtn() {

	    }
	   
	   
	
}
