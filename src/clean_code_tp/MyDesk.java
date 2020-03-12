package clean_code_tp;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class MyDesk {
	
	public ArrayList<Ticket> inProgressTasks;
	public ArrayList<Ticket> finishedTasks;
	public Persistence persistence;
	
	public MyDesk() {
		Persistence persistence = new Persistence();
		// TODO recup les postit du fichiers
	}
	
	public void createTicket(String name) {
		Ticket ticket = new Ticket(name);
		this.persistence.newTicket(ticket);
	}
	
	private void getAllProgressTasks() {
		File todo = this.persistence.todo;
		try {
			FileReader fileReader = new FileReader(todo);
			BufferedReader br = new BufferedReader(fileReader);
			String line = br.readLine();
			while (line != null) {
				String[] ticketElement = line.split(";");
				Ticket ticket = new Ticket(name);
	            sb.append(line);
	            sb.append("\n");
	            line = br.readLine();
	        }
			
			
			int data = fileReader.read();
			while(data != -1) {
			  data = fileReader.read();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
