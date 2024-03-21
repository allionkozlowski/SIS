
public class Student {
	private String firstName;
	private String lastName;
	private double gpa;
	private String firstGrade;
	private String secondGrade;
	private String thirdGrade;
	private String firstClass;
	private String secondClass;
	private String thirdClass;
	
	public Student(String firstName, String lastName, double gpa, String firstClass , String firstGrade , String secondClass , String secondGrade , String thirdClass , String thirdGrade)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.gpa = gpa;
		this.firstClass = firstClass;
		this.firstGrade = firstGrade;
		this.secondClass = secondClass;
		this.secondGrade = secondGrade;
		this.thirdClass = thirdClass;
		this.thirdGrade = thirdGrade;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public String getFirstGrade() {
		return firstGrade;
	}

	public void setFirstGrade(String firstGrade) {
		this.firstGrade = firstGrade;
	}

	public String getSecondGrade() {
		return secondGrade;
	}

	public void setSecondGrade(String secondGrade) {
		this.secondGrade = secondGrade;
	}

	public String getThirdGrade() {
		return thirdGrade;
	}

	public void setThirdGrade(String thirdGrade) {
		this.thirdGrade = thirdGrade;
	}

	public String getFirstClass() {
		return firstClass;
	}

	public void setFirstClass(String firstClass) {
		this.firstClass = firstClass;
	}

	public String getSecondClass() {
		return secondClass;
	}

	public void setSecondClass(String secondClass) {
		this.secondClass = secondClass;
	}

	public String getThirdClass() {
		return thirdClass;
	}

	public void setThirdClass(String thirdClass) {
		this.thirdClass = thirdClass;
	}
	

}

	