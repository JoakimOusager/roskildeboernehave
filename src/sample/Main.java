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
        bp.setPadding(new Insets(50, 50, 50, 50));





        GridPane gp = new GridPane();

        // Boxes
        HBox boxTop = new HBox();
        //bp.setAlignment(boxTop, Pos.TOP_CENTER);
        box

        boxTop.setAlignment(Pos.TOP_CENTER);


        HBox gpBox = new HBox();


        // ------- Implementing Nodes -------

        // Buttons
        Button ansatteOversigt = new Button("Ansatte");
        Button boernOversigt = new Button("Børn");
        Button vagtplanOversigt = new Button("Vagtplan");
        Button logud = new Button("Log ud");

        // Labels
        Label navn = new Label();
        Label stilling = new Label();
        Label tlf = new Label();
        Label adresse = new Label();
        Label email = new Label();

        boxTop.getChildren().addAll(ansatteOversigt, boernOversigt, vagtplanOversigt, logud);
        bp.setTop(boxTop);

        primaryStage.setTitle("Roskilde Børnehave");
        primaryStage.setScene(new Scene(bp, 500, 300));
        primaryStage.show();
    }

}
