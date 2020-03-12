package clean_code_tp;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class MyDesk {
	
	public ArrayList<Ticket> inProgressTasks;
	public ArrayList<Ticket> finishedTasks;
	public Persistence persistence;
	
	public MyDesk() {
		this.persistence = new Persistence();
		this.inProgressTasks = getAllProgressTasks();
		this.finishedTasks = getAllFinishedTasks();
	}
	
	public void createTicket(String name) {
		Ticket ticket = new Ticket(name);
		this.persistence.newTicket(ticket);
	}
	
	private ArrayList<Ticket> getAllProgressTasks() {
		ArrayList<Ticket> tickets = new ArrayList<>();
		File todo = this.persistence.todo;
		try {
			FileReader fileReader = new FileReader(todo);
			BufferedReader br = new BufferedReader(fileReader);
			String line = br.readLine();
			while (line != null) {
				String[] ticketElement = line.split(";");
				Date dateCreation = new SimpleDateFormat("dd/MM/yyyy").parse(ticketElement[1]);
				Ticket ticket = new Ticket(ticketElement[0], dateCreation, ticketElement[2]);
				this.inProgressTasks.add(ticket);
	            line = br.readLine();
	        }
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return tickets;
	}
	
	private ArrayList<Ticket> getAllFinishedTasks() {
		ArrayList<Ticket> tickets = new ArrayList<>();
		File done = this.persistence.done;
		try {
			FileReader fileReader = new FileReader(done);
			BufferedReader br = new BufferedReader(fileReader);
			String line = br.readLine();
			while (line != null) {
				String[] ticketElement = line.split(";");
				Date dateCreation = new SimpleDateFormat("dd/MM/yyyy").parse(ticketElement[1]);
				Ticket ticket = new Ticket(ticketElement[0], dateCreation, ticketElement[2]);
				tickets.add(ticket);
	            line = br.readLine();
	        }
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return tickets;
	}
}
