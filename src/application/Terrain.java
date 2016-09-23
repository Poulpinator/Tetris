package application;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Terrain {
	
	private int iTailleX;
	private int iTailleY;
	
	
	public void creerPiece(int iCpt)
	{
		if (iCpt==1)
		{
			Tetris root = start.Tetris;
			Rectangle bloc = new Rectangle();
			bloc.setX(100);
			bloc.setY(0);
			bloc.setWidth(20);
			bloc.setHeight(20);
			bloc.setFill(Color.GREEN);
			bloc.setStroke(Color.BLACK);
			bloc.setStrokeWidth(1.5);
			root.getChildren().add(bloc);
		}
		
	}
	
	public void enleverLigne()
	{
		
	}

}
