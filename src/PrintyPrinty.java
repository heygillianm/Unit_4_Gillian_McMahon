import javafx.scene.control.TextArea;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.control.Button;
import javafx.scene.text.*;

public class PrintyPrinty extends GridPane {
    private Text result = new Text();
    private TextField nameField;
    private TextField ageField;
    private TextField colorField;
    private TextField hobbyField;

    public PrintyPrinty() {
        Font font = new Font(14);

        Label inputName = new Label("Name");
        inputName.setFont(font);
        GridPane.setHalignment(inputName,HPos.LEFT);

        nameField = new TextField();
        nameField.setFont(font);
        nameField.setPrefWidth(70);
        nameField.setAlignment(Pos.CENTER);

        Label inputAge = new Label("Age");
        inputAge.setFont(font);
        GridPane.setHalignment(inputAge, HPos.LEFT);

        ageField = new TextField();
        ageField.setFont(font);
        ageField.setPrefWidth(70);
        ageField.setAlignment(Pos.CENTER);

        Label inputColor = new Label("Favorite color");
        inputColor.setFont(font);
        GridPane.setHalignment(inputColor, HPos.RIGHT);

        colorField = new TextField();
        colorField.setFont(font);
        colorField.setPrefWidth(70);
        colorField.setAlignment(Pos.CENTER);

        Label inputHobby = new Label("Hobby");
        inputHobby.setFont(font);
        GridPane.setHalignment(inputHobby, HPos.RIGHT);

        hobbyField = new TextField();
        hobbyField.setFont(font);
        hobbyField.setPrefWidth(70);
        hobbyField.setAlignment(Pos.CENTER);

        Button print = new Button("Print!");
        print.setOnAction(this::processPrintOut);
        print.setAlignment(Pos.CENTER);
        print.setFont(font);

        setAlignment(Pos.CENTER);
        setHgap(20);
        setVgap(10);
        setStyle("-fx-background-color:lightblue");

        add(print, 2, 0);
        add(result, 4,4);
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
        String name = nameField.getText();
        String age = ageField.getText();
        String color = colorField.getText();
        String hobby = hobbyField.getText();
        result.setText("Your name is " + name + ",\nYou are " + age + " years old.\n Your favorite color is "+ color +
                ".\nYour favorite hobby is "+ hobby + ".");

     }
}
