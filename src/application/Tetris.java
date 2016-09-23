package application;

import java.io.IOException;

import javax.swing.Timer;
import java.util.TimerTask;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

public class Tetris extends AnchorPane {
	@FXML
	private Button btnLeft;
	int iCpt=0;
	private Timer timerJoueur;
	Terrain test=new Terrain();

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
	public void pressLeft(ActionEvent event) {
		System.out.println("CLICKG");
	}

	public void pressMid(ActionEvent event) {
		System.out.println(iCpt);
		iCpt++;
		test.creerPiece(iCpt);
	}

	public void pressRight(ActionEvent event) {
		System.out.println("CLICKD");
		
	}

	public void pressBot(ActionEvent event) {
		System.out.println("CLICKB");
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
