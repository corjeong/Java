package reference;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student studentLee = new Student(100, "Lee");
		studentLee.setKoreaSubject("����", 100);
		studentLee.setMathSubject("����2", 95);
		
		Student studentKim = new Student(101, "Kim");
		studentKim.setKoreaSubject("����", 80);
		studentKim.setMathSubject("����1", 99);
		
		studentLee.showStudentScore();
		studentKim.showStudentScore();
		
		//System.out.println(studentLee.math.subjectName);
		//System.out.println(studentKim.math.subjectName);
	}

}
