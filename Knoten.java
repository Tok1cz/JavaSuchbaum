package baum;

/*
 * Hinweise:
 * T ist der generische Parameter der Klasse Knoten.
 * T extends Comparable<T> besagt, dass der Typ T die Methode compareTo() besitzt.
 * Die Bedeutung von "extends Comparable<T>" soll hier nicht weiter erkl�rt werden.
 */
public class Knoten<T extends Comparable<T>> {
	public T value; // Nutzdaten
	public Knoten<T> left; // Referenz auf die Wurzel des linken Teilbaums
	public Knoten<T> right; // Referenz auf die Wurzel des rechten Teilbaums

	// Konstruktor: Erzeugt eine Instanz ohne Kindknoten
	public Knoten(T value) {
		this.value = value;
		this.left = null;
		this.right = null;
	}

}
