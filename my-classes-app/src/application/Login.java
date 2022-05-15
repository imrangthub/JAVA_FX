package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Login extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Login");
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(25, 25, 25, 25));

		Text scenetitle = new Text();
		scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 15));
		grid.add(scenetitle, 0, 0, 2, 1);

		Label userName = new Label("SSN:");
		grid.add(userName, 0, 1);

		TextField userTextField = new TextField();
		grid.add(userTextField, 1, 1);

		Button loginBtn = new Button("Login");
		Button exitBtn = new Button("Exit");

		HBox hbBtn = new HBox(10);
		hbBtn.getChildren().addAll(exitBtn, loginBtn);
		grid.add(hbBtn, 1, 10);

		Scene scene = new Scene(grid, 300, 250);
		primaryStage.setScene(scene);
		primaryStage.show();
		
		loginBtn.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {

				String ssnVal = userTextField.getText();

				if (!ssnVal.trim().isEmpty()) {
					scenetitle.setText(ssnVal);
				} else {
					scenetitle.setText("Error: Please enter SSN");
				}
			}
		});
		exitBtn.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				System.out.println("Exit Htbn");
				
				MyClasses myClassObj = new MyClasses();
				
				Scene myClaScr  = myClassObj.showMyClassScene(primaryStage, scene);
				
				primaryStage.setScene(myClaScr);
				primaryStage.show();
				
			}
		});
		


	}

}
