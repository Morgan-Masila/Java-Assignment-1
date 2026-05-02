package views;

import javafx.geometry.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class GenresView {

    private Stage window;

    public GenresView(Stage window) {
        this.window = window;
    }

    public Scene getScene() {

        Label title = new Label("GENRES MODULE");
        title.setStyle("-fx-font-size: 24px; -fx-font-weight: bold;");

        TextField genreName = new TextField();
        genreName.setPromptText("Enter Genre Name");
        genreName.setPrefHeight(45);

        Button save = styledButton("Save Genre");
        Button back = backButton();

        back.setOnAction(e -> window.setScene(new MainMenuView(window).getScene()));

        VBox layout = new VBox(2, title, genreName, save, back);
        layout.setAlignment(Pos.CENTER);
        layout.setPadding(new Insets(20));

        return new Scene(layout, 900, 600);
    }

    private Button styledButton(String text) {
        Button b = new Button(text);
        b.setPrefSize(200, 45);
        b.setStyle("-fx-background-color:#1976D2; -fx-text-fill:white;");
        return b;
    }

    private Button backButton() {
        Button b = new Button("Back");
        b.setStyle("-fx-background-color:#D32F2F; -fx-text-fill:white;");
        return b;
    }
}