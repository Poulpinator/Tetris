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
			
			Rectangle bloc = new Rectangle();
			bloc.setX(100);
			bloc.setY(100);
			bloc.setWidth(20);
			bloc.setHeight(20);
			bloc.setFill(Color.GREEN);
			bloc.setStroke(Color.BLACK);
			bloc.setStrokeWidth(1.5);
			root.getChildren().add(bloc);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
        
        
		
      
		
	}

	public static void main(String[] args) {
		launch(args);
	}

	
}
