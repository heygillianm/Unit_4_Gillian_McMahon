import javafx.event.ActionEvent;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.control.Button;
import javafx.scene.text.*;
import javafx.scene.shape.*;

public class PigGameGUI extends GridPane {
    private Text player;
    private Text die_1;
    private Text die_2;
    private Text score;
    private Text gameBox = new Text();
    private PigTheGame game;

    public PigGameGUI(){
        Font font = new Font(14);
        Font titleFont = new Font(24);
        Font updateFont = titleFont.font("Times New Roman", FontWeight.BOLD, 24);

        Label title = new Label("Pig Die");
        title.setFont(updateFont);
        GridPane.setHalignment(title, HPos.CENTER);

        gameBox.setFont(font);

        die_1 = new Text();
        die_1.setFont(font);

        die_2 = new Text();
        die_2.setFont(font);

        player = new Text();
        player.setFont(font);

        score = new Text();
        score.setFont(font);

        Rectangle background1 = new Rectangle(3,3,300,100);
        background1.setFill(Color.FLORALWHITE);

        Button rollButton = new Button("Roll");
        rollButton.setOnAction(this::turn);
        rollButton.setAlignment(Pos.TOP_RIGHT);
        rollButton.setFont(font);

        Button passButton = new Button("Pass turn");
        passButton.setOnAction(this::passTurn);
        passButton.setAlignment(Pos.TOP_CENTER);
        passButton.setFont(font);

        Button printAPig = new Button("Print A Pig!");
        printAPig.setOnAction(this::pig);
        printAPig.setAlignment(Pos.TOP_LEFT);
        printAPig.setFont(font);

        setAlignment(Pos.CENTER);
        setHgap(20);
        setVgap(10);
        setStyle("-fx-background-color:lightpink");

        add(title,0,0);
        add(die_1, 0, 2);
        add(die_2, 0, 4);
        add(player, 0, 5);
        add(rollButton, 0,1);
        add(passButton, 0,2);
        add(printAPig, 0, 3);
        add(score, 0, 3);
        add(background1, 0,4);
        add(gameBox, 0,4);

    }

    public void turn(ActionEvent event){
        //game.start();
        gameBox.setText("Rolls stuff and figures out if it's one.");
    }
    public void passTurn(ActionEvent event){
        //game.start();
        gameBox.setText("Next player.");
    }

    public void pig(ActionEvent event){
        gameBox.setText("(´・(oo)・｀)");
    }
}
