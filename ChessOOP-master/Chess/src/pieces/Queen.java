// `package pieces;` declara que el archivo Java actual pertenece al paquete `pieces`. Este
// el paquete es una forma de organizar clases e interfaces relacionadas en Java. Permite mejor
// organización y gestión del código.
package pieces;

/*
 * @autor isabel
 */
// `import java.util.ArrayList;` está importando la clase `ArrayList` del paquete `java.util`. Este
// permite que la clase `ArrayList` se use en el archivo Java actual sin tener que calificar completamente su
// nombre cada vez que se usa.
import java.util.ArrayList;

import chess.Cell;

/**
 * Esta es la Clase Reina heredada de la clase Pieza abstracta
 *
 */
public class Queen extends Piece {

	// Constructors
	public Queen(String i, String p, int c) {
		setId(i);
		setPath(p);
		setColor(c);
	}

	// Función de movimiento definida
	public ArrayList<Cell> move(Cell state[][], int x, int y) {
		// La reina tiene la mayor cantidad de movimientos posibles
		// Queen puede moverse cualquier cantidad de pasos en las 8 direcciones
		// Los posibles movimientos de la dama son una combinación de torre y alfil
		possiblemoves.clear();

		// Comprobación de posibles movimientos en dirección vertical
		int tempx = x - 1;
		while (tempx >= 0) {
			if (state[tempx][y].getpiece() == null)
				possiblemoves.add(state[tempx][y]);
			else if (state[tempx][y].getpiece().getcolor() == this.getcolor())
				break;
			else {
				possiblemoves.add(state[tempx][y]);
				break;
			}
			// Este código define el movimiento de un Alfil en un tablero de ajedrez.
			// Comprueba todo
			// posibles movimientos diagonales
			// en las cuatro direcciones (NW, NE, SW, SE) y las agrega a una ArrayList de
			// movimientos posibles. El código
			// usa un ciclo while para verificar cada celda diagonal en una dirección dada
			// hasta que
			// llega al final de la
			// tablero o encuentra una pieza. Si la celda está vacía, la agrega a la lista
			// de
			// movimientos posibles. Si
			// la celda contiene una pieza del mismo color, deja de registrar eso
			// dirección. Si la celda
			// contiene una pieza del color opuesto, la agrega a la lista de posibles
			// se mueve y se detiene
			// comprobando en esa dirección.
			tempx--;
		}

		tempx = x + 1;
		while (tempx < 8) {
			if (state[tempx][y].getpiece() == null)
				possiblemoves.add(state[tempx][y]);
			else if (state[tempx][y].getpiece().getcolor() == this.getcolor())
				break;
			else {
				possiblemoves.add(state[tempx][y]);
				break;
			}
			tempx++;
		}

		// Comprobación de posibles movimientos en dirección horizontal
		int tempy = y - 1;
		// Este bloque de código está comprobando posibles movimientos en la dirección
		// horizontal
		// por la pieza de la Reina. Él
		// comienza comprobando posibles movimientos a la izquierda de la posición
		// actual
		// (reduciendo `tempy`
		// hasta que llega a 0), y luego verifica posibles movimientos a la derecha del
		// posición actual
		// (aumentando `tempy` hasta llegar a 7).
		while (tempy >= 0) {
			if (state[x][tempy].getpiece() == null)
				possiblemoves.add(state[x][tempy]);
			else if (state[x][tempy].getpiece().getcolor() == this.getcolor())
				break;
			else {
				possiblemoves.add(state[x][tempy]);
				break;
			}
			tempy--;
		}
		tempy = y + 1;
		while (tempy < 8) {
			if (state[x][tempy].getpiece() == null)
				possiblemoves.add(state[x][tempy]);
			else if (state[x][tempy].getpiece().getcolor() == this.getcolor())
				break;
			else {
				possiblemoves.add(state[x][tempy]);
				break;
			}
			tempy++;
		}
		// Comprobación de posibles movimientos en dirección diagonal
		tempx = x + 1;
		tempy = y - 1;
		while (tempx < 8 && tempy >= 0) {
			if (state[tempx][tempy].getpiece() == null)
				possiblemoves.add(state[tempx][tempy]);
			else if (state[tempx][tempy].getpiece().getcolor() == this.getcolor())
				break;
			else {
				possiblemoves.add(state[tempx][tempy]);
				break;
			}
			tempx++;
			tempy--;
		}
		tempx = x - 1;
		tempy = y + 1;
		while (tempx >= 0 && tempy < 8) {
			if (state[tempx][tempy].getpiece() == null)
				possiblemoves.add(state[tempx][tempy]);
			else if (state[tempx][tempy].getpiece().getcolor() == this.getcolor())
				break;
			else {
				possiblemoves.add(state[tempx][tempy]);
				break;
			}
			tempx--;
			tempy++;
		}
		// Este bloque de código está comprobando posibles movimientos en la dirección
		// diagonal
		// (arriba a la izquierda para
		// abajo a la derecha) para la pieza de la Reina. Comienza inicializando `tempx`
		// y
		// `tempy` a la posición
		// un paso en diagonal hacia la parte superior izquierda de la posición actual
		// (`x-1` y `y-1`,
		// respectivamente), y
		// luego verifica posibles movimientos en esa dirección al disminuir ambos
		// `tempx`
		// y `tempy` hasta
		// ya sea `tempx` o `tempy` llega a 0. Para cada posición marcada, agrega el
		// posición a la
		// lista de `posibles jugadas` si está vacía o contiene una pieza del oponente,
		// y
		// deja de registrar eso
		// dirección si encuentra una pieza del mismo color.
		tempx = x - 1;
		tempy = y - 1;
		while (tempx >= 0 && tempy >= 0) {
			if (state[tempx][tempy].getpiece() == null)
				possiblemoves.add(state[tempx][tempy]);
			else if (state[tempx][tempy].getpiece().getcolor() == this.getcolor())
				break;
			else {
				possiblemoves.add(state[tempx][tempy]);
				break;
			}
			tempx--;
			tempy--;
		}
		tempx = x + 1;
		tempy = y + 1;
		while (tempx < 8 && tempy < 8) {
			if (state[tempx][tempy].getpiece() == null)
				possiblemoves.add(state[tempx][tempy]);
			else if (state[tempx][tempy].getpiece().getcolor() == this.getcolor())
				break;
			else {
				possiblemoves.add(state[tempx][tempy]);
				break;
			}
			tempx++;
			tempy++;
		}
		return possiblemoves;
	}
}