package oop2Odev;

public class Main {

	public static void main(String[] args) {

		Student student = new Student();
		student.name = "Sena";
		student.surname = "Görel";
		student.gottenlesson_name = "Java";
		student.email = "sena123@gmail.com";

		Instructor instructor = new Instructor();
		instructor.name = "Engin";
		instructor.surname = "Demirog";
		instructor.givenlesson_name = "Java";
		instructor.email = "engindemirog@gmail.com";

		UserManager usermanager = new UserManager();
		// Bu kullaným teker teker yazdýðýmýz için kullanýþsýz.
		
		/*
		  usermanager.login(instructor); usermanager.login(student);
		  usermanager.logout(instructor); usermanager.logout(student);
		  usermanager.change_name(instructor); usermanager.change_name(student);
		 */

		// Bu kullanýmla kullanýþlý bir þekilde döngümüzdeki tüm kullanýcýlar gezildi ve tüm metodlar yazdýrýldý.
		User[] users = { student, instructor };
		usermanager.multipleUser(users);

	}
}
