import javafx.application.Application;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void init() throws Exception {
        super.init();
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Episode 4 of tutorials");
        stage.setWidth(400);
        stage.setHeight(500);

        VBox parent = new VBox();
        Scene scene1 = new Scene(parent);
        scene1.setCursor(Cursor.WAIT);
        stage.setScene(scene1);
        Label label1 = new Label("This is my label");
        Label label2 = new Label("This is the second label");

        //how to add one thing at a time:
        //parent.getChildren().add(label1);

        //how to add multiple things at a time:
        parent.getChildren().addAll(label1, label2);

        //

        stage.show();
    }

    @Override
    public void stop() throws Exception {
        super.stop();
    }

    public static void main(String[] args) {
        launch();
    }
}
