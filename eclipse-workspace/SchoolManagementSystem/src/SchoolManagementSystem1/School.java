package SchoolManagementSystem1;
import java.util.List;

public class School {
	private List<Teacher> teachers;
	private List<Student> students;
	private  static int   totalMoneyEarned;
	private  static int  totalMoneySpent;

	public School(List<Teacher> teachers, List<Student> students) {
		this.teachers= teachers;
		this.students=students;
		totalMoneyEarned=0;
		totalMoneySpent=0;
	}


	public  List<Teacher> getteacher() {
		return teachers;
	}
	public void addTeacher(Teacher teacher) {
		teachers.add(teacher);
	}

	public  List<Student> getstudents() {
		return students;
	}
	public void addStudents(Student student) {
		students.add(student);
	}
	public int getTotalMoneyEarned() {
		return  totalMoneyEarned;	
	}
	public  static void updateTotalMoneyEarned(int MoneyEarned) {
		totalMoneyEarned+=totalMoneyEarned;

	}

	public int  getTotalMoneySpent() {
		return  totalMoneySpent;

	}
	public void udateTotalMoneySpent(int totalMoneySpent) {
		totalMoneyEarned=totalMoneyEarned-totalMoneySpent;

	}
}





