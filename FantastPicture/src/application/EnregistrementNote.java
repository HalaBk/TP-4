package application;

import java.util.ArrayList;

public class EnregistrementNote {
	
	private ArrayList<Note> liste = new ArrayList<Note>();
	
	public void addNote(User util,Image img,int note) {
		Note t =new Note(util,img,note);
		liste.add(t);
	}
	
}
