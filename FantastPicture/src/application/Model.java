package application;

import java.util.ArrayList;

public class Model {
	
	private ArrayList<Image> listeImage = new ArrayList<Image>();
	private ArrayList<User> listeUtilisateur = new ArrayList<User>();
	private ArrayList<Note> listeNote= new ArrayList<Note>();
	
	public void init() {
		Image imgMontagne = new Image("montagne","./application/img/montagne.jfif");
		Image imgPrairie = new Image("prairie","./application/img/prairie.jfif");
		Image imgVille = new Image("ville","./application/img/ville.jfif");
		Image imgCasablanca= new Image("Casablanca","./application/img/casablanca.jfif");
		
		User util1=new User("hala","hala123");
		User util2=new User("hiba","hiba123");
		User util3=new User("hadia","hadia123");
		listeUtilisateur.add(util1);
		listeUtilisateur.add(util2);
		listeUtilisateur.add(util3);
		
		listeImage.add(imgMontagne);
		listeImage.add(imgPrairie);
		listeImage.add(imgVille);
		listeImage.add(imgCasablanca);
		
		Note note1=new Note(util1,imgMontagne,2);
		Note note2=new Note(util1,imgCasablanca,5);
		Note note3=new Note(util1,imgPrairie,3);
		Note note4=new Note(util2,imgPrairie,4);
		Note note5=new Note(util2,imgVille,3);
		listeNote.add(note1);
		listeNote.add(note2);
		listeNote.add(note3);
		listeNote.add(note4);
		listeNote.add(note5);
	}


	public ArrayList<Image> getListeImage() {
		return listeImage;
	}
	public void setListeImage(ArrayList<Image> listeImage) {
		this.listeImage = listeImage;
	}


	public ArrayList<User> getListeUtilisateur() {
		return listeUtilisateur;
	}


	public void setListeUtilisateur(ArrayList<User> listeUtilisateur) {
		this.listeUtilisateur = listeUtilisateur;
	}


	public ArrayList<Note> getListeNote() {
		return listeNote;
	}

	public void setListeNote(ArrayList<Note> listeNote) {
		this.listeNote = listeNote;
	}
	
	public javafx.scene.image.Image imgClique(String objetClique) {
		
		for (Image img : listeImage)
		{
			if (img.getNom().equals(objetClique)) 
				return new javafx.scene.image.Image(img.getUrl());
			
		}
		return null;
		
	}
	
	

}
