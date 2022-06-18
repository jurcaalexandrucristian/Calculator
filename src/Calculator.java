import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Calculator extends Application {
    private double x, y;

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("res/main.fxml"));
        Scene scene = new Scene(root);
        scene.getStylesheets().add("res/main.css");
        scene.setOnMousePressed((event) -> {
            x = event.getSceneX() - scene.getX();
            y = event.getSceneY() - scene.getY();
        });
        scene.setOnMouseDragged((event) -> {
            stage.setX(event.getScreenX() - x);
            stage.setY(event.getScreenY() - y);
        });
        stage.setResizable(false);
        stage.setTitle("Calculator");
        stage.getIcons().add(new Image("res/img/math.png"));
        stage.setScene(scene);
        stage.initStyle(StageStyle.TRANSPARENT);
        stage.show();
    }

    public static void main(String[] args) throws Exception {
        Application.launch(args);
    }
}
