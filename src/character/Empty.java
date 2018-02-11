package character;

import java.awt.Color;
import components.Piece;

public class Empty extends Piece {

	public Empty(Color c) {
		super(c);

	}

	@Override
	public String rep() {
		return "";
	}
	@Override
	public void getValidMoves(boolean[][] moveArray, int y, int x) {
		System.out.println("Получение возможных ходов для пустой клетки");

		
	}

}
