package baum;

public class IntSuchbaum {
	private IntKnoten root; // Die Wurzel dieses Suchbaums

	public IntSuchbaum() { // Konstruktor erzeugt einen leeren Suchbaum
		root = null;
	}

	// In diesen Baum einen Knoten mit Wert value einfügen:
	public void einfuegen(int value) {
		root = einfuegen(root, value); // siehe unten private Methode einfuegen()
	}
	
	private IntKnoten einfuegen(IntKnoten aktuelleWurzel, int value) {
		// aktuelleWurzel: Referenz auf die Wurzel eines Teilbaums B.
		// Falls in B kein Knoten mit value existiert, wird einer eingefügt.
		// Eine Referenz auf die Wurzel von B wird zurückgegeben.
		if (aktuelleWurzel == null) // Teilbaum ist leer
			return (new IntKnoten(value)); // Der neue Knoten wird zur Wurzel
		else if (aktuelleWurzel.value == value) // Die Wurzel enthält value bereits
			return aktuelleWurzel; // verändere nichts
		else if (aktuelleWurzel.value > value) { // in den linken Teilbaum der Wurzel einfuegen
			aktuelleWurzel.left = einfuegen(aktuelleWurzel.left, value);
			return aktuelleWurzel;
		} else { // in den rechten Teilbaum der Wurzel einfügen
			aktuelleWurzel.right = einfuegen(aktuelleWurzel.right, value);
			return aktuelleWurzel;
		}
	}
	
	// In diesem Baum den Knoten mit Wert value finden:
	public IntKnoten findeKnoten(int value) {
		return findeKnoten(root, value); // siehe unten private Methode findeKnoten()
	}
	
	// Durchsuche den durch aktuelleWurzel gegebenen Teilbaum nach dem value-Knoten:
	private IntKnoten findeKnoten(IntKnoten aktuelleWurzel, int value) {
		IntKnoten gefunden = null;
		if (aktuelleWurzel != null) {
			if (aktuelleWurzel.value == value)
				gefunden = aktuelleWurzel;
			else if (aktuelleWurzel.value > value)
				gefunden = findeKnoten(aktuelleWurzel.left, value);
			else
				gefunden = findeKnoten(aktuelleWurzel.right, value);
		}
		;
		return gefunden;
	};

	//	Ausgeben der Daten im Baum in Preorder-Reihenfolge (W-L-R)
	void ausgebenInPreorder() {
		IntSuchbaum lt = new IntSuchbaum(), rt = new IntSuchbaum(); // linker bzw. rechter Teilbaum
		if (root != null) {
			lt.root = root.left;
			rt.root = root.right;
			System.out.print(root.value + " ");
			lt.ausgebenInPreorder();
			rt.ausgebenInPreorder();
		}
	}

	// Ausgeben der Daten im Baum in Postorder-Reihenfolge (L-R-W)
	void ausgebenInPostorder() {
		IntSuchbaum lt = new IntSuchbaum(), rt = new IntSuchbaum(); // linker bzw. rechter Teilbaum
		if (root != null) {
			lt.root = root.left;
			rt.root = root.right;
			lt.ausgebenInPostorder();
			rt.ausgebenInPostorder();
			System.out.print(root.value + " ");
		}
	}

	//	Ausgeben der Daten im Baum in Inorder-Reihenfolge (L-W-R) ==> aufsteigend
	void ausgebenInInorder() {
		IntSuchbaum lt = new IntSuchbaum(), rt = new IntSuchbaum(); // linker bzw. rechter Teilbaum
		if (root != null) {
			lt.root = root.left;
			rt.root = root.right;
			lt.ausgebenInInorder();
			System.out.print(root.value + " ");
			rt.ausgebenInInorder();
		}
	}
	
//	Ausgeben der Daten im Baum in Reihenfolge (R-W-L) ==> absteigend
	void ausgebenAbsteigend() {
		IntSuchbaum lt = new IntSuchbaum(), rt = new IntSuchbaum(); // linker bzw. rechter Teilbaum
		if (root != null) {
			lt.root = root.left;
			rt.root = root.right;
			rt.ausgebenAbsteigend();
			System.out.print(root.value + " ");
			lt.ausgebenAbsteigend();
		}
	}
	
}
