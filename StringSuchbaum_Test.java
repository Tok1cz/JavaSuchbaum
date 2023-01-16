package baum;

public class StringSuchbaum_Test {

	public static void main(String[] args) {
		StringSuchbaum sB = new StringSuchbaum();
	// Diverse Werte in den Suchbaum einf�gen:
		sB.einfuegen("E");
		sB.einfuegen("C");
		sB.einfuegen("A");
		sB.einfuegen("D");
		sB.einfuegen("B");
		sB.einfuegen("Z");
		sB.einfuegen("Y");
		sB.einfuegen("X");
		
	// Den Suchbaum auf dreierlei Arten durchlaufen:
		sB.ausgebenInPreorder();  System.out.println(" (Preorder)");
		sB.ausgebenInInorder();   System.out.println(" (Inorder -> aufsteigend)");
		sB.ausgebenInPostorder(); System.out.println(" (Postorder)");
		sB.ausgebenAbsteigend(); System.out.println(" (absteigend)");
		System.out.println();
		
	// Den Suchbaum durchsuchen:
		String[] arr = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "Z"};
		for (String string: arr) {
			if (sB.findeKnoten(string) != null) System.out.println(string + " ist im Baum");
		};
	}

}
