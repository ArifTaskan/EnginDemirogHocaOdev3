
public class Main {

	public static void main(String[] args) {
		
		
		Instructor instructor1 = new Instructor();
		instructor1.email = "engin@mail.com";
		instructor1.id = 1;
		instructor1.name = "engin";
		instructor1.university = "itu";
		
		Instructor instructor2 = new Instructor();
		instructor2.email = "beyza@mail.com";
		instructor2.id = 2;
		instructor2.name = "beyza";
		instructor2.university = "itü";
		
		Student student1 = new Student();
		student1.email = "arif@mail.com";
		student1.id = 1;
		student1.name = " arif";
		student1.age =30;
		
		Student student2 = new Student();
		student2.email ="ayse@mail.com";
		student2.id = 2;
		student2.name = "ayse";
		student2.age = 20;
		
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.Add(instructor1);
		instructorManager.Add(instructor2);
		instructorManager.Delete(instructor2);
		
		StudentManager studentManager = new StudentManager();
		studentManager.Add(student1);
		studentManager.Add(student2);
		studentManager.Delete(student2);
		
		
		
		
	}

}
