package SchoolManagementSystem1;

import java.util.ArrayList;
import java.util.List;
public class Main {

	public static void main(String[] args) {
		Teacher Lizzay = new Teacher(1,"Lizzay",5000);
		Teacher mellisa = new Teacher(2,"mellisa",7000);
		Teacher  vanderhorn = new Teacher(3,"vanderhorn",9000);




		List<Teacher>teacherList = new ArrayList<>();

		teacherList.add(Lizzay);
		teacherList.add(mellisa);
		teacherList.add(vanderhorn);
		



		Student tamasha = new Student(1,"tamasha" ,4);
		Student rakshith = new Student(2,"rakshith" ,12); 
		Student rabbi = new Student(3, "rabbi" ,5);

		List<Student>studentList = new ArrayList<>();
		studentList.add(tamasha);
		studentList.add(rabbi);
		studentList.add(rakshith);
		School ghs = new School(teacherList,studentList);

		tamasha.payFees(5000);
		System.out.println("ghs has earned $"+ghs.getTotalMoneyEarned());

		rakshith.payFees(6000);
		System.out.println("ghs has earned $"+ghs.getTotalMoneyEarned());


		System.out.println("-----------------------------");
	}




		


}
