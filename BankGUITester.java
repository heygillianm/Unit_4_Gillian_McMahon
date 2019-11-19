
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;

public class BankGUITester extends Application {

    public void start(Stage primaryStage) {
        Scene scene = new Scene(new BankAccountGUI(), 600, 400);

        primaryStage.setTitle("Bank Account GUI");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[]args) {
        launch(args);
    }
}