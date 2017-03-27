package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Reflection;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {
    BorderPane bpApp = new BorderPane();
    Scene sceneApp = new Scene(bpApp, 500, 350);

    String adminUser = "admin";
    String adminPw = "admin";

    String user = "user";
    String pw = "user";

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

        int succes = 0;

        // -------- Login Screen -------
        // BorderPane
        BorderPane bpLogin = new BorderPane();
        bpLogin.setPadding(new Insets(10, 50, 50, 50));
        bpLogin.setId("bp");

        // HBox
        HBox hbox = new HBox();
        hbox.setPadding(new Insets(20, 30, 30, 30));

        // GridPane
        GridPane gp = new GridPane();
        gp.setVgap(5);
        gp.setHgap(5);
        gp.setPadding(new Insets(25, 25, 25, 25));
        gp.setPadding(new Insets(20, 20, 20, 20));

        // Nodes for GridPane
        Label lblUsername = new Label("Username: ");
        TextField txtUserName = new TextField();
        Label lblPassword = new Label("Password: ");
        PasswordField pf = new PasswordField();
        Label lblMessage = new Label();
        Button login = new Button("Login");
        login.setId("login");
        login.setOnAction(e -> {
            if (!pf.getText().equals(adminPw) && !txtUserName.getText().equals(adminUser)) {
                lblMessage.setText("Your password is incorrect!");
            } else {
                lblMessage.setText("Your password has been confirmed.");
                primaryStage.setScene(sceneApp);
            }
        });


        // Adding to GridPane
        gp.add(lblUsername, 0, 0);
        gp.add(txtUserName, 1, 0);
        gp.add(lblPassword, 0, 1);
        gp.add(pf, 1, 1);
        gp.add(login, 2, 1);
        gp.add(lblMessage, 1, 2);

        // Reflection
        Reflection ref = new Reflection();
        ref.setFraction(0.7f);
        gp.setEffect(ref);

        // Dropshadow
        DropShadow ds = new DropShadow();
        ds.setOffsetX(5);
        ds.setOffsetY(5);

        // Text and dropshadow
        Text text = new Text("ROSKIIIIIILLLDEEEEE");
        text.setFont(Font.font("Papyrus", FontWeight.BOLD, 28));
        text.setEffect(ds);
        text.setId("text");
        hbox.getChildren().addAll(text);

        // Adding GridPane and HBox to BorderPane
        bpLogin.setTop(hbox);
        bpLogin.setCenter(gp);

        //bp.getStylesheets().add("/style.css");
        Scene sceneLogin = new Scene(bpLogin);
        sceneLogin.getStylesheets().add(getClass().getClassLoader().getResource("style.css").toExternalForm());


        // ------ App ------
        // Panes

        bpApp.setPadding(new Insets(20, 50, 50, 50));

        //GridPane gp = new GridPane();

        // Boxes
        HBox boxTop = new HBox();
        //bp.setAlignment(boxTop, Pos.TOP_CENTER);
        boxTop.setSpacing(15);
        boxTop.setAlignment(Pos.TOP_CENTER);

        HBox gpBox = new HBox();
        gpBox.setPadding(new Insets(10, 0, 0, 0));
        gpBox.setSpacing(25);
        gpBox.setAlignment(Pos.TOP_CENTER);

        // ------- Implementing Nodes -------
        // Buttons
        Button ansatteOversigt = new Button("Ansatte");
        Button boernOversigt = new Button("Børn");
        Button vagtplanOversigt = new Button("Vagtplan");
        Button logud = new Button("Log ud");

        // Labels
        Label navn = new Label("Navn");
        Label stilling = new Label("Stilling");
        Label tlf = new Label("Tlf");
        Label adresse = new Label("Adresse");
        Label email = new Label("Email");

        // -------- Adding nodes --------
        // Adding buttons to Top BorderPane
        boxTop.getChildren().addAll(ansatteOversigt, boernOversigt, vagtplanOversigt, logud);
        bpApp.setTop(boxTop);

        // Adding labels to Center BorderPane
        gpBox.getChildren().addAll(navn, stilling, tlf, adresse, email);
        bpApp.setCenter(gpBox);



        primaryStage.setTitle("Roskilde Børnehave");
        primaryStage.setScene(sceneLogin);
        primaryStage.show();

    }
}
