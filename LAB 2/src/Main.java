import views.*;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

    private Stage window;

    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;
        window.setTitle("Video Library System");

        // Start at Main Menu (Departments)
        window.setScene(new MainMenuView(window).getScene());
        window.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}