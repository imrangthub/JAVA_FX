package application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MyClasses {

	Scene sceneMyCls, mainScreen;
	Button exitBtn = new Button("Exit");
	Button addBtn = new Button("Add");
	Button removeBtn = new Button("Remove");
	Label lbPageHeader = new Label("Manage Class");

	public Scene showMyClassScene(Stage primaryStage, Scene mainScren) {
        this.mainScreen = mainScren;
		VBox vBox = new VBox(20);
		
		HBox hBox = new HBox(10);
		hBox.getChildren().addAll(removeBtn, addBtn);
		vBox.getChildren().addAll(lbPageHeader,exitBtn, hBox);
		sceneMyCls = new Scene(vBox, 600, 400);
		
		 Separator separator = 
			        new Separator(Orientation.HORIZONTAL);
		
		addBtn.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				System.out.println("Add Htbn");
				
				Register regObj = new Register();
				
				Scene myClaScr  = regObj.showRegisterScene(primaryStage, mainScren);
				
				primaryStage.setScene(myClaScr);
				primaryStage.show();
				
			}
		});
		removeBtn.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				System.out.println("removeBtn Htbn");

			}
		});

		return sceneMyCls;
	}
	
	

	


}
