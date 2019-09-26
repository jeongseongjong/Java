package chapter2;

public class Student {
	String studentName;

	public String getstudentName() {
		return studentName;
	}
	public static void main(String[] args) {
		Student studentAhn = new Student();
		studentAhn.studentName = "aaa";
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getstudentName());
	}

}
