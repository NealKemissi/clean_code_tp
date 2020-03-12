package clean_code_tp;

import java.util.ArrayList;

public class MyDesk {
	
	private ArrayList<Postit> inProgressTasks;
	private ArrayList<Postit> finishedTasks;
	
	public MyDesk() {
		// TODO recup les postit du fichiers
	}
	
	/**
	 * @return the inProgressTasks
	 */
	public ArrayList<Postit> getInProgressTasks() {
		return inProgressTasks;
	}

	/**
	 * @param inProgressTasks the inProgressTasks to set
	 */
	public void setInProgressTasks(ArrayList<Postit> inProgressTasks) {
		this.inProgressTasks = inProgressTasks;
	}

	/**
	 * @return the finishedTasks
	 */
	public ArrayList<Postit> getFinishedTasks() {
		return finishedTasks;
	}

	/**
	 * @param finishedTasks the finishedTasks to set
	 */
	public void setFinishedTasks(ArrayList<Postit> finishedTasks) {
		this.finishedTasks = finishedTasks;
	}
}
