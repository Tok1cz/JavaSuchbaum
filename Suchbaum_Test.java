package baum;

public class Suchbaum_Test {

	public static void main(String[] args) {
		
		Suchbaum<Integer> sB = new Suchbaum<>();
	// Diverse Werte in den Suchbaum einf�gen:
		sB.einfuegen(5);
		sB.einfuegen(3);
		sB.einfuegen(1);
		sB.einfuegen(7);
		sB.einfuegen(4);
		sB.einfuegen(8);
		sB.einfuegen(6);
		sB.einfuegen(9);
		
	Suchbaum<String> sB2 = new Suchbaum<>();
	// Diverse Werte in den Suchbaum einf�gen:
		sB2.einfuegen("5");
		sB2.einfuegen("3");
		sB2.einfuegen("1");
		sB2.einfuegen("7");
		sB2.einfuegen("4");
		sB2.einfuegen("8");
		sB2.einfuegen("6");
		sB2.einfuegen("9");

	Suchbaum<Student> sB3 = new Suchbaum<>();
	// Diverse Werte in den Suchbaum einf�gen:			
		sB3.einfuegen(new Student(5, "E"));
		sB3.einfuegen(new Student(3, "C"));
		sB3.einfuegen(new Student(1, "A"));
		sB3.einfuegen(new Student(7, "G"));
		sB3.einfuegen(new Student(4, "D"));
		sB3.einfuegen(new Student(8, "H"));
		sB3.einfuegen(new Student(6, "F"));
		sB3.einfuegen(new Student(9, "I"));
		
		
		// Die Suchb�ume auf dreierlei Arten durchlaufen:
		sB.ausgebenInPreorder();  System.out.println(" (Preorder)");
		sB2.ausgebenInPreorder(); System.out.println(" (Preorder)");
		sB3.ausgebenInPreorder(); System.out.println(" (Preorder)");
		System.out.println();
		
		sB.ausgebenInPostorder();  System.out.println(" (Postorder)");
		sB2.ausgebenInPostorder(); System.out.println(" (Postorder)");
		sB3.ausgebenInPostorder(); System.out.println(" (Postorder)");
		System.out.println();
		
		sB.ausgebenInInorder();   System.out.println(" (Inorder -> aufsteigend)");
		sB2.ausgebenInInorder();  System.out.println(" (Inorder -> aufsteigend)");
		sB3.ausgebenInInorder();  System.out.println(" (Inorder -> aufsteigend)");
		System.out.println();
		
		sB.ausgebenAbsteigend();  System.out.println(" (absteigend)");
		sB2.ausgebenAbsteigend(); System.out.println(" (absteigend)");
		sB3.ausgebenAbsteigend(); System.out.println(" (absteigend)");
		System.out.println();
		

	}
}
