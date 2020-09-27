import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Hyperlink;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void init() throws Exception {
        super.init();
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Following the tutorial about hyperlinks");
        stage.setWidth(700);
        stage.setHeight(700);

        VBox root = new VBox();
        Hyperlink link = new Hyperlink("example link");
        link.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("using an event handler instead of a lambda");
            }
        });
        root.getChildren().add(link);
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void stop() throws Exception {
        super.stop();
    }

    public static void main(String[] args) {
        System.out.println("Hello world");
        launch();
    }
}
