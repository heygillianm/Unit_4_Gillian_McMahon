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

public class BankAccountGUI extends GridPane {
    private TextField username;//User Name
    private TextField pin;//PIN Number
    private Text accountBox = new Text();//Account Box
    private TextField deposit;//Deposit
    private TextField withdrawl;//Withdraw
    private TextField checkBalance;//Check Balance
    private TextField newAcct;//Create Account
    private TextField amount;//Amount
    private BankAccount acct;

    public BankAccountGUI(){
        Font font = new Font(14);

        Label inputUser = new Label("Username: ");


        public void deposit(){
            acct.Deposit();
        }
    }
}
