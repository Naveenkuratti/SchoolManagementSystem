package SchoolManagementSystem1;
//track of student fees,name,id,grade
public class Student {
	private int id;
	private String name ;
	private int grade;
	private int feespaid;
	private int feestotal;


	//to create a new student by initializing
	Student (int id,String name,int grade) {
		this.id=id;
		this.name=name;
		this.grade=grade;
		this.feespaid=0; 
		this.feestotal=0;

	}
	//not going to alter student's name ,student's id
	//param grade new grade of the student
	public void  setgrade(int grade) {
		this.grade=grade;
	}

	public void payFees(int fees) {
		feespaid+=fees;
		School.updateTotalMoneyEarned(feespaid);

	}
	public  int getid() {
		return id;
	}
	public String getname() {
		return name;

	}
	public int getgrade() {
		return grade;

	}
	public int getfeespaid() {
		return feespaid; 

	}
	public int  getfeestotal() {
		return feestotal;

	}
	public int getRemainingFees() {
		return feestotal - feespaid;
	}
}





