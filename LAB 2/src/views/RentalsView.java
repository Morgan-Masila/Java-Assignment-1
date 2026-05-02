package views;

import javafx.geometry.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class RentalsView {

    private Stage window;

    public RentalsView(Stage window) {
        this.window = window;
    }

    public Scene getScene() {

        Label title = new Label("RENTALS MODULE");
        title.setStyle("-fx-font-size: 24px; -fx-font-weight: bold;");

        ComboBox<String> customer = new ComboBox<>();
        customer.setPromptText("Customer");

        ComboBox<String> genre = new ComboBox<>();
        genre.setPromptText("Genre");

        ComboBox<String> movie = new ComboBox<>();
        movie.setPromptText("Movies");

        Button save = button("Save Rental");
        Button back = backButton();

        back.setOnAction(e -> window.setScene(new MainMenuView(window).getScene()));

        VBox layout = new VBox(15, title, customer, genre, movie, save, back);
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