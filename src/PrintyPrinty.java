import javafx.application.Application;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.text.Text;

public class PrintyPrinty extends Application {
    private Label result;
    private TextField printOut;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
    Font font = new Font(14);

    Label inputName = new Label("Name");
    inputName.setFont(font);

    Label inputAge = new Label("Age");
    inputAge.setFont(font);

    Label inputColor = new Label("Favorite color");
    inputColor.setFont(font);

    Label inputHobby = new Label("Hobby");
    inputHobby.setFont(font);

    Button print = new Button("Print!");
    print.setOnAction(this::processButtonPress);

    result = new Label("---");
    result.setFont(font);

    printOut = new TextField();
    printOut.setFont(font);
    printOut.setPrefWidth(70);
    printOut.setAlignment(Pos.CENTER);
    printOut.setOnAction(this::processPrintOut);

    FlowPane pane = new FlowPane(inputName, inputAge, inputColor, inputHobby, print);
    pane.setAlignment(Pos.CENTER);
    pane.setHgap(20);
    pane.setVgap(10);
    pane.setStyle("-fx-background-color: lilac");

    }
}
