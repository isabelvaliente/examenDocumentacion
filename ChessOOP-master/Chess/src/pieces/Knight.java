package pieces;

/*
 * @autor isabel
 */
import java.util.ArrayList;

import chess.Cell;

/**
 * Esta es la clase Knight heredada de la clase abstracta Piece
 *
 *
 */
public class Knight extends Piece {

	// Constructor
	public Knight(String i, String p, int c) {
		setId(i);
		setPath(p);
		setColor(c);
	}

	// Este código implementa la lógica de movimiento de una pieza de peón en un
	// juego de ajedrez. El método `mover`
	// toma el estado actual del tablero y la posición del Peón, y devuelve una
	// lista de todos
	// las posibles jugadas que puede realizar el Peón.
	public ArrayList<Cell> move(Cell state[][], int x, int y) {
		possiblemoves.clear();
		int posx[] = { x + 1, x + 1, x + 2, x + 2, x - 1, x - 1, x - 2, x - 2 };
		// Este código está implementando la lógica de movimiento para una pieza de Peón
		// en un ajedrez
		// juego. El método `mover`
		// toma el estado actual del tablero y la posición del Peón, y
		// devuelve una lista de todos
		// las posibles jugadas que puede realizar el Peón.
		int posy[] = { y - 2, y + 2, y - 1, y + 1, y - 2, y + 2, y - 1, y + 1 };
		for (int i = 0; i < 8; i++)
			if ((posx[i] >= 0 && posx[i] < 8 && posy[i] >= 0 && posy[i] < 8))
				if ((state[posx[i]][posy[i]].getpiece() == null
						|| state[posx[i]][posy[i]].getpiece().getcolor() != this.getcolor())) {
					possiblemoves.add(state[posx[i]][posy[i]]);
				}
		return possiblemoves;
	}
}