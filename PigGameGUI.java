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

public class PigGameGUI extends GridPane {
    private TextField player;
    private TextField die_1;
    private TextField die_2;
    private TextField score;
    private Text gameBox = new Text();
    private PigTheGame game;

    public PigGameGUI(){
        Font font = new Font(14);
        Font titleFont = new Font(24);
        Font updateFont = titleFont.font("Verdana", FontWeight.BOLD, 24);

        Label title = new Label("Pig Die");
        title.setFont(updateFont);
        GridPane.setHalignment(title, HPos.CENTER);

        gameBox.setFont(font);

        //dice
        Label die1 = new Label("Roll 1: ");
        die1.setFont(font);
        GridPane.setHalignment(die1, HPos.LEFT);

        die_1 = new TextField();
        die_1.setFont(font);
        die_1.setPrefWidth(70);
        die_1.setAlignment(Pos.TOP_LEFT);

        Label die2 = new Label("Roll 2: ");
        die2.setFont(font);
        GridPane.setHalignment(die2, HPos.LEFT);

        die_2 = new TextField();
        die_2.setFont(font);
        die_2.setPrefWidth(70);
        die_2.setAlignment(Pos.TOP_LEFT);

        player = new TextField();
        player.setFont(font);
        player.setPrefWidth(70);
        player.setAlignment(Pos.CENTER_LEFT);

        score = new Text();
        score.setFont(font);
        score.setPrefWidth(70);
        score.setAlignment(Pos.BOTTOM_RIGHT);

        Button rollButton = new Button("Roll");
        rollButton.setOnAction(this::turn);
        rollButton.setAlignment(Pos.TOP_RIGHT);
        rollButton.setFont(font);

        Button passButton = new Button("Pass turn");
        passButton.setOnAction(this::turn);
        passButton.setAlignment(Pos.TOP_RIGHT);
        passButton.setFont(font);

        setAlignment(Pos.CENTER);
        setHgap(20);
        setVgap(10);
        setStyle("-fx-background-color:lightpink");

        add(title,0,0);
        add(die1, 0,1);
        add(die_1, 0, 2)
        add(die2, 0, 3);
        add(die_2, 0, 4);
        add(player, 0, 5);
        add(rollButton, 3,1);
        add(passButton, 3,2);
        add(score, 3, 3);
        add(gameBox, 4,1);

    }

    public void turn(ActionEvent event){
        game.
    }
}
