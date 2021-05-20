package oop2Odev;

public class UserManager {

	public void login(User user) { // oturum açma metodu

		System.out.println(user.email + " maili ile oturum açýldý.");

	}

	public void logout(User user) { // oturum kapama metodu

		System.out.println("Oturum kapatýldý.");

	}

	public void change_name(User user) { // ad deðiþtirme metodu

		System.out.println(user.name + " adlý kullanýcýnýn adý deðiþtirildi.");
	}

	public void multipleUser(User[] users) { // kullanýcýlarýn gezilmesi için oluþturulan array

		// tüm kullanýcýlarýn teker teker for döngüsü ile gezilmesi.
		for (User user : users) {

			System.out.println("--------------------");

			change_name(user);
			login(user);
			logout(user);
		}

	}

}
