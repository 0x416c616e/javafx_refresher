import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void init() throws Exception {
        super.init();
        System.out.println("Happens before the window is opened");
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Hello");
        stage.show();

    }

    @Override
    public void stop() throws Exception {
        super.stop();
        System.out.println("Happens after the window is closed");
    }

    public static void main(String[] args) {
        System.out.println("Hello world");
        launch();
    }
}
