import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
		return Student;

	}

	@Override
	public void setStudents(Student[] students) {
		this.Student=new Students;
	}

	@Override
	public Student getStudent(int index) {
		return index;
	}

	@Override
	public void setStudent(Student student, int index) {
		this.student=student;
		this.index=index;



	}

	@Override
	public void addFirst(Student student) {
		int student[10];
		arrayList al=new arrayList[];
		al.student[10];
		if(student[0]!=Student[1])
		 return student[0];
	}

	@Override
	public void addLast(Student student) {
		
	}

	@Override
	public void add(Student student, int index) {
		this.addStudent=Student;

	}

	@Override
	public void remove(int index) {
	
	}

	@Override
	public void remove(Student student) {
		if(student[n]!==student[n-1])
		return student[n-1];
		
	}

	@Override
	public void removeFromIndex(int index) {
		if(student[n]!=student[n-1])
		return student;
	}

	@Override
	public void removeFromElement(Student student) {
		if(studentelements==null)
		return elements;
	}

	@Override
	public void removeToIndex(int index) {
		if(student[n]==null)
		return student;
	}

	@Override
	public void removeToElement(Student student) {
		if(studentelements==null)
		 return Studentelements;
	}

	@Override
	public void bubbleSort() {
		int i;
		bubblesort(arr);
		for(i=0;i<arr.length;i++)
		return arr;
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		
		return BirthDate;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		if(date==1&&date==31)
		return date;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		int Date;
		if(Date<=15)
		return NearBirthDate;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		int Date;
		if(Date==year)
		return CurrentAge;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		return age;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		set MaxAvgMark;
		this.MaxAvgMark=MaxAvgMark;
		if(TotalMarks<=MaxAvgMark)
		return MaxAvgMArk;

	}

	@Override
	public Student getNextStudent(Student student) {
		int student[i];
		for(i=0;i<i.length;i++)
		return i;
	}
}
