import javafx.application.Application;
import javafx.scene.control.TextArea;
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

public class PrintyPrinty extends GridPane {
    private Label result;
    private TextField nameField;
    private TextField ageField;
    private TextField colorField;
    private TextField hobbyField;
    private TextArea printOut;

    public void start(Stage primaryStage) {
        Font font = new Font(14);

        Label inputName = new Label("Name");
        inputName.setFont(font);
        GridPane.setHalignment(inputName,HPos.LEFT);

        nameField = new TextField();
        nameField.setFont(font);
        nameField.setPrefWidth(70);
        nameField.setAlignment(Pos.CENTER);
        nameField.setOnAction(this::processPrintOut);

        Label inputAge = new Label("Age");
        inputAge.setFont(font);
        GridPane.setHalignment(inputAge, HPos.LEFT);

        ageField = new TextField();
        ageField.setFont(font);
        ageField.setPrefWidth(70);
        ageField.setAlignment(Pos.CENTER);
        ageField.setOnAction(this::processPrintOut);

        Label inputColor = new Label("Favorite color");
        inputColor.setFont(font);
        GridPane.setHalignment(inputColor, HPos.RIGHT);

        colorField = new TextField();
        colorField.setFont(font);
        colorField.setPrefWidth(70);
        colorField.setAlignment(Pos.CENTER);
        colorField.setOnAction(this::processPrintOut);

        Label inputHobby = new Label("Hobby");
        inputHobby.setFont(font);
        GridPane.setHalignment(inputHobby, HPos.RIGHT);

        hobbyField = new TextField();
        hobbyField.setFont(font);
        hobbyField.setPrefWidth(70);
        hobbyField.setAlignment(Pos.CENTER);
        hobbyField.setOnAction(this::processPrintOut);

        Button print = new Button("Print!");
        print.setOnAction(this::processPrintOut);
        print.setAlignment(Pos.CENTER);

        result = new Label("---");
        result.setFont(font);

        setAlignment(Pos.CENTER);
        setHgap(20);
        setVgap(10);
        setStyle("-fx-background-color:light-blue");

        add(print, 0, 0);
        add(inputName, 1,1);
        add(nameField, 2,1);
        add(inputAge, 1,2);
        add(ageField, 2,2);
        add(inputColor, 3, 1);
        add(colorField, 4,1);
        add(inputHobby, 3,2);
        add(hobbyField, 4, 2);

    }
     public void processPrintOut (ActionEvent event){
        printOut = new TextArea();
     }
}
