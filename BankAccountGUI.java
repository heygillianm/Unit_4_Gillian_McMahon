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
    private TextField depositField;//Deposit
    private TextField withdrawField;//Withdraw
    private BankAccount acct;

    public BankAccountGUI(){
        Font font = new Font(14);
        Font titleFont = new Font(24);
        Font updateFont = titleFont.font("Verdana", FontWeight.BOLD, 24);

        Label title = new Label("USAA");
        title.setFont(updateFont);
        GridPane.setHalignment(title, HPos.CENTER);

        Label slogan = new Label("We know what it means to serve");
        slogan.setFont(font);
        GridPane.setHalignment(slogan, HPos.CENTER);

        accountBox.setFont(font);

        //Username and Pin
        Label inputUser = new Label("Username");
        inputUser.setFont(font);
        GridPane.setHalignment(inputUser, HPos.LEFT);

        username = new TextField();
        username.setFont(font);
        username.setPrefWidth(70);
        username.setAlignment(Pos.TOP_LEFT);

        Label inputPIN = new Label("Pin Number");
        inputPIN.setFont(font);
        GridPane.setHalignment(inputPIN, HPos.LEFT);

        pin = new TextField();
        pin.setFont(font);
        pin.setPrefWidth(70);
        pin.setAlignment(Pos.TOP_LEFT);

        //Deposit and withdrawl

        Label depLabel = new Label("Deposit");
        depLabel.setFont(font);
        GridPane.setHalignment(depLabel, HPos.LEFT);

        Button depositButton = new Button("Deposit");
        depositButton.setOnAction(this::deposit);
        depositButton.setAlignment(Pos.TOP_RIGHT);
        depositButton.setFont(font);

        depositField = new TextField();
        depositField.setFont(font);
        depositField.setPrefWidth(70);
        depositField.setAlignment(Pos.TOP_RIGHT);

        Label withLabel = new Label("Withdrawl");
        withLabel.setFont(font);
        GridPane.setHalignment(withLabel, HPos.LEFT);

        Button withdrawButton = new Button("Withdrawl");
        withdrawButton.setOnAction(this::withdraw);
        withdrawButton.setAlignment(Pos.TOP_RIGHT);
        withdrawButton.setFont(font);

        withdrawField = new TextField();
        withdrawField.setFont(font);
        withdrawField.setPrefWidth(70);
        withdrawField.setAlignment(Pos.TOP_RIGHT);

        //Create an Account
        Button login = new Button("Login");
        login.setOnAction(this::processAccount);
        login.setAlignment(Pos.BASELINE_LEFT);
        login.setFont(font);

        //Check Balance
        Button checkAmt = new Button ("Check Balance");
        checkAmt.setOnAction(this::processAmount);
        checkAmt.setAlignment(Pos.BASELINE_RIGHT);
        checkAmt.setFont(font);

        setAlignment(Pos.CENTER);
        setHgap(20);
        setVgap(10);
        setStyle("-fx-background-color:lightblue");

        add (title, 0,0);
        add (slogan, 3,0);
        add (inputUser, 0,1);
        add (inputPIN, 0, 3);
        add (username, 0,2);
        add (pin, 0,4);
        add (login, 0,5);
        add (depLabel, 3, 1);
        add (depositButton, 3, 3);
        add (depositField, 3, 2);
        add (withLabel, 3, 4);
        add (withdrawButton, 3, 6);
        add (withdrawField, 3, 5);
        add (checkAmt, 3,7);
        add (accountBox, 0,8);
    }

    public void deposit(ActionEvent event){
        acct.Deposit(Double.parseDouble(depositField.getText()));
        accountBox.setText("You deposited " + depositField.getText() + " dollars.\nYour current balance is " + acct.getBalance());
    }

    public void withdraw(ActionEvent event){
        acct.withdrawl(Double.parseDouble(withdrawField.getText()));
        accountBox.setText("You withdrew " + withdrawField.getText() + " dollars.\nYour current balance is " + acct.getBalance());
    }

    public void processAccount(ActionEvent event){
        String name = username.getText();
        String pinNumber = pin.getText();
        acct = new BankAccount("Gillian", "USAA", "Checking",100, 0.02);
        accountBox.setText("Username: " + name + "\nPIN number: " + pinNumber);
    }

    public void processAmount(ActionEvent event){
        accountBox.setText("Your balance is " + acct.getBalance());
    }
}
