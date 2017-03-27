package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

        // Panes
        BorderPane bp = new BorderPane();
        bp.setPadding(new Insets(20, 50, 50, 50));

        GridPane gp = new GridPane();

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
        bp.setTop(boxTop);

        // Adding labels to Center BorderPane
        gpBox.getChildren().addAll(navn, stilling, tlf, adresse, email);
        bp.setCenter(gpBox);



        // --------- Random shit ------------
        primaryStage.setTitle("Roskilde Børnehave");
        primaryStage.setScene(new Scene(bp, 500, 300));
        primaryStage.show();
    }

}
