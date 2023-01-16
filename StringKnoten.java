package baum;

public class StringKnoten {
	public String value; // Nutzdaten
	public StringKnoten left; // Referenz auf die Wurzel des linken Teilbaums
	public StringKnoten right; // Referenz auf die Wurzel des rechten Teilbaums

	// Konstruktor: Erzeugt eine Instanz ohne Kindknoten
	public StringKnoten(String value) {
		this.value = value;
		this.left = null;
		this.right = null;
	};

}
