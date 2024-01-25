package primerospasos_ejercicio01;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void init() throws Exception {
		super.init();
		System.out.println("Método init() llamado");
		
	}
	
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root, 400, 400);
			
			primaryStage.setScene(scene);
			primaryStage.show();
			System.out.println("Método start() llamado");
		}catch(Exception e) {
			
		}
	}
	
	@Override
	public void stop() throws Exception {
		super.stop();
		System.out.println("Método stop() llamado");
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
