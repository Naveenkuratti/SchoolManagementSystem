package SchoolManagementSystem1;

public class Teacher {
	private int id;
	private String name;
	private int salary;



	public Teacher(int id, String name, int salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;


	}


	public int getid() {
		return id;


	}
	public String getname() {
		return name;

	}
	public int getsalary() {
		return salary;

	}
	public void setsalary(int salary) {
		this.salary=salary;
	}

}
