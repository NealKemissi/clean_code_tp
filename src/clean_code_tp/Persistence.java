package clean_code_tp;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Persistence {
	
	public File todo;
	public File done;
	
	public Persistence() {
		this.todo = new File(this.getClass().getResource("todo.txt").getFile());
		this.done = new File(this.getClass().getResource("done.txt").getFile());
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
