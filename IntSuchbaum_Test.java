package baum;

public class IntSuchbaum_Test {

	public static void main(String[] args) {
		IntSuchbaum sB = new IntSuchbaum();
	// Diverse Werte in den Suchbaum einf�gen:
		sB.einfuegen(1000);
		sB.einfuegen(10);
		sB.einfuegen(10000);
		sB.einfuegen(0);
		sB.einfuegen(-1);
		sB.einfuegen(-1);
		sB.einfuegen(-1);
		sB.einfuegen(100);
		
		
	// Den Suchbaum auf dreierlei Arten durchlaufen:
		sB.ausgebenInPreorder();  System.out.println(" (Preorder)");
		sB.ausgebenInInorder();   System.out.println(" (Inorder -> aufsteigend)");
		sB.ausgebenInPostorder(); System.out.println(" (Postorder)");
		sB.ausgebenAbsteigend(); System.out.println(" (absteigend)");
		System.out.println();
		
	// Den Suchbaum durchsuchen:
		for (int i=0; i<=12; i++) {
			if (sB.findeKnoten(i) != null) System.out.println(i + " ist im Baum");
		};
		
	}

}
