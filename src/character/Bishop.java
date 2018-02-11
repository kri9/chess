package character;

import java.awt.Color;

import components.Board;
import components.Piece;

public class Bishop extends Piece{

	public Bishop(Color c) {
		super(c);

	}

	@Override
	public String rep() {
		return "♝";
	}

	@Override
	public void getValidMoves(boolean[][] moveArray, int y, int x) {
		System.out.println("Получение возможных ходов для Слона");

		int i = x - 1;
		int j = y - 1 ;
		boolean empty = true;
		while( i >= 0 && j >= 0){
			moveArray[i][j] = this.emptyOrOpponent(i, j) && empty;
			if(!isEmpty(j, i))	empty = false;
			i--;
			j--;
		}
		empty = true;

		i = x + 1;
		j = y - 1 ;
		while( i < 8 && j >= 0){
			moveArray[i][j] = this.emptyOrOpponent(i, j) && empty;
			if(!isEmpty(j, i))	empty = false;
			i++;
			j--;
		}
		empty = true;

		i = x - 1;
		j = y + 1 ;
		while( i >= 0 && j < 8){
			moveArray[i][j] = this.emptyOrOpponent(i, j) && empty;
			if(!isEmpty(j, i))	empty = false;
			i--;
			j++;
		}

		empty = true;
		i = x + 1;
		j = y + 1 ;
		while( i < 8 && j < 8){
			moveArray[i][j] = this.emptyOrOpponent(i, j) && empty;
			if(!isEmpty(j, i)) empty = false;
			i++;
			j++;
		}
		
	}

}
