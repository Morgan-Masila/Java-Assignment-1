package views;

import javafx.geometry.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class CustomersView {

    private Stage window;

    public CustomersView(Stage window) {
        this.window = window;
    }

    public Scene getScene() {

        Label title = new Label("CUSTOMERS MODULE");
        title.setStyle("-fx-font-size: 24px; -fx-font-weight: bold;");

        TextField name = new TextField();
        name.setPromptText("Full Name");
        name.setPrefWidth(100);
        name.setPrefHeight(35);

        Button register = button("Register");
        Button back = backButton();

        back.setOnAction(e -> window.setScene(new MainMenuView(window).getScene()));

        VBox layout = new VBox(8, title, name, register, back);
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