package com.gartham.apps.marionette;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Marionette extends Application {
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(getClass().getResource("MarionetteGUI.fxml"));
		Parent node = loader.load();

		Scene s = new Scene(node);
		s.getStylesheets().add("zeale/apps/stuff/api/guis/windows/stylesheets/BasicStyles.css");
		primaryStage.setScene(s);
		primaryStage.show();
	}
}
