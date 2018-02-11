package character;

import java.awt.Color;
import components.Piece;

public class King extends Piece{

	public King(Color c) {
		super(c);
	}

	@Override
	public String rep() {
		return "♚";
	}

	@Override
	public void getValidMoves(boolean[][] moveArray, int y, int x) {
		System.out.println("Получение Возможных ходов для Короля");
		int i;
		int j;

		j = y - 1;
		if(j >= 0){
			moveArray[x][j] = this.emptyOrOpponent(x, j);

			i = x - 1;
			if(i >= 0) moveArray[i][j] = this.emptyOrOpponent(i, j);

			i = x + 1;
			if(i < 8 ) moveArray[i][j] = this.emptyOrOpponent(i, j);
		}
		

		j = y + 1;
		if(j < 8){
			moveArray[x][j] = this.emptyOrOpponent(x, j);

			i = x - 1;
			if(i >= 0) moveArray[i][j] = this.emptyOrOpponent(i, j);

			i = x + 1;
			if(i < 8 ) moveArray[i][j] = this.emptyOrOpponent(i, j);
		}

		i = x - 1;
		if(i >= 0) moveArray[i][y] = this.emptyOrOpponent(i, y);

		i = x + 1;
		if(i < 8) moveArray[i][y] = this.emptyOrOpponent(i, y);
	}
	
}
