package Day3HomeWork2;

public class Main {

	public static void main(String[] args) {
		Student student = new Student();
		student.setId(1);
		student.setFirstName("�sa");
		student.setLastName("Kurtulu�");
		student.setEmail("isakurtulus@gmail.com");
		student.setPassword("******");
		student.setCourses("Java+React ");
		
		Instructor instructor = new Instructor();
		instructor.setFirstName("Engin");
		instructor.setLastName("Demiro�");
		instructor.setCourses("Java+React ");
		instructor.setOdevler("G�n3Ders2");
			
		
		
		UserManager manager = new UserManager();
		manager.coursesRegistration(instructor);
		manager.coursesRegistration(student);
		
	}

}
