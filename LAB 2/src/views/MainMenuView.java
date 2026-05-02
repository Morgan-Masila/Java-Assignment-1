package views;

import javafx.geometry.*;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class MainMenuView {

    private Stage window;

    public MainMenuView(Stage window) {
        this.window = window;
    }

    public Scene getScene() {

        Label title = new Label("VIDEO LIBRARY SYSTEM");
        title.setStyle("-fx-font-size: 28px; -fx-font-weight: bold;");

        // Department buttons (BIG + CENTERED)
        Button genres = createButton("Genres");
        Button movies = createButton("Movies");
        Button customers = createButton("Customers");
        Button rentals = createButton("Rentals");

        genres.setOnAction(e -> window.setScene(new GenresView(window).getScene()));
        movies.setOnAction(e -> window.setScene(new MoviesView(window).getScene()));
        customers.setOnAction(e -> window.setScene(new CustomersView(window).getScene()));
        rentals.setOnAction(e -> window.setScene(new RentalsView(window).getScene()));

        VBox layout = new VBox(20, title, genres, movies, customers, rentals);
        layout.setAlignment(Pos.CENTER);
        layout.setPadding(new Insets(20));

        return new Scene(layout, 900, 600);
    }

    private Button createButton(String text) {
        Button b = new Button(text);
        b.setPrefSize(250, 70);
        b.setStyle("""
            -fx-font-size: 18px;
            -fx-background-color: #2E7D32;
            -fx-text-fill: white;
        """);
        return b;
    }
}