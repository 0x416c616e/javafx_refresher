import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Hyperlink;
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
        stage.setTitle("Episode 7: CSS");
        stage.setWidth(500);
        stage.setHeight(500);
        VBox root = new VBox();
        Label label1 = new Label("Here is my label");
        label1.setId("idTest");
        Label anotherLabel = new Label("Another one");

        Hyperlink link = new Hyperlink("Testing 123");
        link.setStyle("-fx-background-color: purple; -fx-rotate: 45");
        root.getChildren().addAll(label1, anotherLabel, link);
        Scene scene = new Scene(root);
        scene.getStylesheets().add("css/example2.css");
        scene.getStylesheets().add("css/style.css");
        stage.setScene(scene);
        stage.show();

    }

    @Override
    public void stop() throws Exception {
        super.stop();
    }

    public static void main(String[] args) {
        System.out.println("hi");
        launch(args);
    }
}
