package oop3AbstractDemo;

//KURAL1: Burdaki abstract sadece classý etkiliyor, metodlar abstract olmak zorunda deðil!
//KURAL2: Abstract sýnýflar asla TEK BAÞINA NEW lenemez! Kullanmak için gene ezmek yani OVERRÝDE etmek GEREKÝR.
//kural3: Abstract metod varsa, override edilme ZORUNLULUÐU vardýr.



public abstract class  GameCalculator { //sadece referans tutcu ve kural koyucu olmuþ oldu.
	public abstract void score() ;     // Abstractdan dolayý bunu kullanacak class override etmek ZORUNDA ! (Yani her class kendi hesaplasýný yazmak zorunda.)
		
		//System.out.println("Puanýnýz: 100 "); 
	
	public final void gameOver() { // Final ile override edilemez hale geldi. Herkes sadece bu þekilde kullanabilir. Deðiþime kapattýk.
		
		System.out.println("Oyun bitti ! ");
		
	}	
		
}

