import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void init() throws Exception {
        super.init();
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("java 11 test");
        stage.show();
    }

    @Override
    public void stop() throws Exception {
        super.stop();
    }

    public static void main(String[] args) {
        System.out.println("java 11 test");
        launch();
    }
}
