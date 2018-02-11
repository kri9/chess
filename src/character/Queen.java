package character;

import java.awt.Color;
import components.Piece;

public class Queen extends Piece{

	public Queen(Color c) {
		super(c);

	}

	@Override
	public String rep() {
		return "♛";
	}

	@Override
	public void getValidMoves(boolean[][] moveArray, int y, int x) {
		System.out.println("Получение возможных ходов для Ферзя");
		boolean empty = true;

		int i = y - 1;
		while(i >= 0){
			moveArray[x][i] = empty && this.emptyOrOpponent(x, i);
			if(!isEmpty(i, x))	empty = false;
			i--;
		}
		empty = true;

		i = y + 1;
		while(i < 8){
			moveArray[x][i] = empty && this.emptyOrOpponent(x, i);
			if(!isEmpty(i, x))	empty = false;
			i++;
		}
		empty = true;

		i = x - 1;
		while(i >= 0){
			moveArray[i][y] = empty && this.emptyOrOpponent(i, y);
			if(!isEmpty(y, i))	empty = false;
			i--;
		}
		empty = true;

		i = x + 1;
		while(i < 8){
			moveArray[i][y] = empty && this.emptyOrOpponent(i, y);
			if(!isEmpty(y, i))	empty = false;
			i++;
		}
		empty = true;

		i = x - 1;
		int j = y - 1 ;
		while( i >= 0 && j >= 0){
			moveArray[i][j] = empty && this.emptyOrOpponent(i, j);
			if(!isEmpty(j, i))	empty = false;
			i--;
			j--;
		}
		empty = true;

		i = x + 1;
		j = y - 1 ;
		while( i < 8 && j >= 0){
			moveArray[i][j] = empty && this.emptyOrOpponent(i, j);
			if(!isEmpty(j, i))	empty = false;
			i++;
			j--;
		}
		empty = true;

		i = x - 1;
		j = y + 1 ;
		while( i >= 0 && j < 8){
			moveArray[i][j] = empty && this.emptyOrOpponent(i, j);
			if(!isEmpty(j, i))	empty = false;
			i--;
			j++;
		}
		empty = true;

		i = x + 1;
		j = y + 1 ;
		while( i < 8 && j < 8){
			moveArray[i][j] = empty && this.emptyOrOpponent(i, j);
			if(!isEmpty(j, i))	empty = false;
			i++;
			j++;
		}
	}

}
