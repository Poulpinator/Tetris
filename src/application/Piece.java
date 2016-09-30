package application;

import javafx.scene.layout.Pane;

public class Piece extends Pane {

	private TypePiece type;

	Bloc bloc = new Bloc();

	public Piece() {
		getChildren().add(bloc);
		type = TypePiece.creer();
	}

	public void deplacementBas() {
		setLayoutY(getLayoutY() + 10);

	}

	public void deplacementGauche() {
		setLayoutX(getLayoutX() - 10);

	}

	public void deplacementDroite() {
		setLayoutX(getLayoutX() + 10);

	}

	public void rotationPiece() {

	}

}
