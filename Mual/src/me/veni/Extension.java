package me.veni;

import java.util.Scanner;

public class Extension {
	
	Scanner s;
	
	public Extension() {
		s = new Scanner(System.in);
		roar();
		123
	}
	
	
	
	private void roar() {
		String odpowiedz = s.nextLine();
		if(odpowiedz.equals("chuj")) {
			System.out.println("good");
			
		}else if(odpowiedz.equals("dwachuje")){
			System.out.println("least good");
	
			
			
		}else {
			System.out.println("zle");
		}
		
	}
	//konkretny ci�g znak�w
}
