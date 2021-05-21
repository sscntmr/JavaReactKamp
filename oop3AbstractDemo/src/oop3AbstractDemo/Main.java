package oop3AbstractDemo;

public class Main {

	public static void main(String[] args) {
		
	    WomanGameCalculator womanGameCalculator=new WomanGameCalculator();
		ManGameCalculator manGameCalculator=new ManGameCalculator();
		KidsGameCalculator kidsGameCalculator=new KidsGameCalculator();
		
		womanGameCalculator.score();
		manGameCalculator.score();
		kidsGameCalculator.score();
	
	}
	

}
