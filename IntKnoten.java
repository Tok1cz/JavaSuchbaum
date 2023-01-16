package baum;

public class IntKnoten {
	public int value; // Nutzdaten
	public IntKnoten left; // Referenz auf die Wurzel des linken Teilbaums
	public IntKnoten right; // Referenz auf die Wurzel des rechten Teilbaums

	// Konstruktor: Erzeugt eine Instanz ohne Kindknoten
	public IntKnoten(int value) {
		this.value = value;
		this.left = null;
		this.right = null;
	};

}