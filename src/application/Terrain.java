package application;

import java.util.ArrayList;
import java.util.List;

import javafx.scene.layout.Pane;

public class Terrain extends Pane {
	private Piece piece;
	private List<Bloc> blocs = new ArrayList<Bloc>();
	private int iTailleX = 20;
	private int iTailleY = 20;

	public Terrain() {
		creerPiece();
	}

	public void creerPiece() {
		piece = new Piece();
		getChildren().add(piece);

	}

	public void enleverLigne() {

	}

	public Piece getPiece() {
		return piece;
	}
}
