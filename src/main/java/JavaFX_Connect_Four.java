import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class JavaFX_Connect_Four extends Application {
	Button btn;

	public static void main(String[] args) {
		launch(args);
	}

	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Connect Four");
		Scene scene = new Scene(new VBox(), 700.0, 700.0);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
