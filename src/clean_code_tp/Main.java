package clean_code_tp;

import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static MyDesk desk = new MyDesk();

	public static void main(String[] args) throws Exception {
		
		
		
		System.out.println("Hello ! Veuillez selectionner une action :");
		System.out.println("1 - créer un ticket");
		System.out.println("2 - supprimer un ticket");
		System.out.println("3 - déplacer un ticket TODO vers DONE");
		System.out.println("4 - déplacer un ticket DONE vers TODO");
		System.out.println("5 - Voir tous les tickets TODO");
		System.out.println("6 - Voir tous les tickets DONE");
		
		switch(sc.nextInt()) {
		case 1 :
			createTicket();
			break;
		case 2 :
			throw new Exception("not implemented yet");
		case 3 :
			throw new Exception("not implemented yet");
		case 4 :
			throw new Exception("not implemented yet");
		case 5 :
			//TODO
			break;
		case 6 :
			break;	
		}

	}
	
	public static void createTicket() {
		System.out.println("Pour créer un ticket, veuillez donnez le nom du ticket :");
		String name = sc.nextLine();
		desk.createTicket(name);
	}

}
