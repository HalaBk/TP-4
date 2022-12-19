package application;

public class Note {
	private int note;
	private Image image;
	private User utilisateur;
	
	public Note( User utilisateur,Image img, int note) {
		this.note=note;
		image=img;
		this.utilisateur=utilisateur;
	}
	public int getNote() {
		return note;
	}

	public void setNote(int note) {
		this.note = note;
	}
}
