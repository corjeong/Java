package classpart;

public class Student {
	
	public int studentID;
	public String studentName;
	public String address;
	
	public Student() {
		
	}
	
	public Student(int id, String name) {
		studentID = id;
		studentName = name;
		address = "�ּҾ���";
		
	}
	
	public void showStudentInfo() {
		System.out.println(studentName + "," + address);
		
	}
}
