package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;




public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			
			Tetris root = new Tetris();
			Scene scene = new Scene(root, 400, 400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			
		
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
        
        
		
      
		
	}

	public static void main(String[] args) {
		launch(args);
	}

	
}
