package application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Register {
	
	Scene sceneMyCls, mainScreen;

	Button cancelBtn = new Button("Cancel");
	Button addBtn = new Button("Add");
	Label lbPageHeader = new Label("Registration Page");

	public Scene showRegisterScene(Stage primaryStage, Scene mainScren) {
        this.mainScreen = mainScren;
		VBox vBox = new VBox(20);
		HBox hBox = new HBox(10);
		hBox.getChildren().addAll(cancelBtn, addBtn);
		vBox.getChildren().addAll(lbPageHeader, hBox);

		
		
		sceneMyCls = new Scene(vBox, 600, 400);
		
		cancelBtn.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				System.out.println("Exit Htbn");
				
				MyClasses myClassObj = new MyClasses();
				
				Scene myClaScr  = myClassObj.showMyClassScene(primaryStage, mainScren);
				primaryStage.setScene(myClaScr);
				primaryStage.show();
				
			}
		});

		return sceneMyCls;
	}
	
	

}
