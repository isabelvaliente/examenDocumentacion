// `package pieces;` declara que el archivo Java actual pertenece al paquete `pieces`. Este
// el paquete es una forma de organizar clases e interfaces relacionadas en Java. Ayuda a evitar nombrar
// entra en conflicto y facilita la localización y el uso de clases relacionadas.

package pieces;

/*
 * @autor isabel
 */
import java.util.ArrayList;

// `import chess.Cell;` está importando la clase `Cell` del paquete `chess`. Esto permite que la `Torre`
// class para usar la clase `Cell` sin tener que calificar completamente su nombre cada vez que se usa.
import chess.Cell;

/**
 * Esta es la clase Rook heredada de la clase abstracta Piece
 *
 */
public class Rook extends Piece {

	// Constructor
	public Rook(String i, String p, int c) {
		setId(i);
		setPath(p);
		setColor(c);
	}

	// Función de movimiento definida
	// Este es un método que define los posibles movimientos de una pieza de Torre
	// en un tablero de ajedrez. Se toma en un
	// Matriz 2D de objetos Cell que representan el estado actual del tablero, así
	// como el x y el y
	// coordenadas de la posición actual de la Torre. Luego calcula todos los
	// movimientos posibles que la Torre
	// puede hacer en función de sus reglas de movimiento (es decir, puede moverse
	// horizontal o verticalmente). El método
	// devuelve una ArrayList de objetos Cell que representan todos los movimientos
	// posibles que puede realizar la Torre.
	public ArrayList<Cell> move(Cell state[][], int x, int y) {
		// Torre solo puede moverse horizontal o verticalmente
		possiblemoves.clear();
		int tempx = x - 1;
		while (tempx >= 0) {// Este bloque de código está comprobando si la torre puede moverse
							// horizontalmente hacia la izquierda en el tablero de ajedrez. Él
							// comienza inicializando una variable temporal `tempx` a la izquierda de la
							// torre actual
							// coordenada x. Luego entra en un bucle while que continúa mientras `tempx` sea
							// mayor que o
							// igual a 0.

			if (state[tempx][y].getpiece() == null)
				possiblemoves.add(state[tempx][y]);
			else if (state[tempx][y].getpiece().getcolor() == this.getcolor())
				break;
			else {
				possiblemoves.add(state[tempx][y]);
				break;
			}
			tempx--;
		}
		// Este bloque de código verifica todos los movimientos posibles que una Torre
		// puede hacer en un tablero de ajedrez. comienza por
		// inicializando una variable temporal `tempx` a la derecha de la coordenada x
		// actual de la Torre. entonces
		// entra en un bucle while que continúa mientras `tempx` sea inferior a 8.
		// Dentro del bucle, comprueba
		// si la celda en las coordenadas `tempx` e `y` actuales está vacía u ocupada
		// por una parte del
		// color opuesto. Si está vacío, agrega la celda a la lista de posibles
		// movimientos. si esta ocupado
		// por una pieza del mismo color, sale del bucle. Si está ocupado por una parte
		// del
		// color opuesto, agrega la celda a la lista de posibles movimientos y sale del
		// ciclo. El
		// el mismo proceso se repite para las direcciones izquierda, arriba y abajo.
		// Finalmente, el método devuelve el
		// lista de todos los movimientos posibles que puede hacer la Torre.
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
		int tempy = y - 1;
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
		return possiblemoves;
	}
}
