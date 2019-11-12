import javafx.application.Application;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.text.Text;

public class AddAndSubtract extends Application {
    private int count;
    private Text countText;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        count = 50;
        countText = new Text("Count: 50");

        Button pushAdd = new Button("Increment!");
        pushAdd.setOnAction(this::addButtonPress);

        Button pushSubtract = new Button("Decrement!");
        pushSubtract.setOnAction(this::subtractButtonPress);

        FlowPane pane = new FlowPane(countText, pushAdd, pushSubtract);
        pane.setAlignment(Pos.CENTER);
        pane.setHgap(20);
        pane.setStyle("-fx-background-color: green");

        Scene scene = new Scene(pane, 300, 100);

        primaryStage.setTitle("Increment and Decrement");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    private void addButtonPress (ActionEvent event1){
        count++;
        countText.setText("Count: " + count);
    }

    private void subtractButtonPress (ActionEvent event2){
        count--;
        countText.setText("Count: " + count);
    }
}
