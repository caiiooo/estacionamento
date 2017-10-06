package application;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;

public class TelaConfirmeController {

	private Main mainApp;

	@FXML
	private Label labelNome;
        
        @FXML
	private Label labelEmail;
        
        @FXML
	private Label labelSistema;
        
        @FXML
	private Label labelTitulo;
        
        @FXML
	private Label labelPrioridade;
        
        @FXML
	private Label labelDescricao;
    


	@FXML
	public void handleButtonOk() {
          
            
            /*
		String nome = textFieldNome.getText();
		String cargo = (String) selectCargo.getValue();
		
		
		System.out.println(nome+" - "+cargo);
		
		labelResultado.setText("Nome: "+nome+"\n"+"Cargo: "+cargo);
            */
	}
	
	@FXML
	public void handleButtonClose() {
		mainApp.encerrarApp();
	}

	@FXML
	public void initialize() {
		
		
		

	}

	public void setMainApp(Main main) {
		this.mainApp = main;

	}

    /**
     * @return the labelNome
     */
    public Label getLabelNome() {
        return labelNome;
    }

    /**
     * @return the labelEmail
     */
    public Label getLabelEmail() {
        return labelEmail;
    }

    /**
     * @return the labelSistema
     */
    public Label getLabelSistema() {
        return labelSistema;
    }

    /**
     * @return the labelTitulo
     */
    public Label getLabelTitulo() {
        return labelTitulo;
    }

    /**
     * @return the labelPrioridade
     */
    public Label getLabelPrioridade() {
        return labelPrioridade;
    }

    /**
     * @return the labelDescricao
     */
    public Label getLabelDescricao() {
        return labelDescricao;
    }



}
