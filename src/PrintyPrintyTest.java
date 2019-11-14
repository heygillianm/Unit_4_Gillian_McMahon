import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;

public class PrintyPrintyTest extends Application {

    public void start(Stage stage) {
        Scene scene = new Scene(new PrintyPrinty(), 300, 150);

        stage.setTitle("Printy Printy");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[]args) {
        launch(args);
    }
}
