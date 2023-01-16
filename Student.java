package baum;

public class Student implements Comparable<Student>{
	private int matrNr;
	private String name;
	
	public Student(int matrNr, String name) {
		super();
		this.matrNr = matrNr;
		this.name = name;
	}

	@Override
	public int compareTo(Student anotherStudent) {
		if (this.matrNr < anotherStudent.matrNr)
			return -1;
		if (this.matrNr == anotherStudent.matrNr)
			return 0;
		return 1;
	}
	
	@Override
	public String toString() {
		return "(" + matrNr + "," + name + ") ";
	}

}
