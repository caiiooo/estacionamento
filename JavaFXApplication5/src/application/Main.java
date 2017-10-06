package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	private BorderPane rootLayout;
	private Stage stage;

	@Override
	public void start(Stage primaryStage) {
		
		this.stage = primaryStage;
		
		initLayout();
		
	}

	private void initLayout() {
		try {

			//			acesso ao fxml
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(getClass().getResource("Home.fxml"));
			rootLayout = loader.load();

			//			acesso ao controller
			HomeController homeController = loader.getController();
			homeController.setMainApp(this);
			
			Scene scene = new Scene(rootLayout);
			
			stage.setTitle("Primeiro Exemplo");
			stage.setScene(scene);
			stage.show();


		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}

	public void encerrarApp() {
		stage.close();
		
	}
}
