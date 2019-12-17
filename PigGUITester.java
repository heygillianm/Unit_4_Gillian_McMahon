import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;

public class PigGUITester extends Application {

    public void start(Stage primaryStage){
        Scene scene = new Scene(new PigGameGUI(), 600, 400);

        primaryStage.setTitle("Pig Game");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String [] args){
        launch(args);
    }
}
