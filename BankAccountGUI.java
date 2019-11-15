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

    public BankAccountGUI(){
        //User Name
        //PIN Number
        //Account Box
        //Deposit
        //Withdraw
        //Check Balance
        //Create Account
        //Amount
        private BankAccount acct;

        public void deposit(){
            acct.Deposit();
        }
    }
}
