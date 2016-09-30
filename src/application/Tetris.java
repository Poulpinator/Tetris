package application;

import java.io.IOException;

import javax.swing.Timer;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

public class Tetris extends AnchorPane {
	@FXML
	private Button btnLeft;
	private Terrain terrain;
	private int iCpt = 0;
	private Timer timerJoueur;
	private Piece piece = new Piece();

	public Tetris() {
		super();
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/Tetris.fxml"));
			loader.setRoot(this);
			loader.setController(this);
			loader.load();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@FXML
	public void initialize() {
		terrain = new Terrain();
		getChildren().add(terrain);
	}

	@FXML
	public void pressLeft(ActionEvent event) {
		terrain.getPiece().deplacementGauche();
	}

	public void pressMid(ActionEvent event) {
		terrain.getPiece().rotationPiece();
	}

	public void pressRight(ActionEvent event) {
		terrain.getPiece().deplacementDroite();
	}

	public void pressBot(ActionEvent event) {
		terrain.getPiece().deplacementBas();
	}

	public void finJeu() {

	}

	public void lancerJeu() {

	}

	public void tick() {

	}

	public void update() {

	}

	public void draw() {

	}

}
