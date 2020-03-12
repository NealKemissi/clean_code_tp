package clean_code_tp;

import java.text.ParseException;
import java.util.Date;

public class Ticket {
	
	private String name;
	private Date creationDate;
	private String state;
	
	public Ticket(String name) {
		this.name = name;
		this.creationDate = new Date();
		this.state = "TODO";
	}
	
	public Ticket(String name, Date creationDate, String state) throws ParseException {
		this.name = name;
		this.creationDate = creationDate;
		this.state = state;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the description to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the creationDate
	 */
	public Date getCreationDate() {
		return creationDate;
	}
	/**
	 * @param creationDate the creationDate to set
	 */
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}
}
