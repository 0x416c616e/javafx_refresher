import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

    //runs before the window is closed
    @Override
    public void init() throws Exception {
        super.init();
    }


    //window stuff
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Hello, world!!!!!!!");
        stage.show();

        Stage stage2 = new Stage();
        stage2.setTitle("Second window");
        stage2.show();
    }


    //runs after the window is closed
    @Override
    public void stop() throws Exception {
        super.stop();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
