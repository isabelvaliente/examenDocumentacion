package pieces;

/*
 * @autor isabel
 */
import java.util.ArrayList;

import chess.Cell;

/**
 * Esta es la Clase de Piezas. Es una clase abstracta de la que se heredan todas
 * las piezas reales.
 * Define toda la función común a todas las piezas
 * La función move() es una función abstracta que debe anularse en todas las
 * clases heredadas
 * Implementa una interfaz Cloneable ya que se requiere una copia de la pieza
 * muy a menudo
 */
public abstract class Piece implements Cloneable {

	// Member Variables
	private int color;
	private String id = null;
	private String path;
	protected ArrayList<Cell> possiblemoves = new ArrayList<Cell>(); // Protected (access from child classes)

	public abstract ArrayList<Cell> move(Cell pos[][], int x, int y); // Abstract Function. Must be overridden

	// Id Setter
	public void setId(String id) {
		this.id = id;
	}

	// Path Setter
	public void setPath(String path) {
		this.path = path;
	}

	// Color Setter
	public void setColor(int c) {
		this.color = c;
	}

	// Path getter
	public String getPath() {
		return path;
	}

	// Id getter
	public String getId() {
		return id;
	}

	// Color Getter
	public int getcolor() {
		return this.color;
	}

	// Función para devolver una copia "superficial" del objeto. La copia tiene
	// exactamente el mismo valor de variable pero una referencia diferente
	public Piece getcopy() throws CloneNotSupportedException {
		return (Piece) this.clone();
	}
}