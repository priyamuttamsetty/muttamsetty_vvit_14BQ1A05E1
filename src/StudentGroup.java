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
	public StudentGroup(int length) throws IllegalArgumentException{
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() throws IllegalArgumentException {
		
		// Add your implementation here
		return null;
	}

	@Override
	public void setStudents(Student[] students) throws IllegalArgumentException {
	int size=Integer.parseInt(args[0]);	
	Student[] student= new Student[size];	
	// Add your implementation here
	}

	@Override
	public Student getStudent(int index) throws IllegalArgumentException {
		if(size>0)
		{
			for(i=0;i<size;i++)
				System.out.println(student[i]);
		}
		else// Add your implementation here
		  return null;
	}

	@Override
	public void setStudent(Student student, int index) throws IllegalArgumentException {
		
		Scanner sc=new Scanner(System.in);
		this.student=Student[size];		
// Add your implementation here
	}

	@Override
	public void addFirst(Student student) throws IllegalArgumentException {
	this.student=Student[size];		
// Add your implementation here
	}

	@Override
	public void addLast(Student student) throws IllegalArgumentException {
		this.student=Student[size];// Add your implementation here
	}

	@Override
	public void add(Student student, int index) throws IllegalArgumentException {
		this.student=Student[size];// Add your implementation here
	}

	@Override
	public void remove(int index) throws IllegalArgumentException {
	this.student=Student[size];		// Add your implementation here
	}

	@Override
	public void remove(Student student) throws IllegalArgumentException {
		// Add your implementation here
	}

	@Override
	public void removeFromIndex(int index) throws IllegalArgumentException {
		// Add your implementation here
	}

	@Override
	public void removeFromElement(Student student) throws IllegalArgumentException {
		// Add your implementation here
	}

	@Override
	public void removeToIndex(int index) throws IllegalArgumentException {
		// Add your implementation here
	}

	@Override
	public void removeToElement(Student student) throws IllegalArgumentException {
		// Add your implementation here
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
	}

	@Override
	public Student[] getByBirthDate(Date date) throws IllegalArgumentException {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) throws IllegalArgumentException {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) throws IllegalArgumentException {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) throws IllegalArgumentException {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) throws IllegalArgumentException {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() throws IllegalArgumentException {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) throws IllegalArgumentException {
		// Add your implementation here
		return null;
	}
}
