package baum;

public class Suchbaum<T extends Comparable<T>> {
	
	private Knoten<T> root; // Die Wurzel dieses Suchbaums

	public Suchbaum() { // Konstruktor erzeugt einen leeren Suchbaum
		root = null;
	}

	// In diesen Baum einen Knoten mit Wert value einf�gen:
	public void einfuegen(T value) {
		root = einfuegen(root, value); // siehe unten private Methode einfuegen()
	}
	
	private Knoten<T> einfuegen(Knoten<T> aktuelleWurzel, T value) {
		// aktuelleWurzel: Referenz auf die Wurzel eines Teilbaums B.
		// Falls in B kein Knoten mit value existiert, wird einer eingef�gt.
		// Eine Referenz auf die Wurzel von B wird zur�ckgegeben.
		if (aktuelleWurzel == null) // Teilbaum ist leer
			return (new Knoten<T>(value)); // Der neue Knoten wird zur Wurzel
		else if (aktuelleWurzel.value.compareTo(value) == 0) // Die Wurzel enth�lt value bereits
			return aktuelleWurzel; // ver�ndere nichts
		else if (aktuelleWurzel.value.compareTo(value) > 0) { // in den linken Teilbaum der Wurzel einfuegen
			aktuelleWurzel.left = einfuegen(aktuelleWurzel.left, value);
			return aktuelleWurzel;
		} else { // in den rechten Teilbaum der Wurzel einf�gen
			aktuelleWurzel.right = einfuegen(aktuelleWurzel.right, value);
			return aktuelleWurzel;
		}
	}
	
	//	Ausgeben der Daten im Baum in Preorder-Reihenfolge (W-L-R)
	void ausgebenInPreorder() {
		Suchbaum<T> lt = new Suchbaum<T>(), rt = new Suchbaum<T>(); // linker bzw. rechter Teilbaum
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
		Suchbaum<T> lt = new Suchbaum<T>(), rt = new Suchbaum<T>(); // linker bzw. rechter Teilbaum
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
		Suchbaum<T> lt = new Suchbaum<T>(), rt = new Suchbaum<T>(); // linker bzw. rechter Teilbaum
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
		Suchbaum<T> lt = new Suchbaum<T>(), rt = new Suchbaum<T>(); // linker bzw. rechter Teilbaum
		if (root != null) {
			lt.root = root.left;
			rt.root = root.right;
			rt.ausgebenAbsteigend();
			System.out.print(root.value + " ");
			lt.ausgebenAbsteigend();
		}
	}

}
