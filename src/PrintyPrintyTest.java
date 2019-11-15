import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;

public class PrintyPrintyTest extends Application {

    public void start(Stage primaryStage) {
        Scene scene = new Scene(new PrintyPrinty(), 600, 400);

        primaryStage.setTitle("Printy Printy");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[]args) {
        launch(args);
    }
}
