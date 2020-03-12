package clean_code_tp;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Persistence {
	
	public File todo;
	public File done;
	
	public Persistence() {
		this.todo = new File("C:\\Users\\Neal\\eclipse-workspace\\clean_code_tp\\ressources\\todo.txt");
		this.done = new File("C:\\Users\\Neal\\eclipse-workspace\\clean_code_tp\\ressources\\done.txt");
	}
	
	public void newTicket(Ticket ticket) {
		try {
			FileWriter writer = new FileWriter(todo);
			writer.write(ticket.getName() +";"+ticket.getCreationDate()+";"+ticket.getState());
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
