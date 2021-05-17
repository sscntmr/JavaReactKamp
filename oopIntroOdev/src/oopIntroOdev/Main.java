package oopIntroOdev;

public class Main {

	public static void main(String[] args) {
		
	
		Course course1=new Course();
		
	    course1.egitmenadi="Engin Demiroð";
		course1.izlemeyuzdesi=42;
	    course1.programadi="Java-React";
		
		
		Course course2= new Course("Engin Demiroð",43,"C#");
		
		
	
		//Tüm kurslarý gezmesi için foreach kullandýk
		Course[] courses= {course1,course2};
		
		for(Course course:courses) {
			System.out.println(course.egitmenadi);
			
		}

		// Tüm sayfalar için kullanýlan ortak bir durum için kullanýlan class
		CourseManager courseManager = new CourseManager();
		courseManager.devambitir(course1);
		courseManager.oncekiders(course2);
		

		
	}

}
