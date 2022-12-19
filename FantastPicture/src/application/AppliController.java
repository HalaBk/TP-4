package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class AppliController implements Initializable{

	@FXML
	private ImageView imageView;
	@FXML
	private ListView<String> listView;
	
	@FXML
	private TextField nom;
	
	@FXML
	private TextField log;
	
	
	ObservableList<String> list =FXCollections.observableArrayList();
	private Model model;
	private int cnx;
	private int nomK;
	private int mdpk;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		this.model = new Model();
		model.init();

		listView.setItems(list);
		for(Image img :model.getListeImage())
			listView.getItems().add(img.getNom());

	}

	public void AfficherImage(MouseEvent event) {
		imageView.setImage(model.imgClique(listView.getSelectionModel().getSelectedItem()));
	} 

	public void connexion(ActionEvent e) {
		cnx = 0;
		nomK=0;
		mdpk=0;
		
        for (User util : model.getListeUtilisateur()) {
            System.out.println(nom.getText()+"arraylist : "+util.getNom());
            if(nom.getText().equals(util.getNom())) {
                nomK = 1;
                if(log.getText().equals(util.getLogin())) {
                    mdpk = 1;
                }

            }
        }
        if (nomK == 0 || mdpk == 0) {
            System.out.println(nomK + ""+mdpk);
            System.out.println("Le nom d'utilisateur ou le mot de passe est incorrect");
        }
        else {
            System.out.println("Vous êtes connecté");
        }
	}

}
