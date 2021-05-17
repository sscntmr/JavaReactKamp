package oopIntroOdev;

public class Course {
	
	String programadi; 
	int izlemeyuzdesi;
	String egitmenadi;

	public Course() { //Constructor bloktur ve classýn geçerli olabilmesi için gereklidir.
		
		//System.out.println("Ben çalýþtým");
		
}
	
	public Course( String programadi, int  izlemeyuzdesi, String egitmenadi){
	
		this(); // Diðer constructor'ý çalýþtýrmak için this(); fonksiyonu getirilir.
		
		//Bu class'ta yani en yukarýda tanýmladýðýmýz alan yukarýda parantezin içindeki alanda verilen deðere eþitliyoruz.
		this.programadi = programadi; 
		this.izlemeyuzdesi =izlemeyuzdesi;
		this.egitmenadi =egitmenadi ;
	}

}
