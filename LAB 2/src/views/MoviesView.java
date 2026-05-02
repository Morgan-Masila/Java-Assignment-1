package views;  

import javafx.geometry.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class MoviesView {

    private Stage window;

    public MoviesView(Stage window) {
        this.window = window;
    }

    public Scene getScene() {

        Label title = new Label("MOVIES MODULE");
        title.setStyle("-fx-font-size: 24px; -fx-font-weight: bold;");

        ComboBox<String> genre = new ComboBox<>();
        genre.getItems().addAll("Action", "Comedy", "Drama");
        genre.setPromptText("Select Genre");
        genre.setPrefHeight(45);

        TextField movieTitle = new TextField();
        movieTitle.setPromptText("Movie Title");
        movieTitle.setPrefHeight(45);

        Button add = button("Add Movie");
        Button back = backButton();

        back.setOnAction(e -> window.setScene(new MainMenuView(window).getScene()));

        VBox layout = new VBox(15, title, genre, movieTitle, add, back);
        layout.setAlignment(Pos.CENTER);

        return new Scene(layout, 900, 600);
    }

    private Button button(String text) {
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