package character;

import java.awt.Color;
import components.Piece;

public class Rook extends Piece{

	public Rook(Color c) {
		super(c);

	}

	@Override
	public String rep() {
		return "♜";
	}

	@Override
	public void getValidMoves(boolean[][] moveArray, int y, int x) {
		System.out.println("Получение возможных ходов для Ладьи");
		boolean empty = true;

		int i = y - 1;
		while(i >= 0){
			moveArray[x][i] = this.emptyOrOpponent(x, i) && empty;
			if(!isEmpty(i, x))	empty = false;
			i--;
		}
		empty = true;

		i = y + 1;
		while(i < 8){
			moveArray[x][i] = this.emptyOrOpponent(x, i) && empty;
			if(!isEmpty(i, x))	empty = false;
			i++;
		}
		empty = true;

		i = x - 1;
		while(i >= 0){
			moveArray[i][y] = this.emptyOrOpponent(i, y) && empty;
			if(!isEmpty(y, i))	empty = false;
			i--;
		}
		empty = true;

		i = x + 1;
		while(i < 8){
			moveArray[i][y] = this.emptyOrOpponent(i, y) && empty;
			if(!isEmpty(y, i))	empty = false;
			i++;
		}
	}
}
