package application;

import javafx.scene.layout.Pane;

public class Bloc extends Pane {

	private int iPosX = 100;
	private int iPosY = 0;

	public Bloc() {
		setWidth(10);
		setHeight(10);
	}

	public int getiPosX() {
		return iPosX;
	}

	public void setiPosX(int iPosX) {
		this.iPosX = iPosX;
	}

	public int getiPosY() {
		return iPosY;
	}

	public void setiPosY(int iPosY) {
		this.iPosY = iPosY;
	}

}
