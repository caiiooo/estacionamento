package application;


import java.io.IOException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class HomeController {

	private Main mainApp;

	@FXML
	private TextField textFieldNome;
        @FXML
	private TextField textFieldEmail;
        @FXML
	private TextField textFieldTitulo;
        @FXML
	private TextArea textAreaDescricao;

	@FXML
	private Button buttondOk;

	@FXML
	private Button buttonClose;


	@FXML
	private ComboBox<String> selectCargo;
        
        @FXML
	private ComboBox<String> selectPrioridade;


	@FXML
	public void handleButtonOk() throws IOException {
           try {
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("TelaConfirme.fxml"));
               
              
                
                Scene scene = new Scene(fxmlLoader.load(), 600, 400);
                Stage stage = new Stage();
                stage.setTitle("New Window");
                stage.setScene(scene);
                stage.show();
                
                
                TelaConfirmeController controller = fxmlLoader.getController();
                Label labelNome = controller.getLabelNome();
                labelNome.setText(textFieldNome.getText());
                Label labelDescricao = controller.getLabelDescricao();
                labelDescricao.setText(textAreaDescricao.getText());
                Label labelEmail = controller.getLabelEmail();
                labelEmail.setText(textFieldEmail.getText());
                
                
                
            } catch (IOException e) {
                e.printStackTrace();
            }
            
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
		
		ObservableList<String> options = 
				FXCollections.observableArrayList(
						"Analista de Testes",
						"Analista de Negócios",
						"Desenvolvedor Java"
						);

		selectCargo.getItems().addAll(options);
		
                ObservableList<String> options2 = 
				FXCollections.observableArrayList(
						"Alto",
						"Média",
						"Baixa"
						);
                
                selectPrioridade.getItems().addAll(options2);
//		textFieldNome.setText("Digite o nome");
		

	}

	public void setMainApp(Main main) {
		this.mainApp = main;

	}



}
